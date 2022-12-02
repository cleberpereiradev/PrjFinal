import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TelaPrjFinal extends JFrame implements ActionListener {
    protected Dimension dFrame, dLabel, dTextField, dButton, dTextArea;
    protected Label lblCodigo, lblNome, lblSetor, lblSalario, lblRecInss;
    protected Button btnSalvar, btnExcluir, btnCalcular, btnCarregar, btnSair;
    protected TextField txtCodigo, txtNome, txtSetor, txtSalario, txtRecInss;
    protected JTable tabela;
    protected JScrollPane barraRolagem;
    protected JPanel painelConteudo;
    GerenciarEmpregado gerencia = new GerenciarEmpregado();


    Object[][] dados = {};
    String[] colunas = {"Codigo","Nome","Setor","Salario","RecInss"};

    public TelaPrjFinal(){




        painelConteudo = new JPanel();
        painelConteudo.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(painelConteudo);
        painelConteudo.setLayout(null);

        dFrame = new Dimension(400,400);
        dLabel = new Dimension(100,20);
        dTextField = new Dimension(150,20);
        dButton = new Dimension(80,20);



        //Estrutura da tela
        setTitle("Gerenciamento de Funcionários");
        setResizable(false);
        setSize(dFrame);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Campos da tela
        lblCodigo = new Label("Código: ",1);
        lblCodigo.setSize(dLabel);
        lblCodigo.setLocation(10,20);
        add(lblCodigo);

        txtCodigo = new TextField(null);
        txtCodigo.setSize(dTextField);
        txtCodigo.setLocation(130,20);
        add(txtCodigo);

        btnCarregar = new Button("Carregar");
        btnCarregar.setSize(dButton);
        btnCarregar.setLocation(290,20);
        add(btnCarregar);


        lblNome = new Label("Nome: ",1);
        lblNome.setSize(dLabel);
        lblNome.setLocation(10,50);
        add(lblNome);

        txtNome = new TextField(null);
        txtNome.setSize(dTextField);
        txtNome.setLocation(130,50);
        add(txtNome);


        lblSetor = new Label("Setor: ",1);
        lblSetor.setSize(dLabel);
        lblSetor.setLocation(10,80);
        add(lblSetor);

        txtSetor = new TextField(null);
        txtSetor.setSize(dTextField);
        txtSetor.setLocation(130,80);
        add(txtSetor);


        lblSalario = new Label("Salário: ",1);
        lblSalario.setSize(dLabel);
        lblSalario.setLocation(10,110);
        add(lblSalario);

        txtSalario = new TextField(null);
        txtSalario.setSize(dTextField);
        txtSalario.setLocation(130,110);
        add(txtSalario);


        lblRecInss = new Label("Contribuição Inss: ",1);
        lblRecInss.setSize(dLabel);
        lblRecInss.setLocation(10,140);
        add(lblRecInss);

        txtRecInss = new TextField(null);
        txtRecInss.setSize(dTextField);
        txtRecInss.setLocation(130,140);
        add(txtRecInss);

        btnSalvar = new Button("Salvar");
        btnSalvar.setSize(dButton);
        btnSalvar.setLocation(20,170);
        btnSalvar.addActionListener(this);
        add(btnSalvar);

        btnExcluir = new Button("Excluir");
        btnExcluir.setSize(dButton);
        btnExcluir.setLocation(110,170);
        add(btnExcluir);

        btnCalcular = new Button("Calcular Inss");
        btnCalcular.setSize(dButton);
        btnCalcular.setLocation(200,170);
        add(btnCalcular);

        btnSair = new Button("Sair");
        btnSair.setSize(dButton);
        btnSair.setLocation(290,170);
        btnSair.addActionListener(this);
        add(btnSair);

        tabela = new JTable(dados,colunas);
        barraRolagem = new JScrollPane(tabela);
        barraRolagem.setBounds(10,220,370,120);
        painelConteudo.add(barraRolagem);


    }

    public void limparCampos(){
        txtCodigo.setText("");
        txtNome.setText("");
        txtSetor.setText("");
        txtSalario.setText("");
    }

    public void atualizaTabela(){

        List<Empregado> listaEmp = new ArrayList<>();
        listaEmp = gerencia.getListaEmpregados();

        int cont = 0;
        for(Empregado emp : listaEmp){

            dados[cont][0] = emp.getCodigoEmpregado();
            dados[cont][1] = emp.getNomeEmpregado();
            dados[cont][2] = emp.getSetor();
            dados[cont][3] = emp.getSalarioBruto();

            System.out.println(emp.getCodigoEmpregado());
            System.out.println(emp.getNomeEmpregado());
            System.out.println(emp.getSetor());
            System.out.println(emp.getSalarioBruto());
            cont++;
        }


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnSair){
            JOptionPane.showMessageDialog(null,"O programa será finalizado!","FIM", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(e.getSource() == btnSalvar){
            gerencia.adicionarEmpregado(Integer.parseInt(txtCodigo.getText()), txtNome.getText(),txtSetor.getText(), Double.parseDouble(txtSalario.getText()));
            limparCampos();
            atualizaTabela();
            JOptionPane.showMessageDialog(null,"Dados salvos com sucesso.","Sucesso!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

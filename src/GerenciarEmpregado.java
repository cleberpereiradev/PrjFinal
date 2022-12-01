import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarEmpregado {
    private static List<Empregado> listaEmpregados = new ArrayList<>();

    public static List<Empregado> getListaEmpregados() {
        return listaEmpregados;
    }

    public void setListaEmpregados(List<Empregado> listaEmpregados) {
        this.listaEmpregados = listaEmpregados;
    }

    public static void adicionarEmpregado(Empregado emp){

        Empregado e = new Empregado();
        Scanner sc = new Scanner(System.in);
        System.out.println("--Adicionar empregado--");
        System.out.println("Insira o código do empregado: ");
        e.setCodigoEmpregado(sc.nextInt());
        System.out.println("Insira o nome do empregado: ");
        e.setNomeEmpregado(sc.nextLine());
        System.out.println("Insira o setor do empregado: ");
        e.setSetor(sc.nextLine());
        System.out.println("Insira o salário bruto do empregado: ");
        e.setSalarioBruto(sc.nextDouble());

        getListaEmpregados().add(e);
    }

    public void removerEmpregado(Empregado e){
        //utilizar .remove
    }

    public void listarEmpregados(){
        //listar empregados utilizando List<Empregado>
    }
    public void verificarExistencia(Empregado e){
        //comparar equals codigo empregado
        for(Object empregado : listaEmpregados){
            if (getCodigoEmpregado().equals)
        }
    }

}

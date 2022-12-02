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

    public static void adicionarEmpregado(int codigo,String nome, String setor, double salarioBruto){

        Empregado emp = new Empregado();
        emp.setCodigoEmpregado(codigo);
        emp.setNomeEmpregado(nome);
        emp.setSetor(setor);
        emp.setSalarioBruto(salarioBruto);

        getListaEmpregados().add(emp);
    }

    public void removerEmpregado(Empregado e){
        //utilizar .remove
    }

    public void listarEmpregados(){
        //listar empregados utilizando List<Empregado>

    }

    public void verificarExistencia(Empregado e){
        //comparar equals codigo empregado
    }

}

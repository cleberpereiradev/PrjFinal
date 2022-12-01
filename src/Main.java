public class Main {
    public static void main(String[] args) {

        ParametrosInss.mostrarVetor();
        Empregado emp = new Empregado();
        GerenciarEmpregado.adicionarEmpregado(emp);
        System.out.println(GerenciarEmpregado.getListaEmpregados());
    }
}

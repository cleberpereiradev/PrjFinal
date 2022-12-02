public class ParametrosInss {
    public static final double [] faixa = new double[4];
    public static final double [] limiteFaixa = new double[4];





    public static void mostrarVetor() {
        for(double itens : faixa){
            System.out.println(itens);
        }

        for(double item : limiteFaixa){
            System.out.println(item);
        }
    }


    public static double calcularInss(double salarioBruto){
        double calculaRecInss = 0;

        for(int i = 0; i < limiteFaixa.length; i++){
            if (salarioBruto > limiteFaixa[i] && i == 0){
                calculaRecInss = limiteFaixa[i] + (limiteFaixa[i] * faixa[i]);
            } else if (salarioBruto > limiteFaixa[i]) {
                calculaRecInss = faixa[i] * (limiteFaixa[i] - limiteFaixa[i-1]);
                calculaRecInss += calculaRecInss;
            }
            else if(salarioBruto > limiteFaixa[3]){
                calculaRecInss = faixa[i] * (limiteFaixa[i] - limiteFaixa[i-1]);
                calculaRecInss += calculaRecInss;

            }
        }
            return calculaRecInss;
    }



}

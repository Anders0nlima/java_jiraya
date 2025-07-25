package assuntos.estruturaDeRepeticao;

public class exercicio2 {
    public static void main(String[] args) {
        int valorCarro = 50000;

        for(int parcela = 1; parcela <= valorCarro; parcela++){
            double valorParcela = valorCarro/parcela;
            if(valorParcela >= 1000){
                System.out.println("parcela "+parcela+ " R$ " + valorParcela);
            } else{
                break;
            }
            System.out.println("esse codigo sera executado por causa do break");
        }
    }
}

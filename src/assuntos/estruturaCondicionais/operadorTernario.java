package assuntos.estruturaCondicionais;

public class operadorTernario {
    public static void main(String[] args) {
        double salario = 2000;
        String mensagemDoar = "doação permitida";
        String mensagemNaoDoar = "doação negada";
        // String resultado = (condição) ? verdadeira : falsa;
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

//        if(salario > 5000){
//            resultado = mensagemDoar;
//        } else{
//            resultado = mensagemNaoDoar;
//        }
//
//        System.out.println(resultado);
    }
}

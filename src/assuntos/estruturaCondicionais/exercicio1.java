package assuntos.estruturaCondicionais;

public class exercicio1 {
    public static void main(String[] args) {
        double salario = 6000.0;
        double novaSalario;

       if (salario <= 1200){
           novaSalario = salario*0.9;
           System.out.println("taxa 10%: " + novaSalario);
       } else if(salario <= 3000){
           novaSalario = salario*0.8;
           System.out.println("taxa 20%: " + novaSalario);
       }else{
           novaSalario = salario*0.7;
           System.out.println("taxa 30%: " + novaSalario);
       }
    }
}

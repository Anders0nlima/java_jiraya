package assuntos.estruturaCondicionais;

public class exercicio2 {
    public static void main(String[] args) {
        int dia = 7;

        switch (dia){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("opção invalida");
        }

        if(dia == 1 || dia == 7){
            System.out.println("final de semana");
        } else{
            System.out.println("dia util");
        }
    }
}

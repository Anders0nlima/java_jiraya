package assuntos.estruturaDeRepeticao;

public class whileDowhileFor {
    public static void main(String[] args) {
        int cont = 0;
        while (cont < 10) {
            System.out.println(cont);
            cont += 1;
        }

        int cont1 = 0;
        do{
            System.out.println(cont1);
            cont1 += 1;
        } while (cont1 < 10);


        for(int cont2 = 0; cont2 < 10; cont2++){
            System.out.println(cont2);
        }

    }
}

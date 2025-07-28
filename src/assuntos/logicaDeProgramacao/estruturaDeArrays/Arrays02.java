package assuntos.logicaDeProgramacao.estruturaDeArrays;

public class Arrays02 {
    public static void main(String[] args) {
        String[] nome = new String[4];

        nome[0] = "ander";
        nome[1] = "clara";
        nome[2] = "leti";

        for(int i = 0; i < nome.length; i++){
            System.out.println(nome[i]);
        }
    }
}

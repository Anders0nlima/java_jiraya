package assuntos.logicaDeProgramacao.estruturaDeArrays;

public class ArraysInicializarMuldidicionais {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];


        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[6];

        for(int[] i: arrayInt){
            System.out.println("\n-----");
            for(int j: i){
                System.out.println(j + " ");
            }
        }
    }
}

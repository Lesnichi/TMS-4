import java.util.Random;

public class ClassWork2 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        int composition1 = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    composition1 *= array[i][j];
                }
            }
        }
        System.out.println("Произведение элементов главной диагонали = " + composition1);

        int composition2 = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == array[i].length - j - 1)
                {
                    composition2 *= array[i][j];
                }
            }
        }
        System.out.println("Произведение элементов побочной диагонали = " + composition2);
    }
}

import java.util.Random;

public class ClassWork3 {
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

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i >= j) {
                    if (array[i][j] % 2 != 0) {
                        sum = sum + array[i][j];
                    }
                }
            }
        }
        System.out.println("Сумма нечетных элементов под главной диагональю включительно = " + sum);


    }
}

import java.util.Random;

public class ClassWork1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(101);
            }
        }

        ClassWork5.print(array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    if (array[i][j] % 2 == 0) {
                        sum = sum + array[i][j];
                    }
                }
            }
        }
        System.out.println("Сумма четных элементов главной диагонали = " + sum);


    }
}

import java.util.Random;

public class ClassWork5 {
    public static void main(String[] args) {
        int[][] array = new int[2][2];
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

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        print(array);
    }

    public static void print(int[][] array) {
        System.out.println();
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int i = 0; accounts.length >= i; i++){
            for (int i = 0; i <= accounts[i].length; i++)
                result += accounts[i][j];
        }
        return result;
    }
}

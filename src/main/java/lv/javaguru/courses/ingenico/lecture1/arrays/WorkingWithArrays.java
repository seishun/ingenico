package lv.javaguru.courses.ingenico.lecture1.arrays;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class WorkingWithArrays {

    public static void main(String[] args) {
        int[][] array = new int[3][3];
        randomlyFillArray(array);
        Arrays.sort(array);
        for (int[] ints : array) {
            for (int i : ints) {
                System.out.println(i);
            }
        }

    }

    private static void randomlyFillArray(int[][] array){
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = secureRandom.nextInt(100);
            }
        }
    }

}

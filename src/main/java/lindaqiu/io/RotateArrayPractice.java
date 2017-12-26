package lindaqiu.io;

import java.util.Arrays;

public class RotateArrayPractice {

//[1,2,3,4,5,6] rotated by two becomes [3,4,5,6,1,2]

    public static void main(String[] args) {
        RotateArrayPractice rotateRotate = new RotateArrayPractice();
        System.out.println(Arrays.toString(rotateRotate.shiftElements(new int[]{1,2,3,4,5,6}, 2)));
    }

    public static int[] shiftElements(int[] array, int shiftAmount) {

        for (int j = 0; j < shiftAmount; j++) {
            int a = array[0];
            int i;
            for (i = 0; i < array.length - 1; i++)
                array[i] = array[i + 1];
                array[i] = a;
        }

        return array;
    }
}
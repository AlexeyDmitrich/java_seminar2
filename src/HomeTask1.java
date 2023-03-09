import java.util.Arrays;

public class HomeTask1 {
    public static void main(String[] args) {
        int length = input.Int("Задайте длину массива:\n");
        int[] usersArray = fillArray(new int[length]);
        int[] newArr = sortArray(usersArray);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] fillArray (int[]usersArray){
        for (int i = 0; i < usersArray.length; i++) {
            usersArray[i] = input.Int("Введите значение:\n");
        }
        return usersArray;
    }

    public static int[] sortArray (int[]unsortedArray){
        int[] sortedArr = unsortedArray;
        int stepUp = unsortedArray[unsortedArray.length-1];
        int stepDown = unsortedArray[0];
        System.out.println(Arrays.toString(unsortedArray));
        int counter=0;
        for (int i = 0; i < unsortedArray.length-1; i++) {
            if (unsortedArray[i]>unsortedArray[i+1]){
                stepUp = unsortedArray[i+1];
                unsortedArray[i+1] = unsortedArray[i];
                unsortedArray[i] = stepUp;
                counter++;
                System.out.println(Arrays.toString(unsortedArray));
            }
            sortedArr[i] = unsortedArray[i];
        }
        if (counter == 0){
            return sortedArr;
        }
        return sortArray(sortedArr);
    }
}

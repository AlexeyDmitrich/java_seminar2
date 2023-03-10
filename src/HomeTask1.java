import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class HomeTask1 {
    public static void main(String[] args) throws IOException {
        int length = input.Int("Задайте длину массива:\n");
        int[] usersArray = fillArray(new int[length]);

        Logger logger = Logger.getLogger(HomeTask1.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler ch = new FileHandler ("log.xml");
        logger.addHandler (ch);
    //    SimpleFormatter sFormat = new SimpleFormatter ();
        XMLFormatter xml = new XMLFormatter();
        ch.setFormatter (xml);

        int[] newArr = sortArray(usersArray, logger);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] fillArray (int[]usersArray){
        for (int i = 0; i < usersArray.length; i++) {
            usersArray[i] = input.Int("Введите значение:\n");
        }
        return usersArray;
    }

    public static int[] sortArray (int[]unsortedArray, Logger logger){

        logger.info("Запускаем сортировку");

        int[] sortedArr = unsortedArray;
        int stepUp;
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
            logger.log(Level.WARNING, Arrays.toString(sortedArr) );
        }
        if (counter == 0){
            return sortedArr;
        }
        return sortArray(sortedArr, logger);
    }
}

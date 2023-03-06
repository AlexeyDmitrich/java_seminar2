import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int users_num = input.nextInt();
        String users_char_1 = input.next();
        String users_char_2 = input.next();
        System.out.println(users_chars(users_char_1,users_char_2,users_num));
    }

    public static String users_chars (String char1, String char2, int string_length){
        StringBuilder users_char = new StringBuilder();
        for (int i = 0; i < string_length/2; i++) {
            users_char.append(char1).append(char2);
            //users_char.append(char2);
        }
        return users_char.toString();
    }
}

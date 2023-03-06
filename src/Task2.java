import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String users_string = input.Str("Введите строку");
        System.out.println(cp866(users_string));
    }

    public static String cp866 (String users_string){
        int counter = 1;
        StringBuilder users_cp866 = new StringBuilder();
        for (int i = 0; i < users_string.length()-1; i++) {
            if (users_string.charAt(i)==users_string.charAt(i+1)){
                counter++;
            }
            else {
                users_cp866.append(users_string.charAt(i));
                if (counter!=1){
                    users_cp866.append(counter);
                    counter = 1;
                }
            }

        }

        users_cp866.append(users_string.charAt(users_string.length()-1));
        if (counter!=1){
            users_cp866.append(counter);
        }

        return users_cp866.toString();
    }
}

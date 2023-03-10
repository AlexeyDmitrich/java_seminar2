public class HomeTask3 {
    //Напишите метод, который принимает на вход строку (String) и определяет, является ли строка палиндромом
    // (возвращает boolean значение). Без встр. функций
    public static void main(String[] args) {
        String usersString = input.Str("Введите строку");
        System.out.println(isPalindrom(usersString));
    }

    public static boolean isPalindrom (String usersString){
        for (int i = 0; i < usersString.length(); i++) {
            if (!(usersString.substring(i,i+1).equals(usersString.substring((usersString.length()-1-i),(usersString.length()-1-i+1))))){
                return false;
            }
        }
        return true;
    }

}

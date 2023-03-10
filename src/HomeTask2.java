import java.io.*;
/*
Дана строка (получение через обычный текстовый файл!!!)

"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
*/
public class HomeTask2 {

    public static void main(String[] args) {
        try {
            System.out.println(readFile("journal.txt"));
        } catch (IOException e) {
            System.out.println("Файл не найден");
            e.getStackTrace();
        }
    }

    public static String readFile (String fileName) throws IOException {
        FileReader rd = new FileReader(fileName);
        BufferedReader bf = new BufferedReader(rd);
        StringBuilder res = new StringBuilder();
        String line;
        while ((line = bf.readLine()) != null){
            res.append(lineParser(line));
            res.append("\n");
        }
        bf.close();
        return res.toString();
    }

    public static String lineParser (String line){
        String[] asCSV = line.split(",");
        String[] asDict = new String[asCSV[0].split(":").length];
        String[][] full = new String[asCSV.length][asDict.length];
        for (int i = 0; i < asCSV.length; i++) {
            asDict = asCSV[i].split(":");
            full[i] = asDict;
        }
        StringBuilder outString = new StringBuilder();
        outString.append("Студент ");
        outString.append((full[0][1]).replace("\"", ""));
        outString.append(" получил ");
        outString.append((full[1][1]).replace("\"", ""));
        outString.append(" по предмету ");
        outString.append((full[2][1]).replace("\"", ""));

        String resString = outString.toString();
//        resString.replace("\"", " ");

        return resString;
    }
}

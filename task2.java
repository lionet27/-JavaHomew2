// Дана строка (получение через обычный текстовый файл!!!)

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class task2 {
    static void PrintRating(String str){
        String [] lines=str.split("[:\",]+");           
        StringBuilder sb=new StringBuilder();
        sb.append("Студент "+lines[2]+" получил "+lines[4]+" по предмету "+lines[6]);
        System.out.println(sb);
    }

    
    public static void main(String[] args) {
        String file_name = "2.txt";
        
        try {
            List<String> lines = Files.readAllLines(Paths.get(file_name));
            String [] stroki=new String[lines.size()];
            lines.toArray(stroki);
            for (String string : stroki) {
                PrintRating(string);;
            }            
        }    
        catch (IOException e) {
            e.printStackTrace();
        }     
                     
    }
}    
        


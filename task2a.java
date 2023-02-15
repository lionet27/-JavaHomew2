// Дана строка (получение через обычный текстовый файл!!!)
// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

import java.io.FileReader;
import java.io.BufferedReader;

public class task2a {
    static void PrintRating(String str){
        String [] lines=str.split("[:\",]+");
           
        StringBuilder sb=new StringBuilder();
        sb.append("Студент "+lines[2]+" получил "+lines[4]+" по предмету "+lines[6]);
        System.out.println(sb);
    }    
    public static void main(String[] args) {
        String file_name = "2.txt";

        try{
            BufferedReader br=new BufferedReader(new FileReader(file_name));
            String str;     

            while ((str=br.readLine())!=null){

                PrintRating(str);
            }

            br.close();    
        }
        catch (Exception e){
                System.out.println("Что то не так");
        }
    }
}      

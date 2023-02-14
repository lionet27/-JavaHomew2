// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
import java.util.Scanner;
public class task3 {
    static boolean Palindrom(String expression){
        StringBuilder sb=new StringBuilder(expression);
        boolean result=sb.toString().equals(sb.reverse().toString());
        return result;
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите строку: ");
        String stroka = sc.nextLine();
        sc.close();
        if (Palindrom(stroka)){
            System.out.println("Это палиндром.");
        }  else{
            System.out.println("Это не палиндром.");
        } 
        
    }
    
}

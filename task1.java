// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл.

import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
        
public class task1 {
    static int[] CreateArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы масива:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt(); 
        }
        sc.close();
        return array;
    }
    static void printArray(int[] array){
        System.out.print ("Вывод элементов массива:");
                for (int i = 0; i < array.length; i++) {
                    System.out.print (" " + array[i]); 
                }
                System.out.println();
            }
    static void Log(String path, int [] array){

        String file_name = path;
        File file = new File(file_name);
        try{
            FileWriter writer = new FileWriter(file,true);
            for (int i = 0; i < array.length; i++){
                writer.write(" " + array[i]);
            }
            writer.write("\n");
            writer.close();
            
        }
        catch (Exception e){
            System.out.println("Что то пошло не так");
        }
    } 
           
    public static void main(String[] args) {
        
        int[] array=CreateArray();
        printArray(array);
        String file_name = "1.txt";
        int temp=0;
        int count=0;
        for (int j=array.length-1;j>=1;j--){
            count=0;
            for (int i=1;i<array.length;i++){
                if(array[i]<array[i-1]){
                    temp=array[i];
                    array[i]=array[i-1];
                    array[i-1]=temp;
                    count++;
                }
            }
            Log(file_name, array);
            if (count==0) break;                   
        }    
        printArray(array);
    }        
} 



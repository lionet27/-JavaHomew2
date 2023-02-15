// 4*. К калькулятору из предыдущего дз добавить логирование.
import java.util.Scanner;
import java.util.logging.*;
public class task4 {

    static float Calc(float number1,float number2,String sign){
        float result=0;
        switch (sign){
            case "+":
                result=number1+number2;
                break;
            case "-":
                result=number1-number2;
                break;
            case "*":
                result=number1*number2;
                break; 
            case "/":
                result=number1/number2;
                break;
            default:
            System.out.println("Неправильно ввели знак действия!"); 
        }
        return result;
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            
            System.out.printf("Введите первое  число x: ");
            boolean flag= sc.hasNextFloat();
            if (flag==false) System.out.println("Неправильно ввели число!");
            float x=sc.nextFloat();
            sc.nextLine();
            
            System.out.print("Введите действие,которое вы хотите сделать(+,-,*,/): ");
            String znak = sc.nextLine();
           
            System.out.printf("Введите второе  число y: ");
            flag= sc.hasNextFloat();
            if (flag==false) System.out.println("Неправильно ввели число!");
            float y=sc.nextFloat();
                              
            sc.close();
            float resCulc=Calc(x, y, znak);
            String result=String.format("%.2f",resCulc);
            System.out.println(x+znak+y+"="+result);
            try{
                Logger logger=Logger.getLogger(task4.class.getName());
                logger.setLevel(Level.INFO);
                FileHandler fh=new FileHandler("log.txt",true);
                logger.addHandler(fh);
                SimpleFormatter sFormat=new SimpleFormatter();
                // FileHandler fh.append= true;
                fh.setFormatter(sFormat);
                logger.info(x+znak+y+"="+result);
                fh.close();
            } catch(Exception e){
                    System.out.println("Что то не так");
            }
          
    }
}


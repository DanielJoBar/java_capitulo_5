import java.util.Scanner;
public class Ejercicio5_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=0;
        do{
            System.out.println(num);
            num=num+5;
        }
        while(num<105);
        sc.close();
    }
} 

import java.util.Scanner;
public class Ejercicio5_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1=320;
        do{
            System.out.println(num1);
            num1=num1-20;
        }
        while(num1>=160);
        sc.close(); 
    }
}

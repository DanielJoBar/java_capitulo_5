import java.util.Scanner;
public class Ejercicio5_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = -5;
        while(num <= 95){
            num=num+5;
            System.out.println(num);
        }
        sc.close();
    } 
}
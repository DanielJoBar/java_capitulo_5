import java.util.Scanner;
public class Ejercicio5_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=320;
        do{
            System.out.println(num);
            num=num-20;
        }
        while(num>=160);
        sc.close();
    }
}

import java.util.Scanner;
public class Ejercicio5_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 320;
        while(num>=160){
            System.out.println(num);
            num= num-20;
        }
        sc.close();
    }
}

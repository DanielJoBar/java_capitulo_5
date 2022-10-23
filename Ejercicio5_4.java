import java.util.Scanner;
public class Ejercicio5_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for (int num = 320;num >= 160;num-=20){
            System.out.println(num);
        }

        sc.close();
    }
} 

import java.util.Scanner;
public class Ejercicio5_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long digitos=0;
        do{
            num/=10;
            digitos++;
        }
        while(num>0);
        System.out.println(digitos);
        sc.close();
    }
}

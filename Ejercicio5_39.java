import java.util.Scanner;
public class Ejercicio5_39 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        long factorial =1;
        System.out.printf("%d!=",n);
        if(n<0){
            System.out.print("No existe");
        }
        else if(n==0){
            System.out.print("1");
        }
        else{
            for(int i=n;i>1;i--){
                factorial*=1;
                System.out.printf("%dx", i);
            }
            System.out.printf("1=%d", factorial);
        }

    sc.close();
}
}

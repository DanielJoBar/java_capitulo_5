import java.util.Scanner;
public class Ejercicio5_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de fibonacci que desea saber:  ");
        int n=sc.nextInt();
        int n1=0;
        int n2=1;
        int n3=1;
        System.out.println("0");
        for (int cont=0;cont<n-3;cont++){
        n1=n2;
        n2=n3;
        if(cont ==0){
            System.out.println("1");
            System.out.println("1");
        }
        n3=n1+n2;
        System.out.println(n3);
        }
        sc.close();
    }
}

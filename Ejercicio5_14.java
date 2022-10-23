import java.util.Scanner;
public class Ejercicio5_14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba la base:  ");
        int base=sc.nextInt();
        System.out.print("Escriba el exponente  :  ");
        int exponente =sc.nextInt();
        if (exponente<0){
            exponente = exponente *-1;
        }
        int operación = (int)(Math.pow(base,exponente));
        System.out.print("Resultado:   "+operación);
        sc.close();
    }
}

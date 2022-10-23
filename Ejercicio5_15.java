import java.util.Scanner;    
public class Ejercicio5_15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba la base :  ");
        int base=sc.nextInt();
        System.out.print("Escriba el exponente :  ");
        int exponente=sc.nextInt();
        int n=1;
        for(int cont=1;cont<=exponente;cont++){
            
            System.out.println(base+"^"+n);
            n++;
        }
    sc.close();
    }
}

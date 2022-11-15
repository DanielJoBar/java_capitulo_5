import java.util.Scanner;
public class Ejercicio5_58 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long n = sc.nextLong();
        long aux1 =n;
        long volteado=0;
        float media=0,sumaMedia=0;
        int contMedia=0;
        while(aux1>=1){
            volteado=volteado*10+aux1%10;
            aux1/=10;
        }
        aux1=n;
        while(volteado>0){
            aux1=volteado%10;
            volteado/=10;
            sumaMedia=aux1+sumaMedia;
            contMedia++;
        }
        media=sumaMedia/contMedia;
        System.out.print("La media de sus dígitos es: "+media);
        sc.close();
    }
}

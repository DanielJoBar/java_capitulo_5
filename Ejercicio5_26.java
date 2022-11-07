import java.util.Scanner;
public class Ejercicio5_26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();
        System.out.print("Introduzca un dígito: ");
        int digito = sc.nextInt();
        String posicion="";
        int contNum = 1;
        long volteado =0;
        long aux = n;
        long modulo=0;
        while(aux>0){
            volteado=volteado*10+aux%10;
            aux/=10;
        }
        while(volteado>0){
        modulo=volteado%10;
        volteado/=10;
        if(modulo==digito){
            posicion=posicion+""+contNum+",";}
        contNum++;
    }
        System.out.print("El numero se encuentra en la posicion: "+posicion);
    
        sc.close();
    }
}

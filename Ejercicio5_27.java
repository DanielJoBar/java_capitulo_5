import java.util.Scanner;
public class Ejercicio5_27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca hasta qué número de la tabla del 3 quiere mostrar: ");
        int n = sc.nextInt();
        int sumaMultiplo=0;
        int multiplicacion=1;
        for(int contMult=1;contMult<=n;contMult++){
        multiplicacion=contMult*3;
        System.out.println(contMult+" *3= "+multiplicacion);
        sumaMultiplo=sumaMultiplo+multiplicacion;
        System.out.println();
        }
        System.out.print("La suma de todos los múltiplos de 3 hasta "+n+" es: "+sumaMultiplo);
        sc.close();
    }
}

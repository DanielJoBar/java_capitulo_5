import java.util.Scanner;
public class Ejercicio5_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el numero que quiera para ver su tabla de multiplicar");
        int num = sc.nextInt();
        System.out.println("Tabla: ");
      for(int cont=0;cont<=10;cont++){
        System.out.println(num*cont);
      }

     sc.close();
    }
}

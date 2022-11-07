import java.util.Scanner;
public class Ejercicio5_31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la L: ");
        int L = sc.nextInt();
        for(int i = 1 ; i <= L ; i++){
        System.out.println("*");
        if(i==L){
            for(int contAsterisco = 1;contAsterisco<=L;contAsterisco++){
                System.out.print("*");
            }
        }
        }
            sc.close();
    }
}

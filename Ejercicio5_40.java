import java.util.Scanner;
public class Ejercicio5_40 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la altura del rombo(debe ser mayor que 3 e impar): ");
    int altura = sc.nextInt();
    int aux =-1;
    int aux2=altura-4;
    while(altura%2==0||altura<3){
        System.out.print(" Usted ha introducido un valor incorrecto introduzcalo de nuevo, por favor(Impar mayor a 3) ");
        altura = sc.nextInt();
    }
    for(int fila=1;fila<=((int)altura/2)+1;fila++){
    for(int espacios1=1;espacios1<=altura/2-fila+1;espacios1++){
        System.out.print(" ");
    }
    System.out.print("*");
    if(aux>=1){
    for(int espacios2=1;espacios2<=aux;espacios2++){
        System.out.print(" ");
    }
    System.out.print("*");
    }
    System.out.println();
    aux+=2;
    }
    for(int fila2 =1;fila2<((int)altura/2)+1;fila2++){
        if(fila2>=1){
        for(int espacios1 =1;espacios1<=fila2;espacios1++){
        System.out.print(" ");}
        }
        System.out.print("*");
        if(aux2>=1){
            for(int espacios2 = 1;espacios2<=aux2;espacios2++){
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println();
        aux2-=2;
        }sc.close(); 
    }
    }


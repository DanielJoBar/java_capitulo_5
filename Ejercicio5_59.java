import java.util.Scanner;
public class Ejercicio5_59{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura del árbol: ");
        int altura = sc.nextInt();
        int aux=1;
        for(int i =1;i<=altura+1;i++){
            if(i==1){
                if(altura%2==0){
                for(int j=1;j<altura-1;j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
                else{
                for(int j=1;j<=altura+2;j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
        else if(i>1&&i<altura){
            if(altura%2==0){
                for(int j=1;j<=altura-i;j++){
                    System.out.print(" ");
                }
                System.out.print("^");
                if(i>=3){
                for(int k =1;k<=aux;k++){
                    System.out.print(" ");
                }
                aux+=2;
                System.out.print("^");
                }
                System.out.println();
            }
            else{
                for(int j=1;j<=altura-i+4;j++){
                    System.out.print(" ");
                }
                System.out.print("^");
                if(i>=3){
                for(int k =1;k<=aux;k++){
                    System.out.print(" ");
                }
                aux+=2;
                System.out.print("^");
                }
                System.out.println();
                }
        }
        if(i==altura-1){
            if(altura%2==0){
            for(int j =1;j<aux+3;j++){
            System.out.print("*");
            }}
            else{
                for(int j=1;j<=altura-i+3;j++){
                    System.out.print(" ");
                }
            for(int j=1;j<=aux+2;j++){
            System.out.print("^");
            }
            }
            System.out.println();
        }
        if(i==altura){
            if(altura%2==0){
                for(int j = 1;j<=aux/2+1;j++){
                    System.out.print(" ");
                }
            }
            else{
                for(int j = 1;j<=altura+2;j++){
                    System.out.print(" ");
                }
            }
            System.out.print("|");
        }
        }
        sc.close();
    }
}
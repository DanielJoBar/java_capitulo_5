import java.util.Scanner;
public class Ejercicio5_20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba la altura : ");
        int altura=sc.nextInt();
        System.out.print("Escriba el caracter:  ");
        String caracter = System.console().readLine();
        int numSimbolos = 0;
        int altura2=altura-1;
        int altura3=1;
        for(int cont=1;cont<=altura;cont++){
            System.out.println();
            for(int i=1;i<=altura2;i++){
                if(cont<altura){
                System.out.print(" ");}
            }
            System.out.print(caracter);
            for(int k=1;k<=numSimbolos;k++){
                if(cont<altura){
                System.out.print(" ");}
                else{System.out.print(caracter);}
            }
            if(altura3>1){
                System.out.print(""+caracter);
            }
        altura2--;
        numSimbolos+=2;
        altura3++;
        }
        sc.close();
    }
}

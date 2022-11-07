import java.util.Scanner;
public class Ejercicio5_21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca numeros hasta poner uno negativo: ");
        int n1 = sc.nextInt();
        int mayorPar=0;
        float impares = 0,mediaImpares=0;
       while(n1>0){
        if(n1%2==0){
        if(n1 >mayorPar){
        mayorPar=n1;}
        }
        else{
        impares++;
        mediaImpares=mediaImpares+n1;
        }
        n1=sc.nextInt();
       }
       if(impares>0)
       System.out.print("El mayor par introducido es de : "+mayorPar+" y la media de los impares es :"+mediaImpares/impares);
       if(impares<0)
       System.out.print("El mayor par introducido es de : "+mayorPar+" y la media de los impares es : 0");
       sc.close();
    }
}

import java.util.Scanner;
public class Ejercicio5_55{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    double n = sc.nextDouble();
    double aux1=n,aux2=n;
    double contNum=0;
    long Resultado=0;
    String resultadoTotal ="";
    if(n>=10){
    while(aux1>1){
        aux1/=10;
        contNum++;
    }
    aux1=n;
    contNum--;
    while(contNum>=0){
        aux1=aux2/(Math.pow(10, contNum));
        if(contNum>=1){
            Resultado=(long)aux1+Resultado*10;
        }
        else{
            resultadoTotal=(long)aux1+""+Resultado;
        }
        aux2-=(long)aux1*(Math.pow(10,contNum));
        contNum--;
    }}
    else{
        resultadoTotal=""+(int)n;
    }
    System.out.print("El número resultado es: "+resultadoTotal);
    sc.close();
    }
}
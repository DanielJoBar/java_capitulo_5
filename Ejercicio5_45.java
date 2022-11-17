import java.util.Scanner;
public class Ejercicio5_45 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un número entero positivo: ");
    double n = sc.nextDouble();
    System.out.print("Introduzca la posición del número: ");
    int n2 =sc.nextInt();
    System.out.print("Introduzca el dígito que desea insertar: ");
    int n3=sc.nextInt();
    double aux =n;
    double aux2 =0;
    double aux3 =n;
    int cont =1;
    int cont2=0;
    double numero1=0;
    double numero2=0;
    while(aux3>1){
    aux3/=10;
    cont2++;
    }
    while (cont<=cont2-n2+1){
        aux2=(long)aux%10;
        numero1=aux2+numero1;
        if(aux>100){
        numero1*=10;}
        aux=aux/10;
        cont++;
    }
    numero1=(long)numero1/10;
    numero2=aux;
    aux2=0;
    while(numero1>1){
        aux2=aux2*10+(long)numero1%10;
        numero1/=10;
    }
    System.out.print("El número resultante es: "+(long)numero2+n3+""+(long)aux2);
        sc.close();
    }
}

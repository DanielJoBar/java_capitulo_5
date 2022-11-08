/*Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando los
dígitos de la siguiente manera: primer dígito del primer número, primer dígito
del segundo número, segundo dígito del primer número, segundo dígito del
segundo número, tercer dígito del primer número... Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud
y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
int donde sea necesario para admitir números largos. */
import java.util.Scanner;
public class Ejercicio5_34 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        //se necesitan variables  para los num impares,pares,una mezcla(resultado),v(int)(es una variable que va almacenando los modulos de los numeros),n1,n2(se hace todo seguido para que vaya en orden(primer numero par del primer numero, primer numero par del se gundo numero.... y asi)),se hace un while para meter un if else para ir componiendo el numero total volteado(npar = npar+(long)(v*math.pow(10,(impares-contimpares)))
        //contimpares++,mezcla/10
        System.out.print("Introduzca un primer número: ");
        long n1 = sc.nextLong();
        System.out.print("Introduzca otro número: ");
        long n2 = sc.nextLong();
        boolean oK1=true;
        int contPar=0,contImpar=0;
        String numeroPar="";
        String numeroImpar="";
        do {
        int contNum1=0;
        int contNum2=0;
        long vuelta1=0;
        long vuelta2=0;
        long aux1=n1,aux2=n2;
        while(aux1>0){
            vuelta1=vuelta1*10+aux1%10;
            aux1/=10;
            contNum1++;
        }
        while(aux2>0){
            vuelta2=vuelta2*10+aux2%10;
            aux2/=10;
            contNum2++;
        }
        if(contNum1==contNum2){
        oK1=true;
        for(int cont=0;cont<=contNum1;cont++){
            if((vuelta1%10)%2==0&&vuelta1>0){
                numeroPar=numeroPar+(vuelta1%10)+"";
                contPar++;
            }
            else if(vuelta1>0) {
                numeroImpar=numeroImpar+(vuelta1%10)+"";
                contImpar++;
            }
            if((vuelta2%10)%2==0&&vuelta2>0){
                numeroPar=numeroPar+(vuelta2%10)+"";
                contPar++;
            }
            else if(vuelta2>0){
                numeroImpar=numeroImpar+(vuelta2%10)+"";
                contImpar++;
            }
            vuelta1/=10;
            vuelta2/=10;
        }

        }
        else{
            System.out.println("Usted ha introducido dos numeros que no son del mismo tampaño introduzcalos de nuevo(numero1, nuemero2): ");
            n1=sc.nextLong();
            n2=sc.nextLong();
            oK1=false;
        }}
        while(!oK1);
        if(contPar==0){
            numeroPar=numeroPar+0;
        }
        if(contImpar==0){
            numeroImpar=numeroImpar+0;
        }
        System.out.println("El número par formado  es: "+numeroPar);
        System.out.println("El número impar formado es: "+numeroImpar);
        sc.close();
}
}

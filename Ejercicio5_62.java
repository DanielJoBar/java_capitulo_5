import java.util.Scanner;
public class Ejercicio5_62 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int contAfo=0;
        int contDes=0;
        int contDigito=0;
        System.out.print("Introduzca un número: ");
        double num =sc.nextDouble();
       double aux=num,aux2=num;
        while(aux>1){
        aux/=10;
        contDigito++;
       }
       contDigito--;
       while(num>=0){
        aux=num/(Math.pow(10,contDigito));
        if((long)aux==3||(long)aux==7||(long)aux==8||(long)aux==9){
            contAfo++;
        }
        else if(aux==0&&contDigito>0){
            contDes++;
        }
        else{
            contDes++;
        }
        num=num-(long)aux*(Math.pow(10,contDigito));
        if(contDigito==0){
                num=-1;
        }
        contDigito--;
       } 
       if(contDes>contAfo-1){
        System.out.print("El "+(long)aux2+" no es un número afortunado");
       }
       else{
        System.out.print("El "+(long)aux2+" es un número afortunado");
       }
        sc.close();
    }
}

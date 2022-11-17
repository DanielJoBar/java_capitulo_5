import java.util.Scanner;
public class Ejercicio5_51 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean gusano=false;
        System.out.print("Introduzca un número entero(mayor que 0): ");
        long n=sc.nextLong();
        double aux =n,aux2=n;
        long contNum=0;
        String Formacion="";
        while(aux>1){
            aux/=10;
            contNum++;
        }
        contNum--;
        aux=n;
        while(contNum>=0){
            aux2=(long)aux/(Math.pow((double)10, (double)contNum));
            if((int)aux2==8||(int)aux2==0){
                gusano=true;
            }
            else{
                Formacion=Formacion+" "+(int)aux2;
            }
            aux-=(int)aux2*(Math.pow((double)10, (double)contNum));
            contNum--;
        }   
        if(!gusano){
            System.out.print("El gusano no se ha comido ningún dígito.");
        }
        else{
            System.out.print("Después de haber sido comido por el gusano numérico se queda en: "+Formacion);
        }
        sc.close();
    }
}

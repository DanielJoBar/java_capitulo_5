import java.util.Scanner;
public class Ejercicio5_7 {
    public static void main(String[]  args){
        int combinacion = 5452;
        System.out.print("Introduzca cuatro número para abrir la caja fuerte:   ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int intentos =3;intentos>0;intentos--){
            if(num!=combinacion){
                System.out.print("Lo siento, esa no es la combinación, pruebe de nuevo:  ");
                num = sc.nextInt();
            }
            else{System.out.print("La caja fuerte se ha abierto satisfactoriamente");
            intentos=0;
        }}
        if(num!=combinacion){
            System.out.print("Se han acacabado sus oportunidades");
        }
        
    sc.close();
}
}

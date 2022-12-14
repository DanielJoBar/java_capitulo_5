import java.util.Scanner;
public class Ejercicio5_68 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Por favor, introduzca un número: ");
long num = s.nextLong();
long aux = num;
long resultado = 0;
int cuentaDigitos = 0;
while (num > 0) {
int digito = (int) (num % 10);
int nuevoDigito = digito ;
if(digito % 2 ==1)
 nuevoDigito = --digito;
else
 nuevoDigito = ++digito;
resultado = (long) (nuevoDigito * Math.pow(10, cuentaDigitos) + resultado);
num /= 10;
cuentaDigitos++;
}
System.out.println("Dislocando el " + aux + " sale el " + resultado);
s.close();
}
}
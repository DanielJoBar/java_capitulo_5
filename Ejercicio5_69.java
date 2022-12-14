import java.util.Scanner;
public class Ejercicio5_69 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Introduzca la altura de la pirámide maya: ");
int altura = s.nextInt();
int planta = 1;
int longitudDeLinea = 1;
int espacios = altura - 1;
while (planta <= altura) {
for (int i = 1; i <= espacios; i++) {
System.out.print(' ');
}
for (int i = 0; i <= longitudDeLinea / 2; i++) {
System.out.print('*');
}
if(planta % 2==1)
System.out.print("****");
else
System.out.print(" ");
for (int i = 0; i <= longitudDeLinea / 2; i++) {
System.out.print('*');
}
System.out.println();
planta++;
espacios--;
longitudDeLinea += 2;
}
s.close();
}
}

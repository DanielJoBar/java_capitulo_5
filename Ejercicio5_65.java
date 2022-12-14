import java.util.Scanner;
public class Ejercicio5_65 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Introduzca la altura de la A (un número mayor o igual a 3): ");
int altura = s.nextInt();
if (altura < 3) {
System.out.println("La altura introducida no es correcta.");
} else {
System.out.print("Introduzca la fila del palito horizontal : ");
int palito = s.nextInt();
if ((palito < 2) || (palito >= altura)) {
System.out.println("La fila introducida no es correcta.");
} else {
int espaciosIzq = altura - 1;
int espaciosCentro = 1;
for (int fila = 1; fila <= altura; fila++) {
    for (int j = 0; j < espaciosIzq; j++) {
    System.out.print(" ");
    }
    espaciosIzq--;
System.out.print("*");
if (fila > 1) {
if (fila == palito) {
    for (int j = 0; j < espaciosCentro; j++) {
        System.out.print("*");
        }
} else {
    for (int j = 0; j < espaciosCentro; j++) {
        System.out.print(" ");
        }
}
espaciosCentro+=2;
System.out.print("*");
}
System.out.println();
}
}
}
s.close();
}
}
import java.util.Scanner;
public class Ejercicio5_22 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        String primo ="";
        for(int cont =2;cont<=100;cont++){
        if (cont%2!=0&&cont%3!=0&&cont%5!=0&&cont%7!=0){
            primo=primo+","+cont;
        }
        }
        System.out.print(2+""+primo+","+100);
    sc.close();
    }
}

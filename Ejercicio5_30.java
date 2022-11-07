/* Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una
cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
los datos correctamente y que el segundo día es posterior al primero.*/
import java.util.Scanner;
public class Ejercicio5_30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean oK1 =true;
        boolean oK2=true;
        System.out.println("¿Va a introducir el dia de la semana con numero o con el nombre ? (escriba <nombre> o <numero>) el dia 2 tiene que ser un dia minimo despues del dia 1 ");
        String formato=System.console().readLine();
        int ndiasInicio=0;
        int ndiasFin=0;
        int dias;
        int horasTotal=0;
        do{
        if(formato.equals("numero")){
        System.out.print("Introduzca el dia : ");
        int dia1 = sc.nextInt();
        System.out.print("Introduzca tambien la hora : ");
        int hora =sc.nextInt();
        System.out.print("Introduzca otro dia : ");
        int dia2 = sc.nextInt();
        System.out.print("Introduzca tambien la hora : ");
        int hora2 =sc.nextInt();
        do {
        if(dia1<0||dia1>7||dia2<0||dia2>7||dia2<dia1){
            System.out.println("No a introducido un valor en el dia correcto intentelo de nuevo(Dia1 primero y luego Dia 2)");
            dia1=sc.nextInt();
            dia2=sc.nextInt();
        }
        else if(hora<0||hora>23||hora2<0||hora2>23){
            System.out.println("No ha introducido una hora correcta(primero hora 1 y luego hora 2)");
            hora=sc.nextInt();
            hora2=sc.nextInt();
        }}
        while(hora<0||hora>23||hora2<0||hora2>23||dia1<0||dia1>7||dia2<0||dia2>7||dia2<dia1);
        do {
            switch(dia1){
            case 1:
            ndiasInicio=1;
            oK2=true;
            break;
            case 2:
            oK2=true;
            ndiasInicio=2;
            break;
            case 3:
            oK2=true;
            ndiasInicio=3;
            break;
            case 4:
            oK2=true;
            ndiasInicio=4;
            break;
            case 5:
            oK2=true;
            ndiasInicio=5;
            break;
            case 6:
            oK2=true;
            ndiasInicio=6;
            break;
            case 7:
            oK2=true;
            ndiasInicio=7;
            break;
        }}
        while(!oK2);
        do {
            switch(dia2){
            case 1:
            ndiasFin=1;
            oK2=true;
            break;
            case 2:
            oK2=true;
            ndiasFin=2;
            break;
            case 3:
            oK2=true;
            ndiasFin=3;
            break;
            case 4:
            oK2=true;
            ndiasFin=4;
            break;
            case 5:
            oK2=true;
            ndiasFin=5;
            break;
            case 6:
            oK2=true;
            ndiasFin=6;
            break;
            case 7:
            oK2=true;
            ndiasFin=7;
            break;
        }}
        while(!oK2);
            dias = ndiasFin-ndiasInicio;
            horasTotal = dias*24+(hora2-hora);
            oK1=true;
    }
        else if(formato.equals("nombre")){
            oK1=false;
            System.out.print("Introduzca  la hora del primer dia: ");
            int Hora =sc.nextInt();
            System.out.print("Introduzca tambien la hora del segundo dia : ");
            int Hora2 =sc.nextInt();
            while(Hora<0||Hora>23||Hora2<0||Hora2>23){
                if(Hora<0||Hora>23||Hora2<0||Hora2>23){
                    System.out.println("No ha introducido una hora correcta(Hora1 y luego Hora2)");
                    Hora=sc.nextInt();
                    Hora2 =sc.nextInt();
                }
            }
                do {
                    System.out.print("Introduzca el dia1 : ");
            String Dia1 = System.console().readLine();
                switch(Dia1){
                case "lunes":
                ndiasInicio=1;
                oK2=true;
                break;
                case "martes":
                oK2=true;
                ndiasInicio=2;
                break;
                case "miercoles":
                oK2=true;
                ndiasInicio=3;
                break;
                case "jueves":
                oK2=true;
                ndiasInicio=4;
                break;
                case "viernes":
                oK2=true;
                ndiasInicio=5;
                break;
                case "sabado":
                oK2=true;
                ndiasInicio=6;
                break;
                case "domingo":
                oK2=true;
                ndiasInicio=7;
                break;
                default:
                oK2=false;
                System.out.print("No introdujo el dia1 correcto intente de nuevo:");
            }}
            while(!oK2);
            do {
                System.out.print("Introduzca otro dia : ");
            String Dia2 = System.console().readLine();
                switch(Dia2){
                case "lunes":
                ndiasFin=1;
                oK2=true;
                break;
                case "martes":
                oK2=true;
                ndiasFin=2;
                break;
                case "miercoles":
                oK2=true;
                ndiasFin=3;
                break;
                case "jueves":
                oK2=true;
                ndiasFin=4;
                break;
                case "viernes":
                oK2=true;
                ndiasFin=5;
                break;
                case "sabado":
                oK2=true;
                ndiasFin=6;
                break;
                case "domingo":
                oK2=true;
                ndiasFin=7;
                break;
                default:
                oK2=false;
                System.out.print("No introdujo el dia1 correcto intentelo de nuevo : ");
                break;
            }}
            while(!oK2);
            dias = ndiasFin-ndiasInicio;
            horasTotal = dias*24+(Hora2-Hora);
            oK1=true;
        }
            else{
                oK1=false;
                System.out.println("Usted ha introducido un valor no válido intentelo de nuevo (escriba <nombre> o <numero>):");
        formato=System.console().readLine();
            }}
            while(!oK1);
            System.out.print("Las horas transcurridas entre el primer y el segundo dia es de "+horasTotal+" horas");
        sc.close();
    }
}

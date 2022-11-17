import java.util.Scanner;
public class Ejercicio5_48 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        long n = sc.nextLong();
        String numeroIncluido=" ";
        String numeroExcluido=" ";
        double aux1 = n;
        long contDigitos=0;
        boolean n1=false,n2=false,n3=false,n4=false,n5=false,n6=false,n7=false,n8=false,n9=false,n0=false;
        while(aux1>1){
            aux1/=10;
            contDigitos++;
        }
        aux1=n;
        contDigitos--;
        long contDig =contDigitos;
        while(contDigitos+1>0){
            aux1=n/(Math.pow((double)10, (double)contDigitos));
            String aux2=""+(long)aux1;
            switch(aux2){
                case "0":
                if(!n0){
                numeroIncluido=numeroIncluido+" "+0;}
                n0=true;
                if(contDig==contDigitos){
                    numeroIncluido=" "+0;
                }
                break;
                case "1":
                if(!n1){
                numeroIncluido=numeroIncluido+" "+1;}
                n1=true;
                if(contDig==contDigitos){
                    numeroIncluido=""+1;
                }
                break;
                case "2":
                if(!n2){
                numeroIncluido=numeroIncluido+" "+2;}
                n2=true;
                if(contDig==contDigitos){
                    numeroIncluido=" "+2;
                }
                break;
                case "3":
                if(!n3){
                numeroIncluido=numeroIncluido+" "+3;}
                n3=true;
                if(contDig==contDigitos){
                    numeroIncluido=" "+3;
                }
                break;
                case "4":
                if(!n4){
                numeroIncluido=numeroIncluido+" "+4;}
                n4=true;
                if(contDig==contDigitos){
                    numeroIncluido=" "+4;
                }
                break;
                case "5":
                if(!n5){
                numeroIncluido=numeroIncluido+" "+5;}
                n5=true;
                if(contDig==contDigitos){
                    numeroIncluido=" "+5;
                }
                break;
                case "6":
                if(!n6){
                numeroIncluido=numeroIncluido+" "+6;}
                n6=true;
                if(contDig==contDigitos){
                    numeroIncluido=" "+6;
                }
                break;
                case "7":
                if(!n7){
                numeroIncluido=numeroIncluido+" "+7;}
                n7=true;
                if(contDig==contDigitos){
                    numeroIncluido=" "+7;
                }
                break;
                case "8":
                if(!n8){
                numeroIncluido=numeroIncluido+" "+8;}
                n8=true;
                if(contDig==contDigitos){
                    numeroIncluido=" "+8;
                }
                break;
                case "9":
                if(!n9){
                numeroIncluido=numeroIncluido+" "+9;}
                n9=true;
                if(contDig==contDigitos){
                    numeroIncluido=numeroIncluido+" "+9;
                }
                break;
            }
            aux2=" ";
            n-=(long)aux1*(Math.pow(10,contDigitos));
            contDigitos--;
            }
            boolean Ok =false;
            while(!Ok){
                if(!n0){
                    numeroExcluido=numeroExcluido+" "+0;
                    n0=true;
                }
                if(!n1){
                    numeroExcluido=numeroExcluido+" "+1;
                    n1=true;
                }
                if(!n2){
                    numeroExcluido=numeroExcluido+" "+2;
                    n2=true;}
                if(!n3){
                    numeroExcluido=numeroExcluido+" "+3;
                    n3=true;}
                if(!n4){
                    numeroExcluido=numeroExcluido+" "+4;
                    n4=true;}
                if(!n5){
                    numeroExcluido=numeroExcluido+" "+5;
                    n5=true;}
                if(!n6){
                    numeroExcluido=numeroExcluido+" "+6;
                    n6=true;}
                if(!n7){
                    numeroExcluido=numeroExcluido+" "+7;
                    n7=true;}
                if(!n8){
                    numeroExcluido=numeroExcluido+" "+8;
                    n8=true;}
                if(!n9){
                    numeroExcluido=numeroExcluido+" "+9;
                    n9=true;}
                else if(n0&&n1&&n2&&n3&&n4&&n5&&n6&&n7&&n8&&n9){Ok=true;}
        }
        System.out.println("Digitos que aparecen en el número: "+numeroIncluido);
        System.out.print("Dígitos que no aparecen: "+numeroExcluido);
        sc.close();
    }
}

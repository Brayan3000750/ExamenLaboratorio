/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlaboratorio;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Brayan_PinelE1 {
    
public static void main(String[] args){
    Scanner datos=new Scanner(System.in);
    
    int opciones;
    do{
    System.out.println("****MENU****");
    System.out.println("1. Piramide");
    System.out.println("2. Mayor");
    System.out.println("3. Cliente y Canales");
    System.out.println("4. Contar Vocales");
    System.out.println("5. Salir");
    System.out.print("Seleccione una opcion: ");
            opciones = datos.nextInt();
            datos.nextLine();

               if(opciones==1){
                imprimirPiramide(6);

             } else if (opciones == 2) {
                MayorYPromedio();
            } else if (opciones == 3) {
                Canalesclientes();
            } else if (opciones == 4) {
                hVocales();
            } else if (opciones == 5) {
                System.out.println("HASTA LUEGO");
            } else {
                System.out.println("Opción no válida, intente de nuevo.");
            }
}while(opciones!=5);

datos.close();
}

public static void imprimirPiramide (int filas){

int numero=1;
for(int x=1;x<=filas;x++){
int suma=0;



for (int j = 0; j < x; j++) {
                System.out.print(numero + " ");
                suma += numero;
                numero += 2;
            }
            System.out.println("= " + suma);
        }
    
}

public static void MayorYPromedio(){
Scanner datos=new Scanner(System.in);
int maximo=Integer.MIN_VALUE;
int sume=0;
int contar=0;

String respuesta;
do{
System.out.println("Ingrese un numero");
int numeros =datos.nextInt();

sume += numeros;
            contar++;
            if (numeros > maximo) {
                maximo = numeros;
            }
            System.out.print("¿Desea ingresar otro numero? (SI/NO): ");
            respuesta = datos.next();
        } while (respuesta.equalsIgnoreCase("SI"));


if(contar>0){
double promedio=(double) sume/contar;
System.out.println("El numero mas ingresado mayor es: "+maximo);
System.out.println("El numero mas promediado es: "+promedio);
}


}

public static void Canalesclientes(){
Scanner datos=new Scanner(System.in);
System.out.println("Ingrese el nombre del cliente" );
String nombreCliente= datos.nextLine();

int canalesHD=0;
int canalesNormales=0;

String respuesta;

do{
    System.out.println("Ingrese si el canal es hd o normal");
String Canal=datos.nextLine().toUpperCase();


if(Canal.equals("HD")){
canalesHD++;

}else if(Canal.equals("Normal")){
canalesNormales++;

}
 System.out.print("Quiere poner otro canal? (SI/NO): ");
            respuesta = datos.nextLine();
        } while (respuesta.equalsIgnoreCase("SI"));

System.out.println("Ingrese la caja digital que quiera LIGHTBOX/HDBOX/DVRBOX");
String caja=datos.nextLine().toUpperCase();

 int subtotal = (canalesNormales * 20) + (canalesHD * 30);
        if (caja.equals("LIGHTBOX")) {
            subtotal += 50;
        } else if (caja.equals("HDBOX")) {
            subtotal += 100;
        } else if (caja.equals("DVRBOX")) {
            subtotal += 150;
        }
double impuesto=subtotal*0.15;
double pagar= subtotal+impuesto;

System.out.println("Detalles");
System.out.println("Canales Normales: "+canalesNormales);
System.out.println("Canales HD: "+canalesHD);
System.out.println("Subtotal: " + subtotal + " Lps");
 System.out.println("Impuesto (15%): " + impuesto + " Lps");
System.out.println("Total a Pagar: " + pagar + " Lps");
}

public static void hVocales(){
    Scanner datos=new Scanner(System.in);
    String cadenas=datos.nextLine();
    int contar=0;
    
    for (int i = 0; i < cadenas.length(); i++) {
        char ch = cadenas.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            contar++;
        }
    }

    System.out.println("La cantidad de vocales en minusculas en la cadena son: " + contar);
}
    
    
    
    
    
    
    
}









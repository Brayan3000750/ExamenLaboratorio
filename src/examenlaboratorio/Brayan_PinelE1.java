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
    System.out.print("Seleccione una opción: ");
            opciones = datos.nextInt();
            datos.nextLine();

               if(opciones==1){
                imprimirPiramide(6);

             } else if (opciones == 2) {
                MayorYPromedio();
            } else if (opciones == 3) {
                procesarClienteYCanales();
            } else if (opciones == 4) {
                contarVocales();
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



    
}

public static void MayorYPromedio(){
Scanner datos=new Scanner(System.in);
int max=Integer.MIN_VALUE;
int sume=0;
int contar=0;

String respuesta;

System.out.println("Ingrese un numero");
int num =datos.nextInt();











}





}


















}















}

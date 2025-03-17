/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catalogoSeriesTelevision;

import java.util.Scanner;

/**
 *
 * @author dam117
 */
public class Entrada {
    
    /*PEDIR NOMBRE()*/
    public void pedirNombre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insertar nombre de la serie(min. 4 chars , max. 25 chars.):");
        String nombre = sc.nextLine();
        if (validarNombre(nombre)){
            System.out.println("Nombre validado con exito.");
        } else {
            System.out.println("Nombre invalido.Intentar otra vez.");
            pedirNombre();
        }
        sc.close();
    }
    
    /*VALIDAR NOMBRE()*/
    public static boolean validarNombre(String nombre){
        if (nombre.isBlank()){
            System.out.println("El campo 'nombre' esta vacio.");
            return false;
        } 
        if (nombre.length()>25){
            System.out.println("El nombre tiene mas de 25 caracteres.");
            return false;
        }
        if(nombre.length()<4){
            System.out.println("El nombre tiene menos de 4 caracteres.");
            return false;
        }
        //si no se cumple ninguna de las condiciones anteriores, el nombre es valido.
        return true;
    }
    
    /*PEDIR NACIONALIDAD*/
    public void pedirNacionalidad(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insertar nacionalidad de la serie:");
        String nacionalidad = sc.nextLine();
        sc.close();
    }
    
    /*VALIDAR NACIONALIDAD*/
    
    
    /*PEDIR TEMPORADA*/
    public void pedirTemporada(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el numero de temporada(min. 1, max. 15):");
    }
    /*VALIDAR TEMPORADA()*/
    public static boolean validarTemporada(int temporada){
        if (temporada>15){
            System.out.println("No puede haber mas de 15 temporadas..");
            return false;
        }
        if(temporada<1){
            System.out.println("La temporada no puede ser menor a 1.");
            return false;
        }
        //si no se cumple ninguna de las condiciones anteriores, la temporada es valido.
        return true;
    }
}

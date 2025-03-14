/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catalogoSeriesTelevision;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dam117
 */
enum Tematica {
    Policial,
    Comedia,
    Infantil,
    Aventura;
}

public class Serie {

    /*ATRIBUTOS*/
    private String nombre;
    private Tematica TEMATICA;
    private String nacionalidad;
    private boolean finalizada;
    private int temporadas;
    private Map<String, Capitulo> capitulos;

    /*CONSTRUCTOR*/
    public Serie() {
        capitulos = new HashMap<String,Capitulo>();
    }

    public Serie(String nombre, Tematica TEMATICA, String nacionalidad, boolean finalizada, int temporadas) {
        this.nombre = nombre;
        this.TEMATICA = TEMATICA;
        this.nacionalidad = nacionalidad;
        this.finalizada = finalizada;
        this.temporadas = temporadas;
        capitulos = new HashMap<String,Capitulo>();
    }

    /*GET*/
    public String getNombre() {
        return nombre;
    }

    public Tematica getTEMATICA() {
        return TEMATICA;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public Map<String, Capitulo> getCapitulos() {
        return capitulos;
    }

    /*SET*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTEMATICA(Tematica TEMATICA) {
        this.TEMATICA = TEMATICA;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setCapitulos(Map<String, Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

    /*TO STRING*/
    @Override
    public String toString() {
        return "\nSerie{" + "nombre=" + nombre + ", Tematica=" + TEMATICA + ", nacionalidad=" + nacionalidad + ", finalizada=" + finalizada + ", temporadas=" + temporadas + '}';
    }
    
    /*GENERA CLAVE CAPITULO()*/
    private static String generarClaveCapitulo(String nombre , int temporada , int capitulo){
        return nombre.substring(0, 5) + 0 + temporada + "X" + 0 + capitulo;
    }
    
    /*INSERTAR CAPITULO()*/
    public void 
}

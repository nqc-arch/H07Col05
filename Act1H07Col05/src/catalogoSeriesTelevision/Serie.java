/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catalogoSeriesTelevision;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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
    private Map<String, Capitulo> mapCapitulos;

    /*CONSTRUCTOR*/
    public Serie() {
        mapCapitulos = new HashMap<String, Capitulo>();
    }

    public Serie(String nombre, Tematica TEMATICA, String nacionalidad, boolean finalizada, int temporadas) {
        this.nombre = nombre;
        this.TEMATICA = TEMATICA;
        this.nacionalidad = nacionalidad;
        this.finalizada = finalizada;
        this.temporadas = temporadas;
        mapCapitulos = new HashMap<String, Capitulo>();
    }

    /*EQUALS AND HASHCODE*/
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.nacionalidad);
        hash = 23 * hash + this.temporadas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Serie other = (Serie) obj;
        if (this.temporadas != other.temporadas) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.nacionalidad, other.nacionalidad);
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

    public Map<String, Capitulo> getMapCapitulos() {
        return mapCapitulos;
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

    public void setMapCapitulos(Map<String, Capitulo> mapCapitulos) {
        this.mapCapitulos = mapCapitulos;
    }

    /*TO STRING*/
    @Override
    public String toString() {
        return "\nSerie{" + "nombre=" + nombre + ", Tematica=" + TEMATICA + ", nacionalidad=" + nacionalidad + ", finalizada=" + finalizada + ", temporadas=" + temporadas + '}';
    }

    /*GENERA CLAVE CAPITULO()*/
    private static String generarClaveCapitulo(String nombre, int temporada, int capitulo) {
        return nombre.substring(0, 5) + 0 + temporada + "X" + 0 + capitulo;
    }

    /*INSERTAR CAPITULO()*/
    public void insertaCapitulo(Capitulo capitulo) {
        String clave = generarClaveCapitulo(capitulo.getNombre(), capitulo.getNumTemporada(), capitulo.getNumCapitulo());
        if (mapCapitulos.containsKey(clave)) {
            System.out.println("El capitulo ya existe en la serie.");
        } else {
            mapCapitulos.put(clave, capitulo);
            System.out.println("Capitulo agregado con exito.");
        }
    }

    //Añade 'f' como segunda parametro para forzar el cambio del capitulo.
    public void insertaCapitulo(Capitulo capitulo, char force) {
        String clave = generarClaveCapitulo(capitulo.getNombre(), capitulo.getNumTemporada(), capitulo.getNumCapitulo());
        if (Character.toLowerCase(force) == 'f') {
            mapCapitulos.put(clave, capitulo);
            System.out.println("Cambio realizado con exito.");
        } else {
            System.out.println("Segunda parametro incorrecto.Insertar  'f' para forzar la"
                    + " insercion del capitulo.");
        }
    }

    /*ELIMINAR CAPITULO()*/
    public void eliminaCapitulo(String clave) {
        if (mapCapitulos.isEmpty()) {
            System.out.println("La serie no tiene ningun capitulo agregado.");
        } else if (!mapCapitulos.containsKey(clave)) {
            System.out.println("El capitulo no existe en la serie.");
        } else {
            mapCapitulos.remove(clave);
            System.out.println("Capitulo removido con exito.");
        }
    }

    /*VISUALOZ CAPITULO()*/
    public void visualizaCapitulos() {
        if (mapCapitulos.isEmpty()) {
            System.out.println("La serie no tiene ningun capitulo agregado.");
        } else {
            System.out.println(mapCapitulos.toString());
        }
    }
}

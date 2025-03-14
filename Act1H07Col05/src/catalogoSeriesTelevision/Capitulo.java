/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catalogoSeriesTelevision;

/**
 *
 * @author dam117
 */
public class Capitulo implements Comparable<Capitulo> {

    /*ATRIBUTOS*/
    private int numTemporada;
    private int numCapitulo;
    private String descripcion;

    /*CONSTRUCTOR*/
    public Capitulo(int numTemporada, int numCapitulo, String descripcion) {
        this.numTemporada = numTemporada;
        this.numCapitulo = numCapitulo;
        this.descripcion = descripcion;
    }

    /*GET*/
    public int getNumTemporada() {
        return numTemporada;
    }

    public int getNumCapitulo() {
        return numCapitulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    /*SET*/
    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
    }

    public void setNumCapitulo(int numCapitulo) {
        this.numCapitulo = numCapitulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /*COMPARE TO*/
    @Override
    public int compareTo(Capitulo o) {
        boolean comparacion = this.numCapitulo == o.numCapitulo;
        if (comparacion) {
            return o.numTemporada - this.numTemporada;
        } else {
            return o.numCapitulo - this.numCapitulo;
        }
    }

    /*EQUALS AND HASHCODE*/
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.numTemporada;
        hash = 29 * hash + this.numCapitulo;
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
        final Capitulo other = (Capitulo) obj;
        if (this.numTemporada != other.numTemporada) {
            return false;
        }
        return this.numCapitulo == other.numCapitulo;
    }

    /*TO STRING*/
    @Override
    public String toString() {
        return "\nCapitulo{" + "numTemporada=" + numTemporada + ", numCapitulo=" + numCapitulo + ", descripcion=" + descripcion + '}';
    }

}

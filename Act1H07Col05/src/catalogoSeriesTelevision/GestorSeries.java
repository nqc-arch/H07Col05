/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catalogoSeriesTelevision;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 *
 * @author dam117
 */
public class GestorSeries {

    private Map<String, Serie> mapSeries;

    /*CONSTRUCTOR*/
    public GestorSeries() {
        this.mapSeries = new HashMap<String, Serie>();
    }

    /*GET*/
    public Map<String, Serie> getMapSeries() {
        return mapSeries;
    }

    /*SET*/
    public void setMapSeries(Map<String, Serie> mapSeries) {
        this.mapSeries = mapSeries;
    }

    /*EXISTE SERIE()*/
    public Serie existeSerie(String nombre) {
        if (mapSeries.isEmpty()) {
            System.out.println("No hay ninguna serie agregada.");
            return null;
        }
        if (!mapSeries.containsValue(nombre)) {
            System.out.println("La serie no esta contenida en el gestor.");
            return null;
        }
        Serie serie;
        mapSeries.forEach(new BiConsumer<String, Serie>(){
            @Override
            public void accept(String t, Serie u) {
                if (u.getNombre().equalsIgnoreCase(nombre)) {
                    serie = u;
                }
            }
        });
        return serie;
    }
}

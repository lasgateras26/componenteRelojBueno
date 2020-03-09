package us.com.alberto.componente;

import java.util.ArrayList;
import java.util.List;

public class Logica {

    private static Logica INSTANCE = null;
    private List<Tarea> listaTareas = new ArrayList<>();

    private Logica(){
    }

    public static Logica getInstance() {
        if (INSTANCE == null)
            INSTANCE = new Logica();
        return INSTANCE;
    }

    public void añadirTarea(Tarea tarea){
        listaTareas.add(tarea);
    }

    public void borrarTarea(Tarea tarea){
        listaTareas.remove(tarea);
    }

    public List<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(List<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }
}
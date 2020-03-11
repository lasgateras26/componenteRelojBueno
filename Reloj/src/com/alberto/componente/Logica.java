package com.alberto.componente;

import com.alberto.tareas.Tarea;
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

    public List<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(List<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    public void añadirTarea(Tarea tarea){
        listaTareas.add(tarea);
    }
}
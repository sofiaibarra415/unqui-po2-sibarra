package ar.edu.unq.po2.tp3.equipo;

import java.util.ArrayList;

public class EquipoDeTrabajo {

    private String nombre;
    private ArrayList<Persona> integrantes;

    public EquipoDeTrabajo(String nombre) {
        this.nombre       = nombre;
        this.integrantes  = new ArrayList<>();
    }

    public void agregarIntegrante(Persona persona) {
        integrantes.add(persona);
    }

    public double promedioEdad() {
        int total = 0;
        for (Persona p : integrantes) {
            total += p.getEdad();
        }
        return (double) total / integrantes.size();
    }

    public String getNombre()                  { return nombre; }
    public ArrayList<Persona> getIntegrantes() { return integrantes; }
}
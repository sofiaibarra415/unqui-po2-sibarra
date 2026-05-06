package ar.edu.unq.po2.tp3.persona;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private String nombre;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public boolean menorQue(Persona persona) {
        return this.getEdad() < persona.getEdad();
    }
}
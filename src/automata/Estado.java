package automata;

import java.util.ArrayList;
import java.util.List;

public class Estado {

    protected String nombre;
    protected List<Transicion> transiciones;
    protected boolean esFinal;

    public Estado(String nombre, boolean esFinal) {
        this.nombre = nombre;
        this.esFinal = esFinal;
        this.transiciones = new ArrayList<>();
    }

    public void agregarTransicion(Transicion transicion) {
        transiciones.add(transicion);
    }

    public static int getIndice(String nombreEstado) {
        char indice = nombreEstado.charAt(1);
        return Character.getNumericValue(indice);
    }

    public Estado evaluarAlfabeto(char alfabeto) {
        for (Transicion transicion : transiciones) {
            char otroAlfabeto = transicion.getAlfabeto();
            if (alfabeto == otroAlfabeto) {
                return transicion.estado;
            }
            char[] vocales = {'a', 'e', 'i', 'o', 'u'};
            if(otroAlfabeto != 'v') continue;
            for (char vocal : vocales) {
                if(alfabeto == vocal){
                    return transicion.estado;
                }
            }

        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Transicion> getTransiciones() {
        return transiciones;
    }

    public void setTransiciones(List<Transicion> transiciones) {
        this.transiciones = transiciones;
    }

    public boolean esFinal() {
        return esFinal;
    }

    public void setEsFinal(boolean esFinal) {
        this.esFinal = esFinal;
    }
}

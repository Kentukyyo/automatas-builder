package automata;

import java.util.ArrayList;
import java.util.List;

public class Automata {

    List<Estado> estados;

    public Automata() {
        this.estados = new ArrayList<>();
    }

    public boolean evaluarExpresion(String expresion, Estado estado) {
        char alfabeto = expresion.charAt(0);
        Estado nuevoEstado = estado.evaluarAlfabeto(alfabeto);
        if (nuevoEstado == null) {
            return false;
        }
        if (expresion.length() > 1) {
            String nuevaExpresion = expresion.substring(1);
            boolean evaluacion = evaluarExpresion(nuevaExpresion, nuevoEstado);
            return evaluacion;
        }
        return nuevoEstado.esFinal;
    }

    public String toDiagraph() {
        StringBuilder diagraph = new StringBuilder();
        diagraph.append("diagraph Automata {\n");
        diagraph.append("rankdir=LR\n".indent(4));
        diagraph.append("size=\"8,5\"\n\n".indent(4));
        for (Estado estado : estados) {
            if (estado.getTransiciones().isEmpty()) {
                continue;
            }
            diagraph.append("    node [shape = circle]; ");
            diagraph.append(estado.getNombre());
            diagraph.append(";\n");
        }
        diagraph.append("node [shape = point]; qi;".indent(4));
        diagraph.append("\n");
        diagraph.append("qi -> q0;".indent(4));

        for (Estado estado : estados) {
            if (estado.getTransiciones().isEmpty()) {
                continue;
            }
            for (Transicion transicion : estado.getTransiciones()) {
                diagraph.append("    ").append(estado.nombre);
                diagraph.append(" -> ");
                diagraph.append(transicion.getEstado().getNombre());
                diagraph.append(" [ label = \"");
                if (transicion.getAlfabeto() == 'v') {
                    diagraph.append("vocal");
                } else {
                    diagraph.append(transicion.getAlfabeto());
                }
                diagraph.append("\" ];\n");
            }
        }
        diagraph.append("}");
        return diagraph.toString();
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }

}

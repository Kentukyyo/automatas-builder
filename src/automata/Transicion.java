package automata;

public class Transicion {

    protected char alfabeto;
    protected Estado estado;

    public Transicion(char alfabeto, Estado estado) {
        this.alfabeto = alfabeto;
        this.estado = estado;
    }

    public char getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(char alfabeto) {
        this.alfabeto = alfabeto;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}

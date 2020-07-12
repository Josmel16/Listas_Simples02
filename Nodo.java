package Clases;

public class Nodo {
    
    private String valor;
    private String valor2;
    private int valor1;
    private Nodo Siguiente;

    public Nodo(String valor,String valor2,int valor1, Nodo Siguiente) {
        String cod = null;
        valor=cod;
        String nom = null;
        valor2=nom;
        this.valor1=valor1;
        this.Siguiente = Siguiente;
    }

    public Nodo() {
        valor = null;
        valor2=null;
        valor1=0;
        Siguiente = null;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getValor2() {
        return valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }

    
}

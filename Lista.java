package Clases;

public class Lista {

    private Nodo inicio;
    private int tamaño;

    public Lista() {
        inicio = null;
        tamaño = 0;

    }

    public boolean esVacia() {
        return inicio == null;
    }

    public void agregarInicio(String cod, String nom, int valor) {
        Nodo nuevo = new Nodo();

        nuevo.setValor(cod);
        nuevo.setValor2(nom);
        nuevo.setValor1(valor);
        if (esVacia()) { //inicio == null;
            inicio = nuevo;

        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;

        }
        tamaño++;
    }

    public void agregarFinal(String cod, String nom, int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(cod);
        nuevo.setValor2(nom);
        nuevo.setValor1(valor);
        if (esVacia()) { //inicio == null;
            inicio = nuevo;

        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();

            }
            aux.setSiguiente(nuevo);
        }
        tamaño++;
    }

    public void listar() {
        if (!esVacia()) {
            Nodo aux = inicio;

            while (aux != null) {
                System.out.print("Codigo:" + aux.getValor() + "\n" + "Nombre:" + aux.getValor2() + "\n" + "Nota:" + aux.getValor1() + "\n");
                aux = aux.getSiguiente();

            }
        } else {
            System.out.println("Lista Vacia !!!");
        }
    }

    public void eliminar() {
        inicio = null;
        tamaño = 0;
        System.out.println("Elementos eliminados");
    }

    public void ordenar() {
//
    }

    public void buscar(int nota) {

        if (!esVacia()) {
            Nodo aux = inicio;
            while (aux != null) {
                if (aux.getValor1() == nota) {
                    System.out.print("Codigo:" + aux.getValor() + "\n" + "Nombre:" + aux.getValor2() + "\n" + "Nota:" + aux.getValor1() + "\n");

                }
                aux=aux.getSiguiente();
            }
        }else{
            System.out.println("Lista Vacia !!!");
        }
    }

}

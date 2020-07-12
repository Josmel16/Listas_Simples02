package Clases;

import java.util.Scanner;

public class AplicaListaSimple {
    
    static Scanner teclado = new Scanner(System.in);
    static Lista lista = new Lista();
    static Nodo nodo;
    
    public static void main(String arg[]) {
        menu();
    }
    
    static void menu() {
        int opcion;
        
        do {
            System.out.println("\n\nMenú de Opciones");
            System.out.println("==================================");
            System.out.println("[1] Insertar al Inicio de la Lista");
            System.out.println("[2] Insertar al Final de la Lista");
            System.out.println("[3] Eliminar elementos");
            System.out.println("[4] Buscar elementos");
            System.out.println("[5] Ordenar elementos");
            System.out.println("[6] Mostrar los Elementos");
            System.out.println("===================================");
            System.out.println("[0] Salir de la Aplicación");
            
            System.out.print("Ingrese una Opción : ");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    ingreso();
                    break;
                case 2:
                    ingresoFinal();
                    break;
                case 3:
                    lista.eliminar();
                    break;
                case 4:
                    buscar();
                    break;
                case 5:
                
                case 6:
                    lista.listar();
                    break;
            }
            
        } while (opcion != 0);
    }
    
    static void ingreso() {
        System.out.print("Ingrese Codigo: ");
        String cod = teclado.next();
        System.out.print("Ingrese Nombre: ");
        String num = teclado.next();
        System.out.print("Ingrese Nota: ");
        int nota = teclado.nextInt();
        lista.agregarInicio(cod, num, nota);
    }
    
    static void ingresoFinal() {
        System.out.print("Ingrese Codigo: ");
        String cod = teclado.next();
        System.out.print("Ingrese Nombre: ");
        String num = teclado.next();
        System.out.print("Ingrese Nota: ");
        int nota = teclado.nextInt();
        lista.agregarFinal(cod, num, nota);
    }
    
    static void buscar() {
        System.out.print("Ingrese Codigo: ");
        int nota = teclado.nextInt();
        lista.buscar(nota);
    }
    
}

package Polimorfismo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Creamos dos guerreros y un enemigo.
        Guerrero aldo = new Guerrero("Aldo", 5, 100, 20, "Espada");
        Guerrero kai  = new Guerrero("Kai",  4, 90, 25, "Hacha");
        
        Mago merlin = new Mago("Merlín", 6, 80, 30, "Zap");
        Mago gandalf = new Mago("Gandalf", 7, 100, 35, "Veneno");

        // Cuando tengas la clase Mago creada, instancia dos objetos
        
        // Creamos un enemigo con nombre, nivel, HP y ataque.
        Personaje enemigo = new Personaje("Ogro", 10, 200, 15) {
           
        	@Override
            public void Atacar(Personaje enemigo) {
              
            }
        };

        System.out.println("=== CON POLIMORFISMO ===");

        ArrayList<Personaje> ejercito = new ArrayList<>();

        ejercito.add(aldo);
        ejercito.add(kai);
        ejercito.add(merlin);
        ejercito.add(gandalf);

        for (Personaje personaje : ejercito) {
            personaje.Atacar(enemigo);
        }

        System.out.println("\n=== ESTADO DEL EJÉRCITO ===");

        for (Personaje personaje : ejercito) {
            personaje.mostrarInfo();
            System.out.println("--------------------");
        }
}
}

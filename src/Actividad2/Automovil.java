package Actividad2;

import java.security.PublicKey;

public class Automovil {

	String marca;
	String modelo;
	String nombreDueño;

	boolean estaEncendido;
	boolean estaAbierto;
	boolean estaVacio = true;

	int kilometraje = 0;
	int nivelCombustible = 0;

//	public void IngresarDatos() {
//		marca = "BMW";
//		modelo = "Z3";
//		nombreDueño = "Chepe";
//	}

	public void llenarTanque() {
		estaVacio = false;
		nivelCombustible = 100;

	}

	public void encender() {

		if (estaVacio || nivelCombustible == 0) {
			System.out.println("EROR: no hay combustible");

		} else {
			System.out.println("Auto encendido");
			estaEncendido = true;
		}
	}

	public void avanzar() {
		if (estaEncendido && !estaVacio) {
			kilometraje += 10;
			nivelCombustible -= 20;
			System.out.println("Avanzaste" + kilometraje + "km");

		} else {
			System.out.println("NO puede avanzar");

		}

	}

	public String mostrarDatos() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", nombreDueño=" + nombreDueño + ", estaEncendido="
				+ estaEncendido + ", estaAbierto=" + estaAbierto + ", estaVacio=" + estaVacio + ", kilometraje="
				+ kilometraje + ", nivelCombustible=" + nivelCombustible + "]";
	}

	public void abiertaPuertas() {
		if (!estaEncendido)
			;
		estaAbierto = true;
		System.out.println("Puertas abiertas");
	} else {
		System.out.println("Puertas cerradas");
	}

	}



package Actividad2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automovil auto1 = new Automovil();

		auto1.marca = "BMW";
		auto1.modelo = "Z3";
		auto1.nombreDueño = "Chepe";

		auto1.llenarTanque();
		auto1.encender();
		auto1.mostrarDatos();

		
		
		Automovil auto2 = new Automovil();

		auto2.marca = "Chevrolet";
		auto2.modelo = "Spin";
		auto2.nombreDueño = "Bot";

		auto2.llenarTanque();
		auto2.encender();
		auto2.mostrarDatos();

	}

}

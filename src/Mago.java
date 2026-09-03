package Polimorfismo;

public class Mago extends Personaje {
	
	 private String hechizo;

	    public Mago(String nombre, int nivel, int hp, int ataque, String hechizo) {
	        super(nombre, nivel, hp, ataque);
	        this.hechizo = hechizo;
	    }

	    @Override
	    public void Atacar(Personaje enemigo) {
	        enemigo.recibirDanio(getAtaque());

	        System.out.println(nombre + " lanza " + hechizo
	                + " y le hace " + getAtaque()
	                + " de daño a " + enemigo.nombre + ".");
	    }

	    @Override
	    public void mostrarInfo() {
	        super.mostrarInfo();
	        System.out.println("Hechizo: " + hechizo);
	    }
	}



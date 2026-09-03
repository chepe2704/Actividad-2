package Polimorfismo;

public class Guerrero extends Personaje {

    private String arma;

    public Guerrero(String nombre, int nivel, int hp, int ataque, String arma) {
        super(nombre, nivel, hp, ataque);
        this.arma = arma;
    }

    @Override
    public void Atacar(Personaje enemigo) {
        enemigo.recibirDanio(getAtaque());
        System.out.println(nombre + " blande su " + arma
                + " y le hace " + getAtaque() + " de daño a " + enemigo.nombre + ".");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Arma: " + arma);
    }
}
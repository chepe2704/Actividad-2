package Polimorfismo;

public class Personaje {

    protected String nombre;
    private int nivel;
    private int hp;
    private int ataque;

    public Personaje(String nombre, int nivel, int hp, int ataque) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.hp = hp;
        this.ataque = ataque;
    }

    public void Atacar(Personaje enemigo) {
        enemigo.recibirDanio(getAtaque());
        
        System.out.println(nombre + " ataca a "
                + enemigo.nombre + " y le hace "
                + getAtaque() + " de daño.");
    }
    
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("HP: " + hp);
        System.out.println("Ataque: " + ataque);
    }

    public void subirNivel() {
        nivel += 1;
        hp += 10;
        ataque += 5;
    }

    public void recibirDanio(int cantidad) {
        hp -= cantidad;
        if (hp < 0) {
            hp = 0;
        }
    }

    public boolean estaVivo() {
        return hp > 0;
    }

    protected int getAtaque() {
        return ataque;
    }
}
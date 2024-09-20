package Animales;

public class Vaca extends Animal {

    public Vaca(String nombre, int edad, String tipo) {
        super(nombre, edad, tipo);
    }

    @Override
    void sonido() {
        System.out.println("La Vaca hace Muuuuu");
    }

    @Override
    void comer() {
        System.out.println("La Vaca come sacate");
    }
    
}

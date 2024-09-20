package Animales;

//abstraccion
public abstract class Animal {
    String nombre;
    int edad;
    String tipo;
    
    //cada vez que cree un animal pida los datos con un constructor
    public Animal(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }
    
    //Abstraccion
    abstract void sonido();
    
    abstract void comer();
}

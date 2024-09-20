package Animales;

                  //herencia --> "Leon" va a extender las propiedades de "Animal"
public class Leon extends Animal{
    
    //polimorfismo -> se crea un nuevo atributo
    String colorMelena;

    public Leon(String nombre, int edad, String tipo) {
        super(nombre, edad, tipo);
        this.colorMelena = colorMelena;
    }

    
    @Override
    void sonido(){
        System.out.println("El leon emite un rujido Grrrra");
    }

    @Override
    void comer() {
        System.out.println("El Leon come carne");
    }
}

package animales;

public class Animal {
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
    public void dormir(){
        System.out.println("Duerme mucho tiempo");
    }

}

// Clase 2
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("EL PERRO HACE GUAF");
    }
    public void dormir(){
        System.out.println("Duerme 9 horas");
    }

}
// Clase 3
class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("EL GATO HACE MIAU");
    }
    public void dormir(){
        System.out.println("Duerme todo el dia");
    }

}


class PruebaAnimal{
    public static void main(String[] args) {
        System.out.println("*** Ejemplo de Polimorfismo ***");
        var animal = new Animal();

       animal.hacerSonido();
       var animalPerro = new Perro();
       animalPerro.hacerSonido();
       var animalGato = new Gato();
       var gato = new Animal();
       gato.dormir();



    }
}
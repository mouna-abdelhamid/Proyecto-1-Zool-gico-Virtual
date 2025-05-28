import java.util.ArrayList;
import java.util.List;
class Animal {
    String nombre;
    int edad;
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void hacerSonido() {
        System.out.println("Este animal hace un sonido.");
    }
}
class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Hup Hup!");
    }
}
class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void hacerSonido() {
        System.out.println("¡Miau!");
    }
}
class Pajaro extends Animal {
    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void hacerSonido() {
        System.out.println("¡Pío pío!");
    }
}
class Zoologico {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Rax", 3));
        animales.add(new Gato("Bibeno", 2));
        animales.add(new Pajaro("Zozo", 1));
        animales.add(new Perro("Duke", 4));
        animales.add(new Gato("Mimi", 5));
        for (Animal animal : animales) {
            System.out.print(animal.nombre + " dice: ");
            animal.hacerSonido();
        }
    }
}
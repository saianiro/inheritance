public class Main {
    public static void main(String[] args) {
        System.out.println("Esercizio ereditarietà");
        // registrare di versi animali
        // gatti, cani, pesci, rettili...

        // POLIMORFISMO trattare gli oggetti istanze di classi diverse
        // come oggetti appartenenti alla stessa classe

        //Cat animal1 = new Cat("Arthur", 15, 6);
        Animal animal1 = new Cat("Arthur", 15, 6);
        animal1.makeSound();

        //Dog animal2 = new Dog("Fido", 8, 4);
        Animal animal2 = new Dog("Fido", 8, 4);

        animal2.makeSound();

        //Fish animal3 = new Fish("Nemo", 3);
        Animal animal3 = new Fish("Nemo", 3);

        animal3.makeSound();
        animal3.swim();
    }
}
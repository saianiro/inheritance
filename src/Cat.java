public class Cat extends Mammal{

  private final boolean nails = true;

  public Cat(String name, int age, int udders) {
    super(name, age, udders);
  }

  @Override
  public void makeSound() {
    System.out.println("Il gatto miagola");
  }
}

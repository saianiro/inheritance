public class Dog extends Mammal{

  public Dog(String name, int age, int udders) {
    super(name, age, udders);
  }

  @Override
  public void makeSound() {
    System.out.println("il cane abbaia");
  }
}

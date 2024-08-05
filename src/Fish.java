public class Fish extends Animal {

  public Fish(String name, int age) {
    super(name, age);
  }

  @Override
  public void makeSound() {
    System.out.println("I pesci sono muti");
  }

  @Override
  public void breathe() {
    System.out.println("i pesci respirano attraverso le branchie");
  }

  @Override
  public void eat() {

  }
}

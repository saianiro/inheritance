public abstract class Mammal extends Animal {

  protected int udders;

  public Mammal(String name, int age, int udders) {
    super(name, age);
    this.udders = udders;
  }

  public void breastfeed() {
    System.out.println("I mammiferi allattano i loro cuccioli");
  }

  public void breathe() {
    System.out.println("Tutti i mammiferi respirano ossigeno");
  }

  @Override
  public void eat() {
    System.out.println("I mammiferi mangiano");
  }
}

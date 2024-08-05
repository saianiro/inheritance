public class Animal {

  protected String name;
  protected int age;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void makeSound() {
    System.out.println("Ogni animale fa un verso");
  }

  public void swim() {
    System.out.println("Tutti i pesci nuotano");
  }
}

public abstract class Animal implements LivingBeing, MovingBeing {

  protected String name;
  protected int age;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  /*public void makeSound() {
    //System.out.println("Ogni animale fa un verso");
  }*/
  // Metodi ASTRATTI : si posso scrivere all'interno di una classe astratta
  // è un etodo privo di implementazione (si scrive solo la firma)
  public abstract void makeSound();

  public void swim() {
    System.out.println("Tutti i pesci nuotano");
  }

  @Override
  public void move() {
    System.out.println("Quasi tutti gli animali si muovono");
  }
}

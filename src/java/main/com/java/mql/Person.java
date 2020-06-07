public class Person{
  private int age;
  private String firstName;
  private String lastName;

  public Person(int age, String firstName, String lastName)
  {
    this.age=age;
    this.firstName=firstName;
    this.lastName=lastName;
  }
  public int getAge()
  {
    return age;
  }
  public String getFirstName(){
    return firstName;
  }
  public String getLastName(){
    return lastName;
  }
}
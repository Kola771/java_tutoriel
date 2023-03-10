package bj.highfive;

public class Person {
    // Déclaration des membres
    private String firstName;
    private String lastName;
    private int age;

    // Génération des getters et setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Constructeur
    public Person() {
        super();
    }

    public int presente(String text, int age)
    {
        return age;
    }
    public String presente(int a, String text)
    {
        return "";
    }

    
}

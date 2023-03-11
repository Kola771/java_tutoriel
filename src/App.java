import bj.highfive.Adress;
import bj.highfive.Compteur;
import bj.highfive.Person;

public class App {
    public static void main(String[] args) throws Exception {
        // Person person = new Person("Kola", "ABOUDOU", 18);
        // Person person1 = new Person("Bola", "MEDENOU", 140);
        // System.out.println(person);
        // System.out.println(Person.foot);
        // Compteur c1 = new Compteur();
        // Compteur c2 = new Compteur();
        // Compteur c3 = new Compteur();
        // System.out.println(c1);
        // System.out.println(c2);
        // System.out.println(c3);
        Adress adress = new Adress("France", "Paris");
        Person person = new Person("Kola", "ABOUDOU", 18, adress);
        person.present();

    }
}

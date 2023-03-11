package bj.highfive;

public class Person {

    // Déclaration des variables
    private String fname;
    private String lname;
    private int age;
    final private String profession = "Investisseur";
    private Adress adresse;
    // public static int foot = 2;
    public static int foot;

    // Bloc Static
    static {
        System.out.println("Appel du bloc static");
        foot = 2;
    }

    public String getFname()
    {
        return this.fname;
    }

    public String getLname()
    {
        return this.lname;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setFname(String fn)
    {
        this.fname = fn;
    }

    public void setLname(String ln)
    {
        this.lname = ln;
    }

    public void setAge(int a)
    {
        this.age = a;
    }

    @Override
    public String toString()
    {
        return "{"+this.getFname() +", "+ this.getLname() +", "+ this.getAge()+"}";
    }

    // public double toString(double a)
    // {
    //     return a;
    // }

    // Constructeurs
    public Person()
    {
        super();
        System.out.println("Appel du constructor");
    }

    public Person(String fn)
    {
        this.fname = fn;
        System.out.println("Appel du constructor");
    }

    public Person(String fn, String ln)
    {
        this.fname = fn;
        this.lname = ln;
        System.out.println("Appel du constructor");
    }

    public Person(String fn, String ln, int a)
    {
        this.fname = fn;
        this.lname = ln;
        this.age = a;
        System.out.println("Appel du constructor");
    }

    public Person(String fname, String lname, int age, Adress adresse) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.adresse = adresse;
    }

    // final public void present()
    // {
    //     System.out.println("Je suis " + this.fname + ", j\'ai " + this.age);
    // }

    public void present() {
        System.out.println("Je me nomme " + this.getFname() + " " + this.getLname() + " et j'ai " + this.age + "ans.");
        this.adresse.ShowAdress();
    }
    
}

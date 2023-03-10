package bj.highfive;

public class Compteur {
    public static int i;
    // Bloc Static
    static {
        i = 0;
    }

    // Constructeur
    public Compteur()
    {
        i++;
        System.out.println(i);
    }
}

package bj.highfive;

public class Adress {
    private String country;
    private String city;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Adress(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public void ShowAdress() {
        System.out.println("J'habite à " + this.city + " (" + this.country + ")");
    }
    

}

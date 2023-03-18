package Bankomat;

public class Account {
    private String name;
    private int balans;
    private int numb;
    private int pin;

    public Account(String name, int balans, int numb, int pin) {
        this.name = name;
        this.balans = balans;
        this.numb = numb;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalans() {
        return balans;
    }

    public void setBalans(int balans) {
        this.balans = balans;
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}

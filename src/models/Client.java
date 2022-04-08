package models;

public class Client {

    private String name;

    private final static int DISCOUNT_RATE = 15;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

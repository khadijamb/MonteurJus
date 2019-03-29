package model;

public class Jus {
    private int eau;
    private int sucre;
    private String fruit="";

    public void setEau(int eau) {
        this.eau = eau;
    }

    public void setSucre(int sucre) {
        this.sucre = sucre;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    @Override
    public String toString() {
        return "Jus{" +
                "eau=" + eau +
                ", sucre=" + sucre +
                ", fruit='" + fruit + '\'' +
                '}';
    }
}
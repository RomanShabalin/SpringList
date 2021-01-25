package fruits;

import interfaces.Fruit;

public class Fruits implements Fruit {
    private String fruit;
    private String countryOfOrigin;
    private boolean sale;

    public Fruits() {

    }

    public Fruits(String fruit, String countryOfOrigin) {
        this.fruit = fruit;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public void setForSale(boolean sale) {
        this.sale = sale;
    }

    @Override
    public boolean getForSale() {
        return sale;
    }

    @Override
    public String toString() {
        return "fruit: " + fruit + ", countryOfOrigin: " + countryOfOrigin + ", for sale: " + getForSale();
    }
}

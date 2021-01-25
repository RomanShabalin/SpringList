package vegitables;

import interfaces.Vegetable;

public class Vegetables implements Vegetable {
    private String vegetable;
    private String countryOfOrigin;
    private boolean sale;

    public Vegetables() {

    }

    public Vegetables(String vegetable, String countryOfOrigin) {
        this.vegetable = vegetable;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getVegetable() {
        return vegetable;
    }

    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
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
        return "vegetable: " + vegetable + ", countryOfOrigin: " + countryOfOrigin + ", for sale: " + getForSale();
    }
}

package TVs;

import interfaces.TV;

import java.util.HashMap;
import java.util.Map;

public class TVs implements TV {
    private String name;
    private String model;
    private String countryOfOrigin;
    private boolean sale;

    public TVs() {

    }

    public TVs(String name, String model, String countryOfOrigin) {
        this.name = name;
        this.model = model;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
        return "name: " + name + ", model: " + model + ", countryOfOrigin: " + countryOfOrigin + ", for sale: " + getForSale();
    }

    private Map<String, String> tvMap = new HashMap<>();

    public Map<String, String> getTvMap() {
        return tvMap;
    }

    public void setTvMap(Map<String, String> tvMap) {
        this.tvMap = tvMap;
    }
}

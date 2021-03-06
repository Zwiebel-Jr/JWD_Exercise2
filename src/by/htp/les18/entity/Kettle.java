package by.htp.les18.entity;

import java.util.Map;
import java.util.Objects;

public class Kettle extends Appliance{
    private float powerConsumption, weight, capacity, height, width;
    private String filter, bodyMaterial;

    public Kettle(){}

    public Kettle(float price, float powerConsumption, float weight, float capacity, float height, float width, String filter, String bodyMaterial) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.height = height;
        this.width = width;
        this.filter = filter;
        this.bodyMaterial = bodyMaterial;
    }

    public void setAllParameters(Map<String, String> parameters){
        this.setPrice(Float.parseFloat(parameters.get("PRICE")));
        this.setPowerConsumption(Float.parseFloat(parameters.get("POWER_CONSUMPTION")));
        this.setWeight(Float.parseFloat(parameters.get("WEIGHT")));
        this.setCapacity(Float.parseFloat(parameters.get("CAPACITY")));
        this.setHeight(Float.parseFloat(parameters.get("Height")));
        this.setWidth(Float.parseFloat(parameters.get("WIDTH")));
        this.setFilter(parameters.get("FILTER"));
        this.setBodyMaterial(parameters.get("BODY_MATERIAL"));
    }

    public float getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(float powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Kettle kettle = (Kettle) o;
        return Float.compare(kettle.powerConsumption, powerConsumption) == 0 && Float.compare(kettle.weight, weight) == 0 && Float.compare(kettle.capacity, capacity) == 0 && Float.compare(kettle.height, height) == 0 && Float.compare(kettle.width, width) == 0 && filter.equals(kettle.filter) && bodyMaterial.equals(kettle.bodyMaterial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, weight, capacity, height, width, filter, bodyMaterial);
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", height=" + height +
                ", width=" + width +
                ", filter='" + filter + '\'' +
                ", bodyMaterial='" + bodyMaterial + '\'' +
                '}';
    }
}

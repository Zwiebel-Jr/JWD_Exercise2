package by.htp.les18.entity;

import java.util.Map;
import java.util.Objects;

public class Refrigerator extends Appliance{
    private float powerConsumption, weight, freezerCapacity, overallCapacity, height, width;

    public Refrigerator(){}

    public Refrigerator(float price, float powerConsumption, float weight, float freezerCapacity, float overallCapacity, float height, float width) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public void setAllParameters(Map<String, String> parameters){
        this.setOverallCapacity(Float.parseFloat(parameters.get("OVERALL_CAPACITY")));
        this.setFreezerCapacity(Float.parseFloat(parameters.get("FREEZER_CAPACITY")));
        this.setHeight(Float.parseFloat(parameters.get("HEIGHT")));
        this.setWeight(Float.parseFloat(parameters.get("WEIGHT")));
        this.setPowerConsumption(Float.parseFloat(parameters.get("POWER_CONSUMPTION")));
        this.setPrice(Float.parseFloat(parameters.get("PRICE")));
        this.setWidth(Float.parseFloat(parameters.get("WIDTH")));

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

    public float getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(float freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public float getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(float overallCapacity) {
        this.overallCapacity = overallCapacity;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Refrigerator that = (Refrigerator) o;
        return Float.compare(that.powerConsumption, powerConsumption) == 0 && Float.compare(that.weight, weight) == 0 && Float.compare(that.freezerCapacity, freezerCapacity) == 0 && Float.compare(that.overallCapacity, overallCapacity) == 0 && Float.compare(that.height, height) == 0 && Float.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "price=" + getPrice() +
                ", powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    // you may add your own code here
}

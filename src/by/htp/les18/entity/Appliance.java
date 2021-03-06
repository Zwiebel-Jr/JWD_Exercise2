package by.htp.les18.entity;

import java.util.Map;
import java.util.Objects;

public abstract class Appliance {
    private float price;

    public Appliance(){}

    public Appliance(float price) {
        this.price = price;
    }

    public void setAllParameters(Map<String, String> parameters){};

        public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }else if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Appliance appliance = (Appliance) object;
        return Float.compare(appliance.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "price=" + price +
                '}';
    }

    // you may add your own code here
}

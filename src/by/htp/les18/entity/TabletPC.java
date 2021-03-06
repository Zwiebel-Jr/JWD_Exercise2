package by.htp.les18.entity;

import java.util.Map;
import java.util.Objects;

public class TabletPC extends Appliance{
    private String color;
    private float flashMemoryCapacity, batteryCapacity, displayInches;
    private int memoryROM;

    public TabletPC(){}

    public TabletPC(float price, String color, float flashMemoryCapacity, float batteryCapacity, float displayInches, int memoryROM) {
        super(price);
        this.color = color;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
    }

    public void setAllParameters(Map<String, String> parameters){
        this.setBatteryCapacity(Float.parseFloat(parameters.get("BATTERY_CAPACITY")));
        this.setDisplayInches(Float.parseFloat(parameters.get("DISPLAY_INCHES")));
        this.setMemoryROM(Integer.parseInt(parameters.get("MEMORY_ROM")));
        this.setColor(parameters.get("COLOR"));
        this.setFlashMemoryCapacity(Float.parseFloat(parameters.get("POWER_CONSUMPTION")));
        this.setPrice(Float.parseFloat(parameters.get("PRICE")));

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(float flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public float getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(float displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Float.compare(tabletPC.flashMemoryCapacity, flashMemoryCapacity) == 0 && Float.compare(tabletPC.batteryCapacity, batteryCapacity) == 0 && Float.compare(tabletPC.displayInches, displayInches) == 0 && memoryROM == tabletPC.memoryROM && color.equals(tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, flashMemoryCapacity, batteryCapacity, displayInches, memoryROM);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "color='" + color + '\'' +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryROM=" + memoryROM +
                '}';
    }

    // you may add your own code here
}

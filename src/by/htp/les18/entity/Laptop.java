package by.htp.les18.entity;

import java.util.Map;
import java.util.Objects;

public class Laptop extends Appliance{
    private float batteryCapacity, CPU, displayInches;
    private int memoryROM, systemMemory;
    private String OS;

    public Laptop(){}

    public Laptop(float price, float batteryCapacity, float CPU, float displayInchs, int memoryROM, int systemMemory, String OS) {
        super(price);
        this.batteryCapacity = batteryCapacity;
        this.CPU = CPU;
        this.displayInches = displayInchs;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        this.OS = OS;
    }

    public void setAllParameters(Map<String, String> parameters){
        this.setBatteryCapacity(Float.parseFloat(parameters.get("BATTERY_CAPACITY")));
        this.setCPU(Float.parseFloat(parameters.get("CPU")));
        this.setDisplayInches(Float.parseFloat(parameters.get("DISPLAY_INCHES")));
        this.setMemoryROM(Integer.parseInt(parameters.get("MEMORY_ROM")));
        this.setOS(parameters.get("OS"));
        this.setPrice(Float.parseFloat(parameters.get("PRICE")));
        this.setSystemMemory(Integer.parseInt(parameters.get("SYSTEM_MEMORY")));
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public float getCPU() {
        return CPU;
    }

    public void setCPU(float CPU) {
        this.CPU = CPU;
    }

    public float getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(float displayInchs) {
        this.displayInches = displayInchs;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Float.compare(laptop.batteryCapacity, batteryCapacity) == 0 && Float.compare(laptop.CPU, CPU) == 0 && Float.compare(laptop.displayInches, displayInches) == 0 && memoryROM == laptop.memoryROM && systemMemory == laptop.systemMemory && OS.equals(laptop.OS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity, CPU, displayInches, memoryROM, systemMemory, OS);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", CPU=" + CPU +
                ", displayInchs=" + displayInches +
                ", memoryROM=" + memoryROM +
                ", systemMemory=" + systemMemory +
                ", OS='" + OS + '\'' +
                '}';
    }

    // you may add your own code here
}

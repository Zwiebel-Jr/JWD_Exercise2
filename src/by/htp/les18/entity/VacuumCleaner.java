package by.htp.les18.entity;

import java.util.Map;
import java.util.Objects;

public class VacuumCleaner extends Appliance{
    private float powerConsumption, motorSpeedRegulation, cleaningWidth;
    private String filterType, bagType, wandType;

    public VacuumCleaner(){}

    public VacuumCleaner(float price, float powerConsumption, float motorSpeedRegulation, float cleaningWidth, String filterType, String bagType, String wandType) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
    }

    public void setAllParameters(Map<String, String> parameters){
        this.setCleaningWidth(Float.parseFloat(parameters.get("CLEANING_WIDTH")));
        this.setWandType(parameters.get("WAND_TYPE"));
        this.setFilterType(parameters.get("FILTER_TYPE"));
        this.setBagType(parameters.get("BAG_TYPE"));
        this.setPowerConsumption(Float.parseFloat(parameters.get("POWER_CONSUMPTION")));
        this.setPrice(Float.parseFloat(parameters.get("PRICE")));
        this.setMotorSpeedRegulation(Float.parseFloat(parameters.get("MOTOR_SPEED_REGULATION")));

    }

    public float getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(float powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public float getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(float motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public float getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(float cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Float.compare(that.powerConsumption, powerConsumption) == 0 && Float.compare(that.motorSpeedRegulation, motorSpeedRegulation) == 0 && Float.compare(that.cleaningWidth, cleaningWidth) == 0 && filterType.equals(that.filterType) && bagType.equals(that.bagType) && wandType.equals(that.wandType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, motorSpeedRegulation, cleaningWidth, filterType, bagType, wandType);
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "powerConsumption=" + powerConsumption +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                '}';
    }

    // you may add your own code here
}

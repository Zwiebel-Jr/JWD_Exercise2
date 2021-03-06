package by.htp.les18.entity;

import java.util.Map;
import java.util.Objects;

public class Speakers extends Appliance{
    private float powerConsumption, cordLength;
    private int numberOfSpeakers;
    private String frequencyRange;

    public Speakers(){}

    public Speakers(float price, float powerConsumption, float cordLength, int numberOfSpeakers, String frequencyRange) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.cordLength = cordLength;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
    }

    public void setAllParameters(Map<String, String> parameters){
        this.setFrequencyRange(parameters.get("FREQUENCY_RANGE"));
        this.setNumberOfSpeakers(Integer.parseInt(parameters.get("NUMBER_OF_SPEAKERS")));
        this.setCordLength(Float.parseFloat(parameters.get("CORD_LENGTH")));
        this.setPowerConsumption(Float.parseFloat(parameters.get("POWER_CONSUMPTION")));
        this.setPrice(Float.parseFloat(parameters.get("PRICE")));
    }

    public float getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(float powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public float getCordLength() {
        return cordLength;
    }

    public void setCordLength(float cordLength) {
        this.cordLength = cordLength;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Speakers speakers = (Speakers) o;
        return Float.compare(speakers.powerConsumption, powerConsumption) == 0 && Float.compare(speakers.cordLength, cordLength) == 0 && numberOfSpeakers == speakers.numberOfSpeakers && frequencyRange.equals(speakers.frequencyRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, cordLength, numberOfSpeakers, frequencyRange);
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", cordLength=" + cordLength +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange='" + frequencyRange + '\'' +
                '}';
    }

    // you may add your own code here
}

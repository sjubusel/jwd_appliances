package by.epamtc.jwd.busel.supplementary_assignment.model.impl;

import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;
import by.epamtc.jwd.busel.supplementary_assignment.model.Parameter;

import java.util.Objects;

public class Speakers implements Appliance {
    private Type type;
    private double powerConsumption;
    private int numberOfSpeakers;
    private String frequentRange;
    private double cordLength;

    public Speakers(Type type, double powerConsumption, int numberOfSpeakers,
            String frequentRange, double cordLength) {
        this.type = type;
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequentRange = frequentRange;
        this.cordLength = cordLength;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequentRange() {
        return frequentRange;
    }

    public void setFrequentRange(String frequentRange) {
        this.frequentRange = frequentRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Speakers speakers = (Speakers) o;
        return Objects.equals(type, speakers.type)
                && Objects.equals(frequentRange, speakers.frequentRange)
                && (powerConsumption == speakers.powerConsumption)
                && (numberOfSpeakers == speakers.numberOfSpeakers)
                && (cordLength == speakers.cordLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, powerConsumption, numberOfSpeakers,
                frequentRange, cordLength);
    }

    @Override
    public String toString() {
        return "Appliance{type: " + type.getName() + "; parameters: " +
                Parameter.SPEAKERS_POWER_CONSUMPTION +
                "=" + powerConsumption + ", " +
                Parameter.SPEAKERS_NUMBER_OF_SPEAKERS +
                "=" + numberOfSpeakers + ", " +
                Parameter.SPEAKERS_FREQUENCY_RANGE +
                "=" + frequentRange + ", " +
                Parameter.SPEAKERS_CORD_LENGTH + "=" + cordLength + "}";
    }

    @Override
    public String receiveTypeName() {
        return getType().getName();
    }
}

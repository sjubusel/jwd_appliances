package by.epamtc.jwd.busel.supplementary_assignment.model;

import java.util.HashMap;

public class Speakers implements Appliance {
    private Type type;
    private double powerConsumption;
    private int numberOfSpeakers;
    private String frequentRange;
    private double cordLength;

    public Speakers(Type type, HashMap<String, String> parameters) {
        this.type = type;
        String cons = parameters.get(Parameter.SPEAKERS_POWER_CONSUMPTION);
        powerConsumption = Double.parseDouble(cons);
        String quantity = parameters.get(Parameter.SPEAKERS_NUMBER_OF_SPEAKERS);
        numberOfSpeakers = Integer.parseInt(quantity);
        frequentRange = parameters.get(Parameter.SPEAKERS_FREQUENCY_RANGE);
        String lengthOfCord = parameters.get(Parameter.SPEAKERS_CORD_LENGTH);
        cordLength = Double.parseDouble(lengthOfCord);
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

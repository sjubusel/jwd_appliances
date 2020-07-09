package by.epamtc.jwd.busel.supplementary_assignment.model.impl;

import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;
import by.epamtc.jwd.busel.supplementary_assignment.model.Parameter;

import java.util.HashMap;

public class Refrigerator implements Appliance {
    private Type type;
    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    public Refrigerator(Type type, HashMap<String, String> parameters) {
        this.type = type;
        String cons = parameters.get(Parameter.REFRIGERATOR_POWER_CONSUMPTION);
        powerConsumption = Double.parseDouble(cons);
        String w = parameters.get(Parameter.REFRIGERATOR_WEIGHT);
        weight = Double.parseDouble(w);
        String fCap = parameters.get(Parameter.REFRIGERATOR_FREEZER_CAPACITY);
        freezerCapacity = Double.parseDouble(fCap);
        String oCap = parameters.get(Parameter.REFRIGERATOR_OVERALL_CAPACITY);
        overallCapacity = Double.parseDouble(oCap);
        String h = parameters.get(Parameter.REFRIGERATOR_HEIGHT);
        height = Double.parseDouble(h);
        String wid = parameters.get(Parameter.REFRIGERATOR_WIDTH);
        width = Double.parseDouble(wid);
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Appliance{type: " + type.getName() + "; parameters: " +
                Parameter.REFRIGERATOR_POWER_CONSUMPTION +
                "=" + powerConsumption + ", " +
                Parameter.REFRIGERATOR_WEIGHT + "=" + weight + ", " +
                Parameter.REFRIGERATOR_FREEZER_CAPACITY +
                "=" + freezerCapacity + ", " +
                Parameter.REFRIGERATOR_OVERALL_CAPACITY +
                "=" + overallCapacity + ", " +
                Parameter.REFRIGERATOR_HEIGHT + "=" + height + ", " +
                Parameter.REFRIGERATOR_WIDTH + "=" + width + "}";
    }

    @Override
    public String receiveTypeName() {
        return getType().getName();
    }
}

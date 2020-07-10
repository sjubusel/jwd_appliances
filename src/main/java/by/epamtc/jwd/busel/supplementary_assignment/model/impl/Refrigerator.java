package by.epamtc.jwd.busel.supplementary_assignment.model.impl;

import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;
import by.epamtc.jwd.busel.supplementary_assignment.model.Parameter;

import java.util.Objects;

public class Refrigerator implements Appliance {
    private Type type;
    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    public Refrigerator(Type type, double powerConsumption, double weight,
            double freezerCapacity, double overallCapacity, double height,
            double width) {
        this.type = type;
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Refrigerator ref = (Refrigerator) o;
        return Objects.equals(type, ref.type)
                && (powerConsumption == ref.powerConsumption)
                && (weight == ref.weight)
                && (freezerCapacity == ref.freezerCapacity)
                && (overallCapacity == ref.freezerCapacity)
                && (height == ref.height)
                && (width == ref.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, powerConsumption, weight, freezerCapacity,
                overallCapacity, height, width);
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

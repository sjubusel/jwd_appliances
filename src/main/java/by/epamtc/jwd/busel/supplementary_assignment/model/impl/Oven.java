package by.epamtc.jwd.busel.supplementary_assignment.model.impl;

import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;
import by.epamtc.jwd.busel.supplementary_assignment.model.Parameter;

import java.util.Objects;

public class Oven implements Appliance {
    private Type type;
    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public Oven(Type type, double powerConsumption, double weight,
            double capacity, double depth, double height, double width) {
        this.type = type;
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
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

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
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
        Oven oven = (Oven) o;
        return Objects.equals(type, oven.type)
                && (powerConsumption == oven.powerConsumption)
                && (weight == oven.weight)
                && (capacity == oven.capacity)
                && (depth == oven.depth)
                && (height == oven.height)
                && (width == oven.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, powerConsumption, weight, capacity, depth,
                height, width);
    }

    @Override
    public String toString() {
        return "Appliance{type: " + type.getName() + "; parameters: " +
                Parameter.OVEN_POWER_CONSUMPTION + "=" + powerConsumption + ", " +
                Parameter.OVEN_WEIGHT + "=" + weight + ", " +
                Parameter.OVEN_CAPACITY + "=" + capacity + ", " +
                Parameter.OVEN_DEPTH + "=" + depth + ", " +
                Parameter.OVEN_HEIGHT + "=" + height + ", " +
                Parameter.OVEN_WIDTH + "=" + width + "}";
    }

    @Override
    public String receiveTypeName() {
        return getType().getName();
    }
}

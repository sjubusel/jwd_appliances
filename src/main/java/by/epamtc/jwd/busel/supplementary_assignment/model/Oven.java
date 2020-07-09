package by.epamtc.jwd.busel.supplementary_assignment.model;

import java.util.HashMap;

public class Oven implements Appliance {
    private Type type;
    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public Oven(Type type, HashMap<String, String> parameters) {
        this.type = type;
        String pCons = parameters.get(Parameter.OVEN_POWER_CONSUMPTION);
        powerConsumption = Double.parseDouble(pCons);
        String w = parameters.get(Parameter.OVEN_WEIGHT);
        weight = Double.parseDouble(w);
        String cap = parameters.get(Parameter.OVEN_CAPACITY);
        capacity = Double.parseDouble(cap);
        String d = parameters.get(Parameter.OVEN_DEPTH);
        depth = Double.parseDouble(d);
        String h = parameters.get(Parameter.OVEN_HEIGHT);
        height = Double.parseDouble(h);
        String wid = parameters.get(Parameter.OVEN_WIDTH);
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

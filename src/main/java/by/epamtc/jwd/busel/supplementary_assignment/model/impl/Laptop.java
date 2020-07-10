package by.epamtc.jwd.busel.supplementary_assignment.model.impl;

import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;
import by.epamtc.jwd.busel.supplementary_assignment.model.Parameter;

import java.util.Objects;

public class Laptop implements Appliance {
    private Type type;
    private double batteryCapacity;
    private String operatingSystem;
    private double memoryRom;
    private double systemMemory;
    private double cpu;
    private double displayInches;

    public Laptop(Type type, double batteryCapacity, String operatingSystem,
            double memoryRom, double systemMemory, double cpu,
            double displayInches) {
        this.type = type;
        this.batteryCapacity = batteryCapacity;
        this.operatingSystem = operatingSystem;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Laptop laptop = (Laptop) o;
        return Objects.equals(type, laptop.type)
                && Objects.equals(operatingSystem, laptop.operatingSystem)
                && (batteryCapacity == laptop.batteryCapacity)
                && (memoryRom == laptop.memoryRom)
                && (systemMemory == laptop.systemMemory)
                && (cpu == laptop.cpu)
                && (displayInches == laptop.displayInches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, batteryCapacity, operatingSystem, memoryRom,
                systemMemory, cpu, displayInches);
    }

    @Override
    public String toString() {
        return "Appliance{type: " + type.getName() + "; parameters: " +
                Parameter.LAPTOP_BATTERY_CAPACITY + "=" + batteryCapacity + ", " +
                Parameter.LAPTOP_OS + "=" + operatingSystem + ", " +
                Parameter.LAPTOP_MEMORY_ROM + " = " + memoryRom + ", " +
                Parameter.LAPTOP_SYSTEM_MEMORY + "=" + systemMemory + ", " +
                Parameter.LAPTOP_CPU + "=" + cpu + ", " +
                Parameter.LAPTOP_DISPLAY_INCHS + "=" + displayInches + "}";
    }

    @Override
    public String receiveTypeName() {
        return getType().getName();
    }
}

package by.epamtc.jwd.busel.supplementary_assignment.model;

import java.util.HashMap;

public class Laptop implements Appliance {
    private Type type;
    private double batteryCapacity;
    private String operatingSystem;
    private double memoryRom;
    private double systemMemory;
    private double cpu;
    private double displayInches;

    public Laptop(Type type, HashMap<String, String> parameters) {
        this.type = type;
        String bCap = parameters.get(Parameter.LAPTOP_BATTERY_CAPACITY);
        batteryCapacity = Double.parseDouble(bCap);
        operatingSystem = parameters.get(Parameter.LAPTOP_OS);
        String memRom = parameters.get(Parameter.LAPTOP_MEMORY_ROM);
        memoryRom = Double.parseDouble(memRom);
        String sysMem = parameters.get(Parameter.LAPTOP_SYSTEM_MEMORY);
        systemMemory = Double.parseDouble(sysMem);
        String proc = parameters.get(Parameter.LAPTOP_CPU);
        cpu = Double.parseDouble(proc);
        String inches = parameters.get(Parameter.LAPTOP_DISPLAY_INCHS);
        displayInches = Double.parseDouble(inches);
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

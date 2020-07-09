package by.epamtc.jwd.busel.supplementary_assignment.model.impl;

import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;
import by.epamtc.jwd.busel.supplementary_assignment.model.Parameter;

import java.util.HashMap;
import java.util.Objects;

public class TabletPc implements Appliance {
    private Type type;
    private double batteryCapacity;
    private double displayInches;
    private double memoryRom;
    private double flashMemoryCapacity;
    private String color;

    public TabletPc(Type type, HashMap<String, String> parameters) {
        this.type = type;
        final String cap = parameters.get(Parameter.TABLET_PC_BATTERY_CAPACITY);
        batteryCapacity = Double.parseDouble(cap);
        String inches = parameters.get(Parameter.TABLET_PC_DISPLAY_INCHES);
        displayInches = Double.parseDouble(inches);
        String rom = parameters.get(Parameter.TABLET_PC_MEMORY_ROM);
        memoryRom = Double.parseDouble(rom);
        String flash = parameters.get(Parameter.TABLET_PC_FLASH_MEMORY_CAPACITY);
        flashMemoryCapacity = Double.parseDouble(flash);
        color = parameters.get(Parameter.TABLET_PC_COLOR);
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

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TabletPc tabletPc = (TabletPc) o;
        return Objects.equals(type, tabletPc.type)
                && Objects.equals(color, tabletPc.color)
                && batteryCapacity == tabletPc.batteryCapacity
                && displayInches == tabletPc.displayInches
                && memoryRom == tabletPc.memoryRom
                && flashMemoryCapacity == tabletPc.flashMemoryCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, batteryCapacity, displayInches, memoryRom,
                flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return "Appliance{type: " + type.getName() + "; parameters: " +
                Parameter.TABLET_PC_BATTERY_CAPACITY +
                "=" + batteryCapacity + ", " +
                Parameter.TABLET_PC_DISPLAY_INCHES +
                "=" + displayInches + ", " +
                Parameter.TABLET_PC_MEMORY_ROM + "=" + memoryRom + ", " +
                Parameter.TABLET_PC_FLASH_MEMORY_CAPACITY +
                "=" + flashMemoryCapacity + ", " +
                Parameter.TABLET_PC_COLOR + "=" + color + "}";
    }

    @Override
    public String receiveTypeName() {
        return getType().getName();
    }
}

package by.epamtc.jwd.busel.supplementary_assignment.model;

import java.util.HashMap;

public class VacuumCleaner implements Appliance {
    private Type type;
    private double powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;


    public VacuumCleaner(Type type, HashMap<String, String> parameters) {
        this.type = type;
        String cons = parameters.get(Parameter.VACUUM_CLEANER_POWER_CONSUMPTION);
        powerConsumption = Double.parseDouble(cons);
        filterType = parameters.get(Parameter.VACUUM_CLEANER_FILTER_TYPE);
        bagType = parameters.get(Parameter.VACUUM_CLEANER_BAG_TYPE);
        wandType = parameters.get(Parameter.VACUUM_CLEANER_WAND_TYPE);
        String r = parameters.get(Parameter.VACUUM_CLEANER_MOTOR_SPEED_REGULATION);
        motorSpeedRegulation = Double.parseDouble(r);
        String clWid = parameters.get(Parameter.VACUUM_CLEANER_CLEANING_WIDTH);
        cleaningWidth = Double.parseDouble(clWid);
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

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public String toString() {
        return "Appliance{type: " + type.getName() + "; parameters: " +
                Parameter.VACUUM_CLEANER_POWER_CONSUMPTION +
                "=" + powerConsumption + ", " +
                Parameter.VACUUM_CLEANER_FILTER_TYPE +
                "=" + filterType + ", " +
                Parameter.VACUUM_CLEANER_BAG_TYPE + "=" + bagType + ", " +
                Parameter.VACUUM_CLEANER_WAND_TYPE + "=" + wandType + ", " +
                Parameter.VACUUM_CLEANER_MOTOR_SPEED_REGULATION +
                "=" + motorSpeedRegulation + ", " +
                Parameter.VACUUM_CLEANER_CLEANING_WIDTH +
                "=" + cleaningWidth + "}";
    }

    @Override
    public String receiveTypeName() {
        return getType().getName();
    }
}

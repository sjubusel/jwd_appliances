package by.epamtc.jwd.busel.supplementary_assignment.factory.impl;

import by.epamtc.jwd.busel.supplementary_assignment.factory.ApplianceCreator;
import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;
import by.epamtc.jwd.busel.supplementary_assignment.model.impl.TabletPc;

import java.util.List;

public class TabletPcCreator extends ApplianceCreator {
    @Override
    public Appliance createAppliance(List<String> parameterValues) {
        int i = 0;
        double batteryCapacity = Double.parseDouble(parameterValues.get(i++));
        double displayInches = Double.parseDouble(parameterValues.get(i++));
        double memoryRom = Double.parseDouble(parameterValues.get(i++));
        double flashMemoryCapacity = Double.parseDouble(parameterValues.get(i++));
        String color = parameterValues.get(i);
        return new TabletPc(Appliance.Type.TABLET_PC, batteryCapacity,
                displayInches, memoryRom, flashMemoryCapacity, color);
    }
}

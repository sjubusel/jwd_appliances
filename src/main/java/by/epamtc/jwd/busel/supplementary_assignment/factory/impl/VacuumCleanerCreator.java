package by.epamtc.jwd.busel.supplementary_assignment.factory.impl;

import by.epamtc.jwd.busel.supplementary_assignment.factory.ApplianceCreator;
import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;
import by.epamtc.jwd.busel.supplementary_assignment.model.impl.VacuumCleaner;

import java.util.List;

public class VacuumCleanerCreator extends ApplianceCreator {
    @Override
    public Appliance createAppliance(List<String> parameterValues) {
        int i = 0;
        double powerConsumption = Double.parseDouble(parameterValues.get(i++));
        String filterType = parameterValues.get(i++);
        String bagType = parameterValues.get(i++);
        String wandType = parameterValues.get(i++);
        double motorSpeedRegulation = Double.parseDouble(parameterValues.get(i++));
        double cleaningWidth = Double.parseDouble(parameterValues.get(i));
        return new VacuumCleaner(Appliance.Type.VACUUM_CLEANER, powerConsumption,
                filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }
}

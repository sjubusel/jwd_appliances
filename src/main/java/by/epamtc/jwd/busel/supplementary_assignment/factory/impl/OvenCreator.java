package by.epamtc.jwd.busel.supplementary_assignment.factory.impl;

import by.epamtc.jwd.busel.supplementary_assignment.factory.ApplianceCreator;
import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;
import by.epamtc.jwd.busel.supplementary_assignment.model.impl.Oven;

import java.util.List;

public class OvenCreator extends ApplianceCreator {
    @Override
    public Appliance createAppliance(List<String> parameterValues) {
        int i = 0;
        double powerConsumption = Double.parseDouble(parameterValues.get(i++));
        double weight = Double.parseDouble(parameterValues.get(i++));
        double capacity = Double.parseDouble(parameterValues.get(i++));
        double depth = Double.parseDouble(parameterValues.get(i++));
        double height = Double.parseDouble(parameterValues.get(i++));
        double width = Double.parseDouble(parameterValues.get(i));
        return new Oven(Appliance.Type.OVEN, powerConsumption, weight, capacity,
                depth, height, width);
    }
}

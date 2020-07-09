package by.epamtc.jwd.busel.supplementary_assignment.factory.impl;

import by.epamtc.jwd.busel.supplementary_assignment.factory.ApplianceCreator;
import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;
import by.epamtc.jwd.busel.supplementary_assignment.model.impl.Refrigerator;

import java.util.List;

public class RefrigeratorCreator extends ApplianceCreator {
    @Override
    public Appliance createAppliance(List<String> parameterValues) {
        int i = 0;
        double powerConsumption = Double.parseDouble(parameterValues.get(i++));
        double weight = Double.parseDouble(parameterValues.get(i++));
        double freezerCapacity = Double.parseDouble(parameterValues.get(i++));
        double overallCapacity = Double.parseDouble(parameterValues.get(i++));
        double height = Double.parseDouble(parameterValues.get(i++));
        double width = Double.parseDouble(parameterValues.get(i));
        return new Refrigerator(Appliance.Type.REFRIGERATOR, powerConsumption,
                weight, freezerCapacity, overallCapacity, height, width);
    }
}

package by.epamtc.jwd.busel.supplementary_assignment.factory;

import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;

import java.util.List;

public abstract class ApplianceCreator {
    public abstract Appliance createAppliance(List<String> parameterValues);
}

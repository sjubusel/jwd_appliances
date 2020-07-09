package by.epamtc.jwd.busel.supplementary_assignment.service;

import by.epamtc.jwd.busel.supplementary_assignment.factory.ApplianceCreator;
import by.epamtc.jwd.busel.supplementary_assignment.factory.impl.*;
import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;

import java.util.List;

public class ApplianceGenerator {

    public static Appliance generateAppliance(Appliance.Type type,
            List<String> parameters) {
        ApplianceCreator creator;
        switch (type) {
            case OVEN:
                creator = new OvenCreator();
                break;
            case LAPTOP:
                creator = new LaptopCreator();
                break;
            case REFRIGERATOR:
                creator = new RefrigeratorCreator();
                break;
            case VACUUM_CLEANER:
                creator = new VacuumCleanerCreator();
                break;
            case TABLET_PC:
                creator = new TabletPcCreator();
                break;
            case SPEAKERS:
                creator = new SpeakersCreator();
                break;
            default:
                throw new RuntimeException("WRONG APPLIANCE TYPE PASSED"
                        + type.toString());
        }
        return creator.createAppliance(parameters);
    }

}

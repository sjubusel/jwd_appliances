package by.epamtc.jwd.busel.supplementary_assignment.service;

import by.epamtc.jwd.busel.supplementary_assignment.model.*;

import java.util.HashMap;
import java.util.NoSuchElementException;

public class ApplianceFactory {

    public static Appliance create(Appliance.Type type,
            HashMap<String, String> parameters) {
        switch (type) {
            case OVEN:
                return new Oven(type, parameters);
            case LAPTOP:
                return new Laptop(type, parameters);
            case REFRIGERATOR:
                return new Refrigerator(type, parameters);
            case VACUUM_CLEANER:
                return new VacuumCleaner(type, parameters);
            case TABLET_PC:
                return new TabletPc(type, parameters);
            case SPEAKERS:
                return new Speakers(type, parameters);
            default:
                throw new NoSuchElementException(type.toString());
        }
    }
}

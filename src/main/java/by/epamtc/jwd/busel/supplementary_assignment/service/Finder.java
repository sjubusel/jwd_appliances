package by.epamtc.jwd.busel.supplementary_assignment.service;

import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;

import java.util.ArrayList;
import java.util.List;

public class Finder {
    private Selector selector = new Selector();
    private ApplianceParser parser = new ApplianceParser();

    public List<Appliance> findAppliances(Appliance.Type type,
            String parameter, String value) {
        String matchValue = parameter + "=" + value;
        List<String> correctRecords = selector.selectAppliances(type, matchValue);

        List<Appliance> appliances = new ArrayList<>();
        for (String record : correctRecords) {
            appliances.add(parser.parseAppliance(record, type));
        }
        return appliances;
    }
}
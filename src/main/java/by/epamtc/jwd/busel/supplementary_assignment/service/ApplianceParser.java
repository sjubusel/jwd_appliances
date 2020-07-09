package by.epamtc.jwd.busel.supplementary_assignment.service;

import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;

import java.util.ArrayList;
import java.util.List;

public class ApplianceParser {
    private static final String PARAMETER_PAIRS_DELIMITER = ", ";
    private static final String PARAMETER_DELIMITER = "=";

    public Appliance generateAppliance(String line, Appliance.Type type) {
        int typePlusDelimiterOffset = type.getName().length() + 3;
        String[] paramPairs = line.substring(typePlusDelimiterOffset)
                .split(PARAMETER_PAIRS_DELIMITER);
        List<String> parameters = new ArrayList<>();
        for (String pair : paramPairs) {
            int delimiterIndex = pair.indexOf(PARAMETER_DELIMITER);
            parameters.add(pair.substring(delimiterIndex + 1));
        }
        return ApplianceFactory.create(type, parameters);
    }
}

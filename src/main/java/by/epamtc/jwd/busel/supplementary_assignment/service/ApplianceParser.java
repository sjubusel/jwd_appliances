package by.epamtc.jwd.busel.supplementary_assignment.service;

import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;

import java.util.HashMap;

public class ApplianceParser {
    private static final String PARAMETER_PAIRS_DELIMITER = ", ";
    private static final String PARAMETER_DELIMITER = "=";

    public Appliance generateAppliance(String line, Appliance.Type type) {
        int typePlusDelimiterOffset = type.getName().length() + 3;
        String[] paramPairs = line.substring(typePlusDelimiterOffset)
                .split(PARAMETER_PAIRS_DELIMITER);
        HashMap<String, String> parameters = new HashMap<>();
        for (String pair : paramPairs) {
            int delimiterIndex = pair.indexOf(PARAMETER_DELIMITER);
            parameters.put(pair.substring(0, delimiterIndex),
                    pair.substring(delimiterIndex + 1));
        }
        return ApplianceFactory.create(type, parameters);
    }
}

package by.epamtc.jwd.busel.supplementary_assignment.service;

import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;

import java.util.List;

public class LineValidator {
    private boolean doesLineContainParameters(String line, List<String> queryParameters) {
        boolean isContainable = true;
        for (String parameter : queryParameters) {
            int nextCharIndex = line.indexOf(parameter) + parameter.length();
            isContainable = isNextCharAppropriate(line, nextCharIndex);
        }
        return isContainable;
    }

    private boolean isNextCharAppropriate(String line, int nextCharCorrect) {
        return nextCharCorrect >= line.length()
                || line.charAt(nextCharCorrect) == ',';
    }

    public boolean isLineValid(String line, Appliance.Type type,
            List<String> queryParameters) {
        if (!line.startsWith(type.getName())) {
            return false;
        }
        return doesLineContainParameters(line, queryParameters);
    }
}

package by.epamtc.jwd.busel.supplementary_assignment.service;

import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;

public class LineValidator {
    private boolean isNextCharAppropriate(String line, int nextCharCorrect) {
        return nextCharCorrect >= line.length()
                || line.charAt(nextCharCorrect) == ',';
    }

    public boolean isLineValid(String line, Appliance.Type type, String matchValue) {
        int nextCharIndex = line.indexOf(matchValue) + matchValue.length();
        return line.startsWith(type.getName())
                && isNextCharAppropriate(line, nextCharIndex);
    }
}

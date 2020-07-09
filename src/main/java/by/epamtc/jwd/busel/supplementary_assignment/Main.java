package by.epamtc.jwd.busel.supplementary_assignment;

import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;
import by.epamtc.jwd.busel.supplementary_assignment.model.Parameter;
import by.epamtc.jwd.busel.supplementary_assignment.service.Finder;
import by.epamtc.jwd.busel.supplementary_assignment.service.Printer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Appliance.Type inputType = Appliance.Type.OVEN;
        String inputParameterKey = Parameter.OVEN_DEPTH;
        String inputParameterValue = "60";

        Finder finder = new Finder();
        List<Appliance> appliances = finder.findAppliances(inputType,
                inputParameterKey, inputParameterValue);

        Printer printer = new Printer();
        printer.printResults(appliances, inputType, inputParameterKey,
                inputParameterValue);
    }
}

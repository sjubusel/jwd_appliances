package by.epamtc.jwd.busel.supplementary_assignment;

import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;
import by.epamtc.jwd.busel.supplementary_assignment.model.Parameter;
import by.epamtc.jwd.busel.supplementary_assignment.service.Finder;
import by.epamtc.jwd.busel.supplementary_assignment.service.Printer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //There must be some logic of inputting and generating of search params instead of the following code
        Appliance.Type inputType = Appliance.Type.OVEN; // START
        List<String> queryParams = new ArrayList<>();
        String inputParameterKey1 = Parameter.OVEN_DEPTH;
        String inputParameterValue1 = "60";
        String inputParameterKey2 = Parameter.OVEN_WEIGHT;
        String inputParameterValue2 = "10";
        String delimiter = "=";
        queryParams.add(inputParameterKey1 + delimiter + inputParameterValue1);
        queryParams.add(inputParameterKey2 + delimiter + inputParameterValue2); // END

        Finder finder = new Finder();
        List<Appliance> appliances = finder.findAppliances(inputType,
                queryParams);

        Printer printer = new Printer();
        printer.printResults(appliances, inputType, queryParams);
    }
}

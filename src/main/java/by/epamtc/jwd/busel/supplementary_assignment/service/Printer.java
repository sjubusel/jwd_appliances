package by.epamtc.jwd.busel.supplementary_assignment.service;

import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;

import java.util.List;

public class Printer {

    public void printResults(List<Appliance> appliances, Appliance.Type inputType,
            String inputParameterKey, String inputParameterValue) {
        System.out.printf("RESULTS OF QUERY (%s : %s=%s):\n", inputType,
                inputParameterKey, inputParameterValue);
        if (appliances.size() > 0) {
            for (Appliance appliance : appliances) {
                System.out.println(appliance);
            }
        } else {
            System.out.println("Not found.");
        }
    }
}

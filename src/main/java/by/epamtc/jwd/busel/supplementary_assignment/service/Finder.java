package by.epamtc.jwd.busel.supplementary_assignment.service;

import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Finder {
    private FileAssistant fileAssistant = FileAssistant.getInstance();

    public List<Appliance> fetchAppliances(Appliance.Type type,
            String parameter, String value) {
        String matchValue = parameter + "=" + value;
        List<Appliance> appliances = new ArrayList<>();

        LineValidator validator = new LineValidator();
        ApplianceParser parser = new ApplianceParser();

        try (FileReader in = new FileReader(fileAssistant.getSourceFilePath());
             BufferedReader reader = new BufferedReader(in)) {
            while (reader.ready()) {
                String line = reader.readLine();
                if (validator.isLineValid(line, type, matchValue)) {
                    appliances.add(parser.generateAppliance(line, type));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return appliances;
    }
}
package by.epamtc.jwd.busel.supplementary_assignment.service;

import by.epamtc.jwd.busel.supplementary_assignment.model.Appliance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Selector {
    private FileAssistant fileAssistant = FileAssistant.getInstance();
    private LineValidator validator = new LineValidator();

    public List<String> selectAppliances(Appliance.Type type, String matchValue) {
        List<String> strAppliances = new ArrayList<>();
        try (FileReader in = new FileReader(fileAssistant.getSourceFilePath());
             BufferedReader reader = new BufferedReader(in)) {
            while (reader.ready()) {
                String line = reader.readLine();
                if (validator.isLineValid(line, type, matchValue)) {
                    strAppliances.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strAppliances;
    }
}

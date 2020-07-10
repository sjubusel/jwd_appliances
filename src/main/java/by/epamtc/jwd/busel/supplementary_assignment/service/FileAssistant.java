package by.epamtc.jwd.busel.supplementary_assignment.service;

import java.io.File;

public class FileAssistant {

    private static volatile FileAssistant instance;

    public static FileAssistant getInstance() {
        FileAssistant localInstance = instance;
        if (localInstance == null) {
            synchronized (FileAssistant.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new FileAssistant();
                }
            }
        }
        return localInstance;
    }

    private final String sourceFileName = "appliances_db.txt";
    private final String sourceFilePath = generateFilePath();

    private String generateFilePath() {
        return System.getProperty("user.dir") + File.separator + "src" +
                File.separator + "main" + File.separator + "resources" +
                File.separator + sourceFileName;
    }

    public String getSourceFileName() {
        return sourceFileName;
    }

    public String getSourceFilePath() {
        return sourceFilePath;
    }
}

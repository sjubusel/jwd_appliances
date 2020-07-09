package by.epamtc.jwd.busel.supplementary_assignment.model;

public interface Appliance {
    enum Type {
        OVEN("Oven"), LAPTOP("Laptop"), REFRIGERATOR("Refrigerator"),
        VACUUM_CLEANER("VacuumCleaner"), TABLET_PC("TabletPC"),
        SPEAKERS("Speakers");

        private String name;

        Type(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    String receiveTypeName();
}

module hu.petrik.skyfittnessvizsgaremek.main.sky_fittness_vizsgaremek {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    exports hu.petrik.sky_fittness_vizsgaremek;
    opens hu.petrik.sky_fittness_vizsgaremek to javafx.fxml;
}
module hu.petrik.skyfittnessvizsgaremek.main.sky_fittness_vizsgaremek {
    requires javafx.controls;
    requires javafx.fxml;


    opens hu.petrik.skyfittnessvizsgaremek.main.sky_fittness_vizsgaremek to javafx.fxml;
    exports hu.petrik.skyfittnessvizsgaremek.main.sky_fittness_vizsgaremek;
    exports hu.petrik.sky_fittness_vizsgaremek;
    opens hu.petrik.sky_fittness_vizsgaremek to javafx.fxml;
}
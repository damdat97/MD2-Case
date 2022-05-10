module casetudien2 {
    requires javafx.controls;
    requires javafx.fxml;

    exports sample to javafx.fxml;
    opens sample;
}
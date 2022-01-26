module com.pwdgenerator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pwdgenerator to javafx.fxml;
    exports com.pwdgenerator;
}
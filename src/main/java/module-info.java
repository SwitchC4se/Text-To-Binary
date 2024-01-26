module com.switchc4se.textobinary {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.switchc4se.texttobinary to javafx.fxml;
    exports com.switchc4se.texttobinary;
}

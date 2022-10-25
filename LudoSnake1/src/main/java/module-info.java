module com.example.ludosnake1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ludosnake1 to javafx.fxml;
    exports com.example.ludosnake1;
}
module com.suptech.l3devopsfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.suptech.l3devopsfx to javafx.fxml;
    exports com.suptech.l3devopsfx;
}
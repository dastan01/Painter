package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Pane;

public class PleaseProvideControllerClassName {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private RadioButton blackRadioButton;

    @FXML
    private RadioButton redRadioButton;

    @FXML
    private RadioButton greenRadioButton;

    @FXML
    private RadioButton blueRadioButton;

    @FXML
    private RadioButton smallRadioButton;

    @FXML
    private RadioButton meddiumRadioButton;

    @FXML
    private RadioButton largeRadioButton;

    @FXML
    private Button undoButton;

    @FXML
    private Button clearButton;

    @FXML
    private Pane drawingAreaPane;

    @FXML
    void initialize() {
        assert blackRadioButton != null : "fx:id=\"blackRadioButton\" was not injected: check your FXML file 'Painter.fxml'.";
        assert redRadioButton != null : "fx:id=\"redRadioButton\" was not injected: check your FXML file 'Painter.fxml'.";
        assert greenRadioButton != null : "fx:id=\"greenRadioButton\" was not injected: check your FXML file 'Painter.fxml'.";
        assert blueRadioButton != null : "fx:id=\"blueRadioButton\" was not injected: check your FXML file 'Painter.fxml'.";
        assert smallRadioButton != null : "fx:id=\"smallRadioButton\" was not injected: check your FXML file 'Painter.fxml'.";
        assert meddiumRadioButton != null : "fx:id=\"meddiumRadioButton\" was not injected: check your FXML file 'Painter.fxml'.";
        assert largeRadioButton != null : "fx:id=\"largeRadioButton\" was not injected: check your FXML file 'Painter.fxml'.";
        assert undoButton != null : "fx:id=\"undoButton\" was not injected: check your FXML file 'Painter.fxml'.";
        assert clearButton != null : "fx:id=\"clearButton\" was not injected: check your FXML file 'Painter.fxml'.";
        assert drawingAreaPane != null : "fx:id=\"drawingAreaPane\" was not injected: check your FXML file 'Painter.fxml'.";

    }
}

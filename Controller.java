import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    private Button button_calculate;

    @FXML
    private Label label_result;

    @FXML
    private TextField textfield_num1;

    @FXML
    private TextField textfield_num2;

    @FXML
    void on_calculate(ActionEvent event) {
        System.out.println("Button clicked!");
        String str_num1 = textfield_num1.getText();
        String str_num2 = textfield_num2.getText();
        System.out.println("Number 1: " + str_num1);
        System.out.println("Number 2: " + str_num2);

        double db_num1 = Double.parseDouble(str_num1);
        double db_num2 = Double.parseDouble(str_num2);
        double result = db_num1 + db_num2;

        //  step3
        String str_result = Double.toString(result);
        label_result.setText(str_result);
        System.out.println("Result: " + str_result);

    }

}

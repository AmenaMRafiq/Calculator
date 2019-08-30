package application;

import java.io.IOException;
import java.util.function.Consumer;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * This class is a javaFX singleton, creates the GUI interface. 
 * Idea and code written by Dave Cohen, adapted into project by Amena Rafiq.
 * 
 * @author Dave Cohen Amena Rafiq 
 */

public class CalcView extends Application {
  @FXML // fx:id="button"
  private Button button; // Value injected by FXMLLoader

  @FXML // fx:id="question"
  private TextField question; // Value injected by FXMLLoader

  @FXML // fx:id="answer"
  private Label answer; // Value injected by FXMLLoader

  @FXML // fx:id="postfixButton"
  private RadioButton postfixButton; // Value injected by FXMLLoader

  @FXML // fx:id="radioGroup"
  private ToggleGroup radioGroup; // Value injected by FXMLLoader

  @FXML // fx:id="infixButton"
  private RadioButton infixButton; // Value injected by FXMLLoader

  /////////////////////////////////////////////////////////////////////////////////
  // Block for creating an instance variable for others to use.
  //
  // Make it a JavaFX singleton.  Instance is set by the javaFX "initialise" method
  private static volatile CalcView instance = null;

  @FXML
  void initialize() {
    instance = this;
  }

  /**
   * Returns instance of the view for other classes to use.
   * 
   * @returns instance 
   */
  public static synchronized CalcView getInstance() {
    if (instance == null) {
      new Thread(() -> Application.launch(CalcView.class)).start();
      // Wait until the instance is ready since initialise has executed.
      while (instance == null) {// empty body
      }
    }

    return instance;
  }
  // End of special block
  /////////////////////////////////////////////////////////////////////////////////

  @Override
  public void start(Stage primaryStage) throws IOException {
    Parent page = FXMLLoader.load(application.CalcView.class.getResource("Sample.fxml"));
    Scene scene = new Scene(page);
    scene.getStylesheets().add(
        getClass().getResource("application.css").toExternalForm());
    primaryStage.setScene(scene);
    primaryStage.setTitle("Calculator");
    primaryStage.show();
  }  

  /**
   * Observer for the button being pressed. 
   * 
   * @param f  Observer
   * @see      Observer
   */
  public void addEvaluateListener(Observer f) {
    button.setOnAction(event -> f.tell());
  }

  /**
   * Observer for checking which radio button of the toggle
   * group has been pressed. 
   * 
   * @param type  the enumerator type of calculator
   * @see   OpType
   * 
   */
  public void addTypeObserver(Consumer<OpType> type) {
    radioGroup.selectedToggleProperty().addListener(
        new ChangeListener<Toggle>() {
          @Override
          public void changed(ObservableValue<? extends Toggle> observable,
              Toggle from, Toggle to) {
            type.accept(to == infixButton ? OpType.INFIX : OpType.POSTFIX);
          }
        });
  }

  /**
   * Returns the user input inside the GUI TextField. 
   *
   * @returns the text inside the TextField "question"
   */
  public String getUserInput() {
    return question.getText();
  }

  /**
   * Sets the passed string to the output Label "answer". 
   * 
   * @param a   the string to be set as the answer.
   *
   */
  public void setText(String a) {
    answer.setText(a);
  }

}

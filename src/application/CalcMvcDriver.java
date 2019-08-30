package application;

import application.CalcController;
import application.CalcModel;
import application.CalcView;

public class CalcMvcDriver {
  
  /**
   * This creates the model, the view and the controller.
   * The controller is passed the model and the view and
   * handles the running of the program.
   * Idea and code written by Dave Cohen, adapted into project by Amena Rafiq.
   * 
   * @author Dave Cohen Amena Rafiq 
   */
  
  public static void main(String[] args) {       
    CalcModel model = new CalcModel();
    CalcView view = CalcView.getInstance();
    new CalcController(model, view);
  }
}
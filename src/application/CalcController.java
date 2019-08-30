package application;

import model.InvalidExpressionException;

/**
 * This class is a controller. 
 * Idea and code written by Dave Cohen, adapted into project by Amena Rafiq.
 * 
 * @author Dave Cohen Amena Rafiq 
 */

public class CalcController {
  private CalcModel myModel;
  private CalcView myView;

  /**
   * Depending on the OpType it is passed, changes the model's state
   * by calling the model's setType() function with the appropriate 
   * boolean value.
   *
   * @param type  an enumerator OpType
   * @see         OpType CalcModel 
   */
  private void handleType(OpType type) {
    if (type == OpType.INFIX) {
      myModel.setType(true);  
    } else {
      myModel.setType(false);
    }
  }

  /**
   * Takes user input from the view, uses the model's functions to obtain result
   * and present it back to the view. 
   *
   * @throws InvalidExpressionException if the expression is invalid
   * @see    CalcView CalcModel 
   */
  private void handleEvaluate() throws InvalidExpressionException {
    String question = myView.getUserInput();
    try {
      myView.setText(myModel.getValue(question)); 
    } catch (InvalidExpressionException e) {
      myView.setText(e.getMessage());
    }
    
  }

  /**
   * Constructor takes model and view and adds observer and listener.
   *
   * @param   model                      CalcModel object
   *          view                       CalcView object
   * @throws  InvalidExpressionException if the expression is invalid
   * @see     CalcView CalcModel 
   */
  CalcController(CalcModel model, CalcView view) {
    myModel = model;
    myView = view;

    view.addTypeObserver(this::handleType);

    view.addEvaluateListener(() -> {
      try {
        this.handleEvaluate();
      } catch (InvalidExpressionException e) {
        myView.setText(e.getMessage());
      }
    });
  }
}
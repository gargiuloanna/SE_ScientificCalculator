
package scientificcalculator_model.operationscommands;

import scientificcalculator_model.ComplexNumber;
import scientificcalculator_model.ComplexStack;


/**
* This class implements a Subtraction command which makes the arithmetical subtraction between two complex numbers.
*/
public class SubtractionCommand implements Command{
    
    private ComplexStack c;

    /**
     * Initializes a newly created SubtractionCommand object. 
     * <p>
     * @param c the stack used to create the command
     */
    public SubtractionCommand(ComplexStack c) {
        this.c = c;
    }
    
    /**
     * The method executes the arithmetical subtraction between two complex numbers.
     * The result is pushed into the stack maintained by the command
     * <p>
     * @throws ArithmeticException if the stack does not contain at least two elements.
     */ 
    @Override
    public void execute() {
        if(c.size() < 2)
            throw new ArithmeticException();
        ComplexNumber a = (ComplexNumber) c.pop();
        ComplexNumber b = (ComplexNumber) c.pop();
        c.push(new ComplexNumber(a.getReal() - b.getReal(),a.getImaginary() - b.getImaginary()));
    }
    
    /**
     * This method creates the string form of the SubtractionCommand.
     * <p>
     * @return the string form of the command
     */  
    @Override
    public String toString() {
        return "-";
    }
    
    
    
}

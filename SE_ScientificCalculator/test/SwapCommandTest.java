
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import scientificcalculator_model.ComplexNumber;
import scientificcalculator_model.ComplexStack;
import scientificcalculator_model.operationscommands.Command;
import scientificcalculator_model.operationscommands.ExecuteCommand;
import scientificcalculator_model.operationscommands.SwapCommand;

/*
* This is a class to test the SwapCommand class
*/
public class SwapCommandTest {
    
    ExecuteCommand exe;
    ComplexStack stack;
       
    ComplexNumber oper1;
    ComplexNumber oper2;

    
    public SwapCommandTest() {
    }
    
    @Before
    public void setUp() {
        exe = new ExecuteCommand();
        stack = new ComplexStack();
        oper1 = new ComplexNumber(4, 4);
        oper2 = new ComplexNumber(2, 2);
    }

    @Test
    public void testExecute(){
        //The order of push is oper2 - oper1 (the last is the second push done)
        stack.push(oper1);
        stack.push(oper2);
        
        int sizeBeforeDrop = stack.size();
        
        Command sw = new SwapCommand(stack);
        exe.execute(sw);
        
        int sizeAfterDrop = stack.size();
        //Check if the swap does not make size problem
        assertEquals(sizeBeforeDrop, sizeAfterDrop);
        
        //Last element after drop command
        ComplexNumber lastElement = (ComplexNumber) stack.pop();
        ComplexNumber secondLastBefore = (ComplexNumber) stack.pop();
        
        //Check that the dropped element is the element saved before the drop
        assertEquals(lastElement.getReal(), oper1.getReal(), 0.0000001);
        assertEquals(lastElement.getImaginary(), oper1.getImaginary(), 0.0000001);
        
        //Check that the new last item is the element oper1 (the first inserted element)
        assertEquals(secondLastBefore.getReal(), oper2.getReal(), 0.0000001);
        assertEquals(secondLastBefore.getImaginary(), oper2.getImaginary(), 0.0000001);
        
    }
}

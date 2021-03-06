
package scientificcalculator_model.statecalculator;


import scientificcalculator_model.Operations;
import java.util.Map;
import scientificcalculator_model.*;
import scientificcalculator_model.operationscommands.*;

/**
 * The OperationState class implements the State of the Calculator that allows the user to define new complex operations.
 */
public class OperationState extends State{
    
    /**
    * The method adds the operation "addition" as one of the operations of the user defined operation operationName.
    * <p>
    * @param stack the stack containing the complex number inputs
    * @param operations the map where the user defined operations are located
    * @param operationName the name of the operation to define
    */
   @Override
    public void addition(ComplexStack stack, Map<String, Operations> operations, String operationName) {
         Command add = new AdditionCommand(stack);
         operations.get(operationName).addOperation(add);
    }
    
    /**
    * The method adds the operation "product" as one of the operations of the user defined operation operationName.
    * <p>
    * @param stack the stack containing the complex number inputs
    * @param operations the map where the user defined operations are located
    * @param operationName the name of the operation to define
    */
    @Override
    public void product(ComplexStack stack, Map<String, Operations> operations, String operationName) {
        Command prod = new ProductCommand(stack);
        operations.get(operationName).addOperation(prod);
    }
    
    /**
    * The method adds the operation "subtraction" as one of the operations of the user defined operation operationName.
    * <p>
    * @param stack the stack containing the complex number inputs
    * @param operations the map where the user defined operations are located
    * @param operationName the name of the operation to define
    */
    @Override
    public void subtraction(ComplexStack stack, Map<String, Operations> operations, String operationName) {
        Command sub = new SubtractionCommand(stack);
        operations.get(operationName).addOperation(sub);
    }
    
    /**
    * The method adds the operation "division" as one of the operations of the user defined operation operationName.
    * <p>
    * @param stack the stack containing the complex number inputs
    * @param operations the map where the user defined operations are located
    * @param operationName the name of the operation to define
    */
    @Override
    public void division(ComplexStack stack, Map<String, Operations> operations, String operationName) {
        Command div = new DivisionCommand(stack);
        operations.get(operationName).addOperation(div);
    }
    
    /**
    * The method adds the operation "drop" as one of the operations of the user defined operation operationName.
    * <p>
    * @param stack the stack containing the complex number inputs
    * @param operations the map where the user defined operations are located
    * @param operationName the name of the operation to define
    */
    @Override
    public void drop(ComplexStack stack, Map<String, Operations> operations, String operationName) {
        Command drop = new DropCommand(stack);
        operations.get(operationName).addOperation(drop);
    }
    
    /**
    * The method adds the operation "dup" as one of the operations of the user defined operation operationName.
    * <p>
    * @param stack the stack containing the complex number inputs
    * @param operations the map where the user defined operations are located
    * @param operationName the name of the operation to define
    */
    @Override
    public void dup(ComplexStack stack, Map<String, Operations> operations, String operationName) {
        Command dup = new DupCommand(stack);
        operations.get(operationName).addOperation(dup);
    }
    
    /**
    * The method adds the operation "invert" as one of the operations of the user defined operation operationName.
    * <p>
    * @param stack the stack containing the complex number inputs
    * @param operations the map where the user defined operations are located
    * @param operationName the name of the operation to define
    */
    @Override
    public void invert(ComplexStack stack, Map<String, Operations> operations, String operationName) {
        Command invert = new InvertCommand(stack);
        operations.get(operationName).addOperation(invert);
    }
    
    /**
    * The method adds the operation "module" as one of the operations of the user defined operation operationName.
    * <p>
    * @param stack the stack containing the complex number inputs
    * @param operations the map where the user defined operations are located
    * @param operationName the name of the operation to define
    */
    @Override
    public void module(ComplexStack stack, Map<String, Operations> operations, String operationName) {
        Command module = new ModuleCommand(stack);
        operations.get(operationName).addOperation(module);
    }
    
    /**
    * The method adds the operation "over" as one of the operations of the user defined operation operationName.
    * <p>
    * @param stack the stack containing the complex number inputs
    * @param operations the map where the user defined operations are located
    * @param operationName the name of the operation to define
    */
    @Override
    public void over(ComplexStack stack, Map<String, Operations> operations, String operationName) {
        Command over = new OverCommand(stack);
        operations.get(operationName).addOperation(over);
    }
    
    /**
    * The method adds the operation "phase" as one of the operations of the user defined operation operationName.
    * <p>
    * @param stack the stack containing the complex number inputs
    * @param operations the map where the user defined operations are located
    * @param operationName the name of the operation to define
    */
    @Override
    public void phase(ComplexStack stack, Map<String, Operations> operations, String operationName) {
        Command phase = new PhaseCommand(stack);
        operations.get(operationName).addOperation(phase);
    }
    
    /**
    * The method adds the operation "sqrt" as one of the operations of the user defined operation operationName.
    * <p>
    * @param stack the stack containing the complex number inputs
    * @param operations the map where the user defined operations are located
    * @param operationName the name of the operation to define
    */
    @Override
    public void sqrt(ComplexStack stack, Map<String, Operations> operations, String operationName) {
        Command sqrt = new SqrtCommand(stack);
        operations.get(operationName).addOperation(sqrt);
    }
    
    /**
    * The method adds the operation "swap" as one of the operations of the user defined operation operationName.
    * <p>
    * @param stack the stack containing the complex number inputs
    * @param operations the map where the user defined operations are located
    * @param operationName the name of the operation to define
    */
    @Override
    public void swap(ComplexStack stack, Map<String, Operations> operations, String operationName) {
        Command swap = new SwapCommand(stack);
        operations.get(operationName).addOperation(swap);
    }
    
    /**
    * The method adds the operation "push" as one of the operations of the user defined operation operationName.
    * <p>
    * @param stack the stack containing the complex number inputs
    * @param number the number to push on the stack
    * @param operations the map where the user defined operations are located
    * @param operationName the name of the operation to define
    */
    @Override
    public void push(ComplexStack stack, ComplexNumber number,  Map<String, Operations> operations, String operationName) {
        Command push = new PushCommand(stack, number);
        operations.get(operationName).addOperation(push);
    }

    /**
    * The method adds the operation "userDefinition" as one of the operations of the user defined operation operationName.
    * <p>
    * @param user the object representing the user defined operation
    * @param operations the map where the user defined operations are located
    * @param operationName the name of the operation to define
    */
    @Override
    public void userDefinition(UserOperation user, Map<String, Operations> operations, String operationName) {
        Command userOp = new UserOperationCommand(user.getName(), operations);
        operations.get(operationName).addOperation(userOp);
    }
    
    /**
    * The method adds the operation "insertInVariable" as one of the operations of the user defined operation operationName.
    * <p>
    * @param stack the stack containing the complex number inputs
    * @param variables the map where tha variables are located
    * @param v the variable input
    * @param operations the map where the user defined operations are located
    * @param operationName the name of the operation to define
    */
    @Override
    public void insertInVariable(ComplexStack stack, Map<Character, ComplexNumber> variables, Character v, Map<String, Operations> operations, String operationName) {
        Command insert = new InsertInVariableCommand(stack, variables, v);
        operations.get(operationName).addOperation(insert);
    }
    
    /**
    * The method adds the operation "getFromVariable" as one of the operations of the user defined operation operationName.
    * <p>
    * @param stack the stack containing the complex number inputs
    * @param variables the map where tha variables are located
    * @param v the variable input
    * @param operations the map where the user defined operations are located
    * @param operationName the name of the operation to define
    */
    @Override
    public void getFromVariable(ComplexStack stack, Map<Character, ComplexNumber> variables, Character v, Map<String, Operations> operations, String operationName) {
        Command get = new GetFromVariableCommand(stack, variables, v);
        operations.get(operationName).addOperation(get);
    }
    
    /**
    * The method adds the operation "addToLast" as one of the operations of the user defined operation operationName.
    * <p>
    * @param stack the stack containing the complex number inputs
    * @param variables the map where tha variables are located
    * @param v the variable input
    * @param operations the map where the user defined operations are located
    * @param operationName the name of the operation to define
    */
    @Override
    public void addToLast(ComplexStack stack, Map<Character, ComplexNumber> variables, Character v, Map<String, Operations> operations, String operationName) {
        Command add = new AddToLastCommand(stack, variables, v);
        operations.get(operationName).addOperation(add);
    }
    
    /**
    * The method adds the operation "addToLast" as one of the operations of the user defined operation operationName.
    * <p>
    * @param stack the stack containing the complex number inputs
    * @param variables the map where tha variables are located
    * @param v the variable input
    * @param operations the map where the user defined operations are located
    * @param operationName the name of the operation to define
    */
    @Override
    public void subToLast(ComplexStack stack, Map<Character, ComplexNumber> variables, Character v, Map<String, Operations> operations, String operationName) {
        Command sub = new SubToLastCommand(stack, variables, v);
        operations.get(operationName).addOperation(sub);
    }
    
    
}

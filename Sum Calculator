/* Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
Write the following methods (instance methods):
Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumberfield.
Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0. */
Code-->
public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;
    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public void setFirstNumber(double number){
        this.firstNumber=number;
    }
    public void setSecondNumber(double number){
        this.secondNumber=number;
    }
    public double getAdditionResult(){
        double add=firstNumber+secondNumber;
        return add;
    }
    public double getSubtractionResult(){
        double sub=firstNumber-secondNumber;
        return sub;
    }
    public double getMultiplicationResult(){
        double mul=firstNumber*secondNumber;
        return mul;
    }
    public double getDivisionResult(){
        double div=0;
        if(secondNumber==0) return 0;
        else{
            div=firstNumber/secondNumber;
        }
        return div;
    }
}

/* Write a method named sumFirstAndLastDigit with one parameter of type int called number. 
The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value. */
Code-->
public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int sum=0;
        if(number<0){
            return -1;
        }else{
            int r=number%10;
            sum+=r;
            while(number>=10){
                number=number/10;
            }
            sum+=number;
            return sum;
        }
    }
}

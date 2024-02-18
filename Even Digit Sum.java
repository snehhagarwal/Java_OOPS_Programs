/* Write a method named getEvenDigitSum with one parameter of type int called number. 
The method should return the sum of the even digits within the number. 
If the number is negative, the method should return -1 to indicate an invalid value. */
Code-->
public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }else{
            int sum=0;
            while(number!=0){
                int r=number%10;
                number=number/10;
                if(r%2==0){
                    sum+=r;
                }else{
                    continue;
                }
            }
            return sum;
        }
    }
}

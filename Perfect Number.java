/* Write a method named isPerfectNumber with one parameter of type int named number. 
If number is < 1, the method should return false.
The method must calculate if the number is perfect. If the number is perfect, the method should return true; otherwise, it should return false. */
Code-->
public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }else{
            int sum=0;
            for(int i=1;i<number;i++){
                if(number%i==0){
                    sum+=i;
                }else{
                    continue;
                }
            }
            if (sum==number){
                return true;
            }else{
                return false;
            }
        }
    }}

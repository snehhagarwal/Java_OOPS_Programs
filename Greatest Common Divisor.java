/* Write a method named getGreatestCommonDivisor with two parameters of type int named first and second. 
If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
The method should return the greatest common divisor of the two numbers (int). */
Code-->
public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first,int second){
        if(first<10 || second<10){
            return -1;
        }else{
            int gcd=0;
            if(first<second){
                for(int i=1;i<=second;i++){
                    if(first%i==0){
                        if(second%i==0){
                            gcd=i;
                        }
                    }
                }
            }else{
                for(int i=1;i<=first;i++){
                    if(second%i==0){
                        if(first%i==0){
                            gcd=i;
                        }
                    }
                }
            }
            return gcd;
        }
    }
}

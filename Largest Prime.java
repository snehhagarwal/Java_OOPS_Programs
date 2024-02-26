/* Write a method named getLargestPrime with one parameter of type int named number. 
If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
The method should calculate the largest prime factor of a given number and return it. */
Code-->
public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number<2){
            return -1;
        }else{
            int a=0;
            for(int i=1;i<=number;i++){
                if(number%i==0){
                    int count=0;
                    for(int j=1;j<=i;j++){
                        if(i%j==0){
                            count++;
                        }
                    }if(count==2){
                          a=i;
                    }
                }
        }return a;
    }}}

/* Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false. */
Code-->

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int k=number;
        int sum=0;
        while(number!=0){
        int r=number%10;
        number=number/10;
        sum=sum*10+r;
        }
        if(sum==k){
            return true;
        }else{
            return false;
        }
}}

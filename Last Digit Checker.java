/* Write a method named hasSameLastDigit with three parameters of type int. 
Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
Write another method named isValid with one parameter of type int.
The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false. */
Code-->

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int one,int two,int three){
        if(one<10 || two<10 || three<10 || one>1000 || two>1000 || three>1000){
            return false;
        }else{
            int p=one%10;
            int q=two%10;
            int r=three%10;
            if(p==q || q==r || p==r){
                return true;
            }else{
                return false;
            }
        }
    }
    public static boolean isValid(int one){
        if(one<10 || one>1000){
            return false;
        }else{
            return true;
        }
    }
}


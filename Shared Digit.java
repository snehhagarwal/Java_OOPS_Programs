/* Write a method named hasSharedDigit with two parameters of type int. 
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.*/
Code-->
public class SharedDigit {
    public static boolean hasSharedDigit(int one,int two){
        if(one<10 || two<10 || one>99 || two>99){
            return false;
        }else{
            int p=one%10;
            one=one/10;
            int q= two%10;
            two=two/10;
            if(p==q || p==two || one==q || one==two){
                return true;
            }
            else{
                return false;
            }
        }
    }
}


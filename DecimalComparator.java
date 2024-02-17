/*Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.*/
Code-->
public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2){
         int a=(int)(num1*1000);
         int b=(int)(num2*1000);
        if(a==b){
            return true;
        }else{
        return false;
    }
}}

/*Write a method isLeapYear with a parameter of type int named year. 
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false. 
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.
Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.
If parameter month is < 1 or > 12 return -1. ​
If parameter year is < 1 or > 9999 then return -1.
This method needs to return the number of days in the month.*/
Code-->

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        if(year<1 || year>9999){
            return false;
        }else{
            if(year%400==0 || (year%4==0 && year%100!=0)){
                return true;
            }else{
                return false;
            }
        }
    }
    public static int getDaysInMonth(int month,int year){
        if(month<1 || month>12){
            return -1;
        }if(year<1 || year>9999){
            return -1;
        }
        boolean leap=isLeapYear(year);
        int day=0;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day= 30;
                break;
            case 2:
                if(leap==true){
                    day= 29;
                    break;
                }else{
                    day= 28;
                    break;
                }
            
        };    
       return day; 
    }}

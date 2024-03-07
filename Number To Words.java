/* Write a method called numberToWords with one int parameter named number.
The method should print out the passed number using words for the digits.
If the number is negative, print "Invalid Value".
The method reverse should have one int parameter and return the reversed number (int). For example, if the number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.
Use the method reverse within the method numberToWords in order to print the words in the correct order.
Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001). The logic above for the method numberToWords will print "One", but that is incorrect. It should print "One Zero Zero". To solve this problem, write a third method called getDigitCount. 
The method getDigitCount should have one int parameter called number and return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value.
For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).*/
Code-->
public class NumberToWords {
    public static int reverse(int number){
        int num=0;
        while(number!=0){
            int r=number%10;
            number=number/10;
            num=num*10+r;
        }
        return num;
    }
    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }else if(number==0){
            return 1;
        }
        else{
            int i=0;
            while(number!=0){
                int r=number%10;
                number=number/10;
                i=i+1;
            }
            return i;
        }
    }
    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }else{
            int a=reverse(number);
            int z=getDigitCount(number)- getDigitCount(a);
            if(number==0){
                System.out.println("Zero");
            }
            
            while(a!=0){
                int r=a%10;
                a=a/10;
                switch(r){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break; 
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                };
                
            }for(int i=0;i<z;i++){
                System.out.println("Zero");
            }     
            }
        }
    }

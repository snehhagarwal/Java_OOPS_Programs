/*Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
If one of the parameters is less than 0, print text "Invalid Value".
If all numbers are equal print text "All numbers are equal"
If all numbers are different print text "All numbers are different".
Otherwise, print "Neither all are equal or different".*/
Code-->

public class IntEqualityPrinter {
    public static void printEqual(int one,int two,int three){
        if(one<0 || two<0 || three<0){
            System.out.println("Invalid Value");
        }
        else if(one==two && two==three && one==three){
            System.out.println("All numbers are equal");
        }
        else if(one!=two && two!=three && one!=three){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }
}

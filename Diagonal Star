/* Write a method named printSquareStar with one parameter of type int named number. 
If number is < 5, the method should print "Invalid Value".
The method should print diagonals to generate a rectangular pattern composed of stars (*). */
Code-->
public class DiagonalStar {
    public static void printSquareStar(int number){
        if (number<5){
            System.out.println("Invalid Value");
        }else{
            for(int i=0;i<number;i++){
                for(int j=0;j<number;j++){
                    if(i==0 || i==number-1 || j==0 || j==number-1 || i==j || j==number-(i+1)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }System.out.println();
            }
        }
    }
}

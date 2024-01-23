/* Monu has been given three array of different sizes . Let the arrays be A, B, C. Monu aim to find the calculate the minimum absolute difference between the maximum and minimum number from the triplet a, b, c such that a, b, c belongs to A, B, C i.e minimize |max(a,b,c) - min(a,b,c)|
Input Format
The first line contains a three numbers n1, n2, n3 denoting the size of the three arrays respectively. The next line contains n1 integers separated by space which are the elements of the first array. The next line contains n2 integers separated by space which are the elements of the second array. The next line contains n3 integers separated by space which are the elements of the third array.
Constraints
2 ≤ N ≤ 10^6
Output Format
Single integer denoting the desired absolute difference
Sample Input
5 3 4
1 4 5 8 10
6 9 15
2 3 6 6
Sample Output
1
*/
Code-->
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
        int[] arr3=new int[n3];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }for(int i=0;i<n2;i++){
            arr2[i]= sc.nextInt();
        }for(int i=0;i<n3;i++){
            arr3[i]=sc.nextInt();
        }
        int max=Integer.MAX_VALUE;
        for(int p=0;p<n1;p++){
            for(int q=0;q<n2;q++){
                for(int r=0;r<n3;r++){
                    int num1=Math.min(Math.min(arr1[p],arr2[q]),arr3[r]);
                    int num2=Math.max(Math.max(arr1[p],arr2[q]),arr3[r]);
                    int val=num2-num1;
                    if(max>val){
                        max=val;
                    }
                }
            }
        }
        System.out.println(max);
    }
}

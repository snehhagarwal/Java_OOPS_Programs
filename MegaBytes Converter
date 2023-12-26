
/*Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.

The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.

Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".

XX represents the original value kiloBytes.
YY represents the calculated megabytes.
ZZ represents the calculated remaining kilobytes.*/

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int KiloByte){
        if(KiloByte<0){
            System.out.println("Invalid Value");
        }else{
        int value=KiloByte/1024;
        int remaining=KiloByte-(value*1024);
        System.out.println(KiloByte + " KB = " + value +" MB and " +  remaining + " KB");
            
        }
    }
}

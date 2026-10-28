 import java.util.Scanner;
  
  public class Sendscan  {
     public static void main(string[] args). {
         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter an FRC team number in the console: ");
         String teampicker = scanner.nextLine();

         Callscan.displayTeam(teampicker).trim());
         Scanner.close()
    }
 }
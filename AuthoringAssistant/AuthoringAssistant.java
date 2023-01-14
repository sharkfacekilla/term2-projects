import java.util.Scanner;

public class AuthoringAssistant {
   public static String shortenSpace(String userInput) {
      String results = userInput.replace("  ", " ");
      return results;
   }
   
   
   public static String replaceExclamation(String userString) {
      String result = userString.replace("!", ".");
      return result;
   }
   
   public static int getNumOfNonWSCharacters(String userInput) {
      int stringLength = userInput.length();
      int numOfChars = userInput.replace(" ", "").length();
      return numOfChars;
   }
   
   public static void printMenu() {
      System.out.println("MENU");
      System.out.printf("c - Number of non-whitespace characters%nw - Number of words%nf - Find text%n");
      System.out.printf("r - Replace all !'s%ns - Shorten spaces%nq - Quit%n%nChoose an option:%n");
   }
   Scanner scnr = new Scanner(System.in);
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      
      System.out.printf("Enter a sample text:%n%n");
      String userString = scnr.nextLine();
      System.out.printf("You entered: " + userString + "%n%n");

      printMenu();
      String menuOption = scnr.next();
      switch (menuOption){
         case "c":
            int result = getNumOfNonWSCharacters(userString);
            System.out.println("Number of non-whitespace characters: " + result);
            break;
         case "w":
            break;
         case "f":
            break;
         case "r":
            String editedResult = replaceExclamation(userString);
            System.out.println(editedResult);
            break;
         case "s":
            String shortenedSpace = shortenSpace(userString);
            System.out.println(shortenedSpace);
            break;
         case "q":
            break;
            
      }

   }
}

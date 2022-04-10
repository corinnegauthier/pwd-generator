import java.util.Random;
import java.util.Scanner; 
public class PasswordGenerator

{

    public static void main(String[] args)

    {

        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

            String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
            String numbers = "0123456789";
            String specialChar = "!@#$%^&*";
       
                String alphabeticNumeric = upperAlphabet + lowerAlphabet + numbers + specialChar;

                    System.out.println("This is a password Generator");
            
                    System.out.println("Please enter the number of characters you want your password to be: ");
                    int length = scan.nextInt();
                    

            for(int i = 0; i < length; i++) 


            {
        
                    int index = rand.nextInt(alphabeticNumeric.length());
                    char randChar = alphabeticNumeric.charAt(index);
                    sb.append(randChar);

             }


             String Password = sb.toString();
             

        System.out.println("Your new password is: "+Password);


        scan.close();
           

    }

}
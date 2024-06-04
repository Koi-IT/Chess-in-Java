import java.io.*;

public class UserInput {
    public void readInput() {
        try {
            // Creating BufferedReader Object
            BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));

            // Instantiate Chess Movement
            

            // Reading String input
            System.out.print("Enter the place you want to move your piece: ");

            String str = bfn.readLine();

            

            // Printing String
            System.out.println("Entered String: " + str);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for an integer: " + e.getMessage());
        }
    }
}

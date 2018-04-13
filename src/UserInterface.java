/**
 * User interface to be used at a polling station
 * @author Tlotliso Mapana
 * @since 02 April 2018
*/

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Math;

public class UserInterface
{

  public static void main (String args[])
  {
    /**
     * This block of code reads the data file and
     * handles the scanner input
    */
    Scanner file = null;
    try { file = new Scanner (new FileReader ("Dataset.txt")); }
    catch (FileNotFoundException err)
    {
      System.out.println("Error! Problem Opening File");
      System.exit(0);
    }

    int tablesize = 100;
		DataChain table = new DataChain();
    while (file.hasNextLine())
    {
      String voter = file.nextLine();
      table.addtoHashTable(voter, tablesize);
    }

    table.outputList();
    Scanner keyboard = new Scanner (System.in);
    System.out.println("Enter a 13-digit ID number: ");
    while (keyboard.hasNextLong())
    {
      String id = keyboard.nextLine ();
      // Exit case
      if (Long.parseLong(id) == 0)
        System.exit(0);

      if (id.length() == 13)
      {
        int found = table.findKey(id, tablesize);
        System.out.println("Voter registered!");
        table.display(found);
      }

      System.out.println("Enter a 13-digit ID number: ");
    }

  }

}

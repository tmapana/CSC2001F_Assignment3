// Tlotliso Mapana

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.lang.Math;
import java.util.Random;
import java.io.IOException;

public class IDGenerator
{

  public static void main(String[] args)
  {
    Scanner inFile = null;
    try { inFile = new Scanner (new FileReader ("NamesList.txt")); }
    catch (FileNotFoundException err)
    {
      System.out.println("Error! Problem Opening File");
      System.exit(0);
    }

    BufferedWriter outFile;
    try
    {
      outFile = new BufferedWriter (new FileWriter ("Dataset.txt"));
      while (inFile.hasNextLine())
      {
        Random rand = new Random();
        int id1 = rand.nextInt(9999999) + 1000000;
        int id2 = rand.nextInt(999999) + 100000;

        String identification = String.valueOf(id1) + String.valueOf(id2);
        if (identification.length() == 13)
        {
          String newName = identification + " " + inFile.nextLine() + "\n";
          outFile.append(newName);
          System.out.println(newName);
        }
      }

      outFile.close();
    }
    catch (IOException err)
    {
      System.out.println("File not found");
      System.exit(0);
    }

    //try {  }
    //catch (IOException ioe) {}

  }

}

// Tlotliso Mapana


public class Voter
{
  /**
   * Creates a Voter constructor and initialises variables
   * @param name contains string object name of voter
   * @param identification is id of a particular voter
  */

  long identification;
  String name;

  public Voter (){}

  public Voter(long id, String n)
  {
    /**
     * Initialises instance variables
    */
    identification = id;
    name = n;
  }

  public long getID()
  {
    /**
     * @return id of a voter
    */
    return identification;
  }

  public String getName ()
  {
    /**
     * @return name of a voter
    */
    return name;
  }

  public boolean equalsTo(long id)
    {
      /**
       * checks if name and argument n have the same value
      */
      return getID() == id;
    }

}

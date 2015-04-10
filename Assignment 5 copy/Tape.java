
/**
 * Write a description of class Tape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tape extends PhysicalMedia
{
    //Title of the tape
    //Type of tape (analog/digital)
    //Tracks (as an ArrayList where the index in the list corresponds to
    //the number of the track on the tape)
    //Archive number

    /**
     * Constructor for objects of class Tape
     */
    public Tape()
    {
        TapeMake();
    }

    /**
     * 
     */
    public void TapeMake()
    {
        MakeTrackList();
    }
}

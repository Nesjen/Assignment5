
/**
 * Write a description of class Advertiser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Advertiser extends AudioTracks
{
    //Title of the jingle X
    //Duration            X
    //The product being advertised
    //The company paying for the advertisement
    //Reference to the medium containing the jingle   
    private String Product;    

    /**
     * Constructor for objects of class Advertiser
     */
    public Advertiser()
    {
        Advertise();
    }
    
    /**
     * 
     */
    public void Advertise()
    {
    
    }
    
    /**
     * @Returns title
     * Return the title of the Advertise.
     */
    
    public String GetAdvertiseTitle()
    {
        //title
        return GetAudioTrack();
    }
    
    /**
     * 
     */
    public int GetDuration()
    {
        //duration
        return GetTrackDuration();
    }
}


/**
 * Write a description of class Advertiser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Advertiser extends AudioTrack
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
     * 
     */
    public int GetDuration()
    {
        //duration
        return GetTrackDuration();
    }
}

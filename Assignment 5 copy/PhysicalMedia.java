
import java.util.ArrayList;
/**
 * Write a description of class Physical here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhysicalMedia extends Media
{
    // instance variables - replace the example below with your own
    private int archiveNumber;
    
    private ArrayList<AudioTrack> AudioRegistry;
    private ArrayList trackList;
    /**
     * Constructor for objects of class Physical
     */
    public PhysicalMedia()
    {
        MakeTrackList();
    }
    
    /**
     * 
     */
    public void MakeTrackList()
    {
        trackList = new ArrayList<AudioTrack>();
    }
    
    public ArrayList GetTrackList()
    {
        return trackList;
    }
    
    public void listAllTracks()
    {
        String AudioTrackList="";
        for(AudioTrack track : AudioRegistry)
        {            
            AudioTrackList += track.getTrackTitle() + "/n";
         }
    }
}

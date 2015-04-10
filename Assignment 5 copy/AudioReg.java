import java.util.ArrayList;
/**
 * Write a description of class AudioReg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AudioReg
{
    //ArrayList to keep all the AudioTracks in one place
    private ArrayList<AudioTrack> AudioRegistry;
    /**
     * Makes a Arraylist with Audiotracks
     */
    public AudioReg()
    {
        AudioList();
    }

    /**
     * 
     */
    public void AudioList()
    {
        //make ArrayList
        AudioRegistry = new ArrayList<AudioTrack>();
    }
    
    /**
     * Makes ArrayLists
     */
    public void AudioList(ArrayList name)
    {
        //make ArrayList
        name = new ArrayList<AudioTrack>();
    }
    
    /**
     * Adds a track to the AudioRegistry
     */
    public void AddTrack(AudioTrack track)
    {
        AudioRegistry.add(track);
    }
    
    /**
     * 
     */
    public ArrayList getAudioList()
    {
        return AudioRegistry;
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

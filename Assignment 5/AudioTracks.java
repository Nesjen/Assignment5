
/**
 * Write a description of class AudioTracks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AudioTracks extends Radio
{
    // 
    private String title;
    private String description;
    private int duration;
    private int durationSecs;
    private int durationMins;
    
    /**
     * Constructor for objects of class AudioTracks
     */
    public AudioTracks()
    {
        AudioTrack();
    }
    
    /**
     * 
     */
    public void AudioTrack()
    {
    
    }
    
    /**
     * 
     */
    public String GetAudioTrack()
    {
        return title;
    }
    
    /**
     * 
     */
    public int GetTrackDuration()
    {
        //Duration = Something
        return duration;
    }
    
}

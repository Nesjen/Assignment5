//Forsøk på å importere Duration class
//Husk å last ned nyaste Java JDK/SDK
import java.util.*;
/**
 * Creates a new media and adds it to a list.
 * 
 * @author (Eirik Nesje) 
 * @version (1.0)
 */
public class Media
{
    // instance variables - replace the example below with your own
    private String title;
    private int durationMins;
    private int durationSecs;
    private boolean startUpCount = true;
    private AudioTrack track;
    private Media media;
    private MediaReg medium;
    //private Duration duration;
       
    /**
     * Constructor for objects of class Media
     */
    public Media()
    {
        MediaGenetics(title);
    }
    
    /**
     * Makes a new HashMap for all the media and adds the media to it.
     */
    public void MediaGenetics(String title /*, Duration duration*/)
    {   
        this.title = title;
        //this.duration = duration;
        media = new Media();
        //alternativ måte, få Audiotrack til å lage medium HashMap istedet.
        if(startUpCount == true)
        {
            makeMediaList();
            startUpCount = false;
        }
        medium.addMedia(title, media);
    }
    
    /**
     * Makes a new media list. Run this method only once.
     */
    public void makeMediaList()
    {
        medium = new MediaReg();
    }
    
    /**
     * @Return the media title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * @Returns the duration of the media.
     */
    /*
    public Duration getDuration()
    {
        return duration;
    }
    //return duration
    */
   /**
    * Search the media and return either the media or gives an error.
    * @Returns the media searched.
    */
   public void findMedia(String description)
   {
       //En sjekk i tilfelle nullpointer
       if(media != null)
       {
           medium.getMedia(description);
       }
       else
       System.out.println("There is no such media in the list");
   }
}

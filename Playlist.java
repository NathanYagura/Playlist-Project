import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> list;




     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
      public Playlist(){
        list = new ArrayList<Song>();
        
    }

      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */

      public void addSong(Song x){
        list.add(x);
      }
      public void likeSong(Song x){
        x.Like();
      }
      public void removeSong(Song x){
        list.remove(x);
      }
      public void allSongs(){
        for (int i=0; i<list.size();i++){
            list.get(i).toString();
        }
      }
      public void likedSongs(){
        for (int i=0; i<list.size();i++){
          if(list.get(i).getLiked()==true){
            list.get(i).toString();
          }
      }
    }
    public int totalDuration(){
      int time = 0;
      for (int i=0; i<list.size();i++){

      }
      return time;
    }
      
}

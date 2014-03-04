import java.util.*;

public class Song implements Comparable<Song>{
	
	String title;
	String artist;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	// build constructor
	public Song(String t, String a){
		title = t;
		artist = a;
	}

	// override implement interface(Comparable) method
	public int compareTo(Song s){
		//set comparison rule based on song title 
		return this.title.compareTo(s.getTitle());
	}
	
	// override toString Object method.
	public String toString(){
		return title;
	}
	
	// override equals()
	public boolean equals(Object aSong){
		// cast the Object param to Song object type
		Song  s = (Song) aSong;
		// set the equal rule (if titles are the same, the return true)
		return this.title.equals(s.getTitle());
	}
	
	// override hashCode()
	public int hashCode(){
		return this.title.hashCode();
	}
	
}

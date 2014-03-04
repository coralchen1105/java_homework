import java.util.*;

public class HashSetSong {
	
	ArrayList<Song> songList = new ArrayList<Song>();
	
	public void hashSet(){
		
		//add songs to list
		songList.add(new Song("long","lili"));
		songList.add(new Song("long","lili"));
		songList.add(new Song("shout","jack"));
		songList.add(new Song("my love","methew"));
		songList.add(new Song("love you baby","eason"));
		songList.add(new Song("and i will be hee","sasa"));
		songList.add(new Song("and i will be hee","sasa"));
		songList.add(new Song("and i will be hee","sasa"));
	
		// when system print out a object, it will automatically print call Object toString() to print out the content that represents the object name
		// and here we override the toString() in Song class, so system will call the overrided toString() method.
		System.out.println("Song List:" + songList);
		HashSet<Song> hSong = new HashSet<Song>();
		
		// addAll(list): add another collection to HashSet
		// once HashSet object has all objects inside, then system will call equals() to compare two objects
		// and as I override equals() in Song class, the song object will call its equals() (overrided method) to compare
		hSong.addAll(songList);
		
		System.out.println("New hashSet: " + hSong);
		
	}
	
	public static void main(String[] args){
		
		HashSetSong hss = new HashSetSong();
		hss.hashSet();
		
	}
}

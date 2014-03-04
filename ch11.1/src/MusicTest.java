import javax.sound.midi.*;

public class MusicTest {
	public void play(){
		try{
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("successfully");
		
		}catch(MidiUnavailableException ex){
			System.out.println("fail");
		}
	}
	
	public static void main(String[] args){
		MusicTest m = new MusicTest();
		m.play();
	}
}

package device;

public class SurroundSoundSystem extends Device implements SoundDevice{
	
	private int volume, bass, treble;
	private boolean surroundSound;
	
	public SurroundSoundSystem(int id, int pairKey, boolean poweredOn, 
			int volume, int bass, int treble, boolean surroundSound){
		super(id, pairKey, poweredOn);
		this.volume = volume;
		this.bass = bass;
		this.treble = treble;
		this.surroundSound = surroundSound;
	}
	
	public int increaseVolume(){
		return ++this.volume;
	}
	
	public int decreaseVolume(){
		return --this.volume;
	}
	
	public int increaseBass(){
		return ++this.bass;
	}
	
	public int decreaseBass(){
		return --this.bass;
	}
	
	public int increaseTreble(){
		return ++this.treble;
	}
	
	public int decreaseTreble(){
		return --this.treble;
	}
	
	public boolean toggleSurroundSound(){
		this.surroundSound = !this.surroundSound;
		return this.surroundSound;
	}

}

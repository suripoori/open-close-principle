package device;

public class TV extends Device implements DisplayDevice, SoundDevice{

	private int brightness, color, resolutionWidth, resolutionHeight;
	private int volume, bass, treble;
	private boolean surroundSound;
	public TV(int id, int pairKey, boolean poweredOn, 
			int brightness, int color, int resolutionWidth, int resolutionHeight, 
			int volume, int bass, int treble, boolean surroundSound) {
		super(id, pairKey, poweredOn);
		this.brightness = brightness;
		this.color = color;
		this.resolutionHeight = resolutionWidth;
		this.volume = volume;
		this.bass = bass;
		this.treble = treble;
		this.surroundSound = surroundSound;
	}
	
	public int increaseBrightness(){
		return ++this.brightness;
	}
	
	public int decreaseBrightness(){
		return --this.brightness;
	}
	
	public int increaseColor(){
		return ++this.color;
	}
	
	public int decreaseColor(){
		return --this.color;
	}
	
	public int increaseHeight(){
		return ++this.resolutionHeight;
	}
	
	public int decreaseHeight(){
		return --this.resolutionHeight;
	}
	
	public int increaseWidth(){
		return ++this.resolutionWidth;
	}
	
	public int decreaseWidth(){
		return --this.resolutionWidth;
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

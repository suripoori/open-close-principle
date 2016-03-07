package device;

public class Projector extends Device implements DisplayDevice{

	private int brightness;
	private int color;
	private int resolutionWidth;
	private int resolutionHeight;
	
	public Projector(int id, int pairKey, boolean poweredOn, 
			int brightness, int color, int resolutionWidth, int resolutionHeight) {
		super(id, pairKey, poweredOn);
		this.brightness = brightness;
		this.color = color;
		this.resolutionHeight = resolutionHeight;
		this.resolutionWidth = resolutionWidth;
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
}

package device;

public abstract class Device {
	private int id;
	private int pairKey;
	boolean poweredOn;
	
	public Device(int id, int pairKey, boolean poweredOn){
		this.id = id;
		this.pairKey = pairKey;
		this.poweredOn = poweredOn;
	}
	
	public boolean powerToggle(int key){
		if (this.pairKey == key){
			this.poweredOn = !this.poweredOn;
			return true;
		}
		else{
			return false;
		}
	}
	
	public int formConnection(){
		return this.pairKey;
	}
	
	public int getId(){
		return this.id;
	}
	
	public boolean isPoweredOn(){
		return this.poweredOn;
	}
}

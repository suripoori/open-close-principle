package domain;

import java.util.HashMap;
import device.Device;

public class RemoteControl {
	private HashMap<Integer, Integer> deviceMap;
	
	public RemoteControl(){
		deviceMap = new HashMap<Integer, Integer>();
	}
	
	public boolean connectToDevice(Device device){
		try{
			int pairKey = device.formConnection();
			deviceMap.put(device.getId(), pairKey);
			return true;
		} catch(Exception e){
			return false;
		}
	}
	
	public boolean powerToggleDevice(Device device){
		return device.powerToggle(deviceMap.get(device.getId()));
	}
	
	public boolean powerOnDevice(Device device){
		if (device.isPoweredOn()){
			return true;
		}
		else {
			return this.powerToggleDevice(device);
		}
	}
	
	public boolean powerOffDevice(Device device){
		if (device.isPoweredOn()){
			return this.powerToggleDevice(device);
		}
		else {
			return true;
		}
	}
}

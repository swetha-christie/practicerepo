package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Device
{
	private String deviceName;
	private int ipAddress;
	private String userName;
	
	public Device(String deviceName, int ipAddress, String userName)
	{
		super();
		this.deviceName = deviceName;
		this.ipAddress = ipAddress;
		this.userName = userName;
	}
	
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public int getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(int ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	@Override
	public String toString() 
	{
		return "Device [deviceName=" + deviceName + ", ipAddress=" + ipAddress + ", userName=" + userName + "]";
	}
	
}
public class Activity 
{
	public static void main(String[] args)
	{
	List<Device> list=Arrays.asList(new Device("Router",38701,"Swetha"),
			                        new Device("Wifi",2397,"Shruthi"),
			                        new Device("USB",32155,"Admin"),
			                        new Device("cable",1325,"Suchi"));
	
	Stream<Device> deviceStream=list.stream();
	
	Predicate<Device> filterByName=(e)->e.getDeviceName().equals("Router");
	Function<Device,String> displayDevice=(e)->e.getDeviceName().toUpperCase()+","+e.getIpAddress()+","+e.getUserName();
	deviceStream.filter(filterByName).map(displayDevice).forEach((e)->System.out.println(e));
	
	System.out.println("********************************");
	
	Stream<Device> AdminDevice=list.stream();
	Predicate<Device> filterbyAdmin=(e)->e.getUserName().equals("Admin");
	Function<Device,String> displayuserName=(e)->e.getDeviceName().toUpperCase();
	AdminDevice.filter(filterbyAdmin).map(displayuserName).forEach((e)->System.out.println(e));
	
	
	}

}

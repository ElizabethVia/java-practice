
public class TV {
	  public int channel=1;
	  public int volumeLevel=1;
	  public boolean on = false; 
	  public String brand = "undefined";
	  
	  
	  public int getChannel() {
		  
		return channel;
		
	}
	public void setChannel(int channel) {
		if(channel>0 && channel<=120 && on) {
			this.channel = channel;
			
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
		
	}
	public int getVolumeLevel() {
		return volumeLevel;
	}
	public void setVolumeLevel(int volumeLevel) {
		if(volumeLevel>=1 && volumeLevel<=7 && on==true) {
		this.volumeLevel = volumeLevel;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public TV(){
	    System.out.println("Creating TV object using no Args- constructor");
	  }
	  public TV(String brand){
	    this.brand=brand;
	    System.out.println("Creating TV object using 1 arg - constructor");
	    
	  }
	  public void channelUp() {
		  setChannel(channel+1);
	  }
   public void channelDown() {
	   setChannel(channel-1);
	  }
   public void volumeUp() {
	   setVolumeLevel(volumeLevel+1);
   }
   public void volumeDown() {
	   setVolumeLevel(volumeLevel-1);
   }
   public void turnOn() {
	   on=true;
   }
   public void turnOff() {
	   on=false;
   }
   public void isOn(boolean on) {
	   if (on) {
		   System.out.println("TV is already ON");
	   }else {
		   System.out.println("TV is already OFF");
	   }
   }
	}

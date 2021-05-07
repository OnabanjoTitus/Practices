public class Television{
public static void main(String[] args) {
	private int volumeDown;
	private int volumeUp;
	private int defaultVolume;
	private boolean toggle;
	private int defaultChannel;
	private int channelUp;
	private int channelDown;
}
public Televison(int defaultChannel, int defaultVolume){
defaultChannel=0;
defaultVolume=0;

}


public void setChannelUp(int channelUp){
	;
	if (channelUp>99)
		{this.channelUp=0;}
	else{channelUp=channelUp++;}

}
public int getChannelUp(){
	return channelUp;

}

}
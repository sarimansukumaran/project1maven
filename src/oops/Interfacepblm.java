package oops;

interface TVremote
{
	public void channelChange();
	public void volumeChange();
}
interface SmartTVremote extends TVremote
{
 
	public void wifi();
	public void bluetooth();
}
class TV implements SmartTVremote
{

	@Override
	public void channelChange() {
		System.out.println("TV remote channel change");
		
	}

	@Override
	public void volumeChange() {
		System.out.println("Tv remote volume change");
		
	}

	@Override
	public void wifi() {
		System.out.println("wifi");
	}

	@Override
	public void bluetooth() {
		System.out.println("bluetooth");
		
	}
	
}
public class Interfacepblm {

	public static void main(String[] args) {
		TV ob=new TV();
		ob.bluetooth();
		ob.wifi();
		ob.channelChange();
		ob.volumeChange();

	}

}

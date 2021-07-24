package Television;

public class XiaomiTelevision implements ITelevision{
    @Override
    public void on() {
        // Switches on the TV by clicking on Button Y1
    	System.out.println(this.getClass().getSimpleName() + " has been turned on");
    }

    @Override
    public void off() {
        // Switches off the TV by clicking on Button Y2
    	System.out.println(this.getClass().getSimpleName() + " has been turned off");
    }

    @Override
    public void setChannel(int channel) {
        // Sets the channel on this television
    	System.out.println(this.getClass().getSimpleName() + " channel has been set to " + channel);
    }

    @Override
    public void setVolume(int volume) {
        // Sets the volume on this television
    	System.out.println(this.getClass().getSimpleName() + " volume has been set to " + volume);
    }
}

package SmartTV;

public class SmartTv {
    boolean on = false;
    int channel = 1;
    int volume = 15;

    public void turnUpVolume() {
        volume++;
    }
    public void turnDownVolume() {
        volume--;
        if(volume < 0)
            volume = 0;
    }

    public void turnOn() {
        on = true;
    }
    public void turnOff() {
        on = false;
    }

    public void changeChanell(int newChannel) {
        channel = newChannel; 
        if(channel < 0)
            channel = Math.abs(channel);   
    }
    public void changeUpChanell() {
        channel++;
    }
    public void changeDownChanell() {
        channel--;
        if(channel < 0)
            channel = 100;
    }
}

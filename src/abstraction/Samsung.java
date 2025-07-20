package abstraction;

public  class Samsung implements Remote{
    boolean power = true;
    int currentVolume = 0;
    @Override
    public boolean turnOn() {

        if (power) {
            System.out.println("turning On the tv");
        }
        return power;
    }

    @Override
    public void playVideo() {
        System.out.println("Video is playing");
    }

    @Override
    public int  volumeUp() {
        currentVolume++;
        return currentVolume;
    }


    @Override
    public boolean powerOff() {
        boolean power = turnOn();
        if (power){
            power = !power;
        }
        return power;
    }

    @Override
    public void connectWithWifi() {
        System.out.println("Connecting to the wifi");
    }

    @Override
    public void changeChannel(int changeChannel) {
        System.out.println("Changing the channel");
    }
}

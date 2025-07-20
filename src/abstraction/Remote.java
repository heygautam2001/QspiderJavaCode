package abstraction;

public interface Remote {

   public abstract   boolean turnOn();
   public abstract   void playVideo();
   public abstract   void changeChannel(int channelNo);
   public abstract   int volumeUp();
   public abstract   void connectWithWifi();
   public abstract   boolean powerOff();

}

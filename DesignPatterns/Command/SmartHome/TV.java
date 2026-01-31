public class TV{
  boolean state = false;
  int volume = 0;
  String channel;

  public TV(String channel){
    this.channel = channel;
  }

  public void setOn(){
    System.out.println("TV is on. Set on Channel " + this.channel);
    this.state = true;
  }  

  public void setOff(){
    System.out.println("TV is off");
    this.state = false;
  }

  public void setVolume(int volume){
    this.volume = volume;
    System.out.println("Volume is set " + this.volume);
  }

  public void changeChannel(String channel){
    this.channel = channel;
    System.out.println("Channel set to " + this.channel);
  }
}

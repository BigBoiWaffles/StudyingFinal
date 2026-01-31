public class Stereo{
  boolean state = false;
  int volume = 0;
  String source;

  public Stereo(String source){
    this.source = source;
  }

  public void setOn(){
    System.out.println(this.source + " is set On");
    this.state = true;
  }

  public void setOff(){
    System.out.println(this.source + " is set Off");
    this.state = false;
  }

  public void setVolume(int volume){
    this.volume = volume;
    System.out.println(this.source + " volume is set to " + this.volume);
  }
}

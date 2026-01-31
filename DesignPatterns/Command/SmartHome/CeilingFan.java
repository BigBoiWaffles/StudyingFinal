public class CeilingFan {
  boolean state = false;
  String speed;

  public CeilingFan(String speed){
    this.speed = speed;
  }

  public void setOn(){ 
    System.out.println("CeilingFan is On");
    this.state = true; 
  }

  public void setOff(){ 
    System.out.println("CeilingFan is Off");
    this.state = false; 
  }

  public void setSpeed(String speed){
    this.speed = speed;
    System.out.println("Speed set to: " + this.speed);
  }
}

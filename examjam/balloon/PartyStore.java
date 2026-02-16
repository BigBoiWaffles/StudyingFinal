import java.util.ArrayList;

public class PartyStore{
  public static void main(String[] args){
    BalloonFactory bf = new BalloonFactory();
    ArrayList<Balloon> balloons = new ArrayList<Balloon>();

    for (int i = 0; i < 33; i++){
      balloons.add(bf.getBalloon("BigRedBalloon"));
      balloons.add(bf.getBalloon("SmallGreenBalloon"));
      balloons.add(bf.getBalloon("MediumOrangeBalloon"));
    }

    System.out.println(balloons.get(0).getNumCreated());

  }
}

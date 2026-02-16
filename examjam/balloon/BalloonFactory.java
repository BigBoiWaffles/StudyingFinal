//package ca.utoronto.utm.examjam.balloon;

/**
 * EXERCISE: Complete BalloonFactory
 * The BalloonFactory creates full balloons
 * "BigRedBalloon" capacity: 100
 * "SmallGreenBalloon"  capacity: 10
 * "MediumOrangeBalloon" capacity: 50
 * http://www.oodesign.com/factory-pattern.html
 *
 * EXERCISE: Create PartyStore with a main. The main should use the
 * BalloonFactory fill an ArrayList or array of Balloon with 33 of each of
 * "BigRedBalloon"
 * "SmallGreenBalloon"
 * "MediumOrangeBalloon"
 */
public class BalloonFactory {
  public Balloon getBalloon(String s){
    if (s.equals("BigRedBalloon")){ return new BigRedBalloon(); }
    if (s.equals("SmallGreenBalloon")) { return new SmallGreenBalloon(); }
    if (s.equals("MediumOrangeBalloon")) { return new MediumOrangeBalloon(); }
    return null;
  }
}

// package ca.utoronto.utm.examjam.balloon;
import java.util.ArrayList;

/**
 * EXERCISE: This is a collection of balloons,
 * the constructor should use the BalloonFactory to
 * create a specified number of
 * "BigRedBalloon"
 * "SmallGreenBalloon"
 * "MediumOrangeBalloon"
 * "RandomMix"
 * The last one is a RandomMix of the above
 * https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Random.html
 */

/**
 * EXERCISE: Use the BalloonInflationStrategy to allow the
 * user to specify if the constructed Balloons should be
 * half full, full or empty
 */

public class BalloonBunch {
  private BalloonInflationStrategy strategy;
  private ArrayList<Balloon> balloons;
  private int numOfRed, numOfGreen, numOfOrange; 


  public BalloonBunch(int numOfRed, int numOfGreen, int numOfOrange){
    this.numOfRed = numOfRed;
    this.numOfGreen = numOfGreen;
    this.numOfOrange = numOfOrange;
    balloons = new ArrayList<Balloon>();
    this.createBalloons();
  }

  private void createBalloons(){
    BalloonFactory bf = new BalloonFactory();

    for (int i = 0; i < numOfRed; i++){
      balloons.add(bf.getBalloon("BigRedBalloon"));
    }
    for (int i = 0; i < numOfGreen; i++){
      balloons.add(bf.getBalloon("SmallGreenBalloon"));
    }
    for (int i = 0; i < numOfOrange; i++){
      balloons.add(bf.getBalloon("MediumOrangeBalloon"));
    }
  }

  public void setStrategy(BalloonInflationStrategy strategy){
    this.strategy = strategy;
  }

  public void executeStrategy(){
    for (int i = 0; i < balloons.size(); i++){
      this.strategy.execute(balloons.get(i));
    }
  }
}


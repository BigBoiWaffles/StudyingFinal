package balloon.factoryItems;


import balloon.Balloon;

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
    public Balloon createBalloon(String product){
        return switch (product) {
            case "BigRedBalloon" -> new BigRedBalloon();
            case "SmallGreenBalloon" -> new SmallGreenBalloon();
            case "MediumOrangeBalloon" -> new MediumOrangeBalloon();
            default -> null;
        };
    }
}

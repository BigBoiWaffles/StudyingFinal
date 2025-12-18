package balloon;

import balloon.factoryItems.BalloonFactory;
import balloon.factoryItems.BigRedBalloon;
import balloon.factoryItems.MediumOrangeBalloon;
import balloon.factoryItems.SmallGreenBalloon;

import java.util.ArrayList;

public class PartyStore {
    public static void main(String[] args){
        BalloonFactory bf = new BalloonFactory();
        ArrayList<Balloon> balloons = new ArrayList<Balloon>();

        for (int i = 1; i < 34; i++){
            balloons.add(bf.createBalloon("BigRedBalloon"));
            balloons.add(bf.createBalloon("SmallGreenBalloon"));
            balloons.add(bf.createBalloon("MediumOrangeBalloon"));
        }

        int redBalloons = 0;
        int greenBalloons = 0;
        int orangeBalloone = 0;

        for(Balloon balloon: balloons){
            if (balloon instanceof BigRedBalloon){ redBalloons++;}
            if (balloon instanceof SmallGreenBalloon){ greenBalloons++;}
            if (balloon instanceof MediumOrangeBalloon){ orangeBalloone++;}
        }

        System.out.println("Red Balloons: " + redBalloons +
                "\nGreen Balloons: " + greenBalloons +
                "\nOrange Balloons: " + orangeBalloone);
    }
}

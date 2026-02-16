// package ca.utoronto.utm.examjam.balloon;

import java.util.ArrayList;

/**
 * EXERCISE: Add the Command Design Pattern to Balloon
 * Create Commands that will
 * 1) inflate the Balloon till full
 * 2) deflate the Balloon till empty
 * 3) inflate the Balloon till half full
 * 3) pop the Balloon
 * 4) inflate the Balloon to a target final amount
 * 5) inflate the Balloon by a target amount
 * NOTE: Use an appropriate class hierarchy
 * http://www.oodesign.com/command-pattern.html
 *
 * EXERCISE: Create a main that has a sequence of BalloonCommand and
 * executes the sequence on the Balloon repeatedly
 */
public class BalloonCommand {

  public static void main(String[] args){
    Balloon b = new Balloon(100, "Red");

    ArrayList<Command> commandSequence = new ArrayList<Command>();
    Command cmd1 = new InflateFullCommand(b);
    Command cmd2 = new PopCommand(b);

    commandSequence.add(cmd1);
    commandSequence.add(cmd2);

    for (Command cmd : commandSequence){
      cmd.execute();
      System.out.println(b);
    }

  }
}

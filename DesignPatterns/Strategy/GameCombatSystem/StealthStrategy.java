import java.util.*;
import java.io.*;

public class StealthStrategy implements CombatStrategy{
  
  @Override
  public double attack(Character attacker, Character defender){
    return attacker.baseAttack;
  }
  
  @Override
  public double defend(int incomingDamage){
    Random r = new Random();
    int randomNum = r.nextInt(3 - 1 + 1) + 1;

    if (randomNum == 1){
      return 0;
    } else {
      return incomingDamage;
    }
  }

  @Override
  public String getStrategyName(){
    return "Stealth Strategy";
  }
}

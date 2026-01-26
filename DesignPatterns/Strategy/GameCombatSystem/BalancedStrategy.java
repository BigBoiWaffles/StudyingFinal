public class BalancedStrategy implements CombatStrategy{

  @Override
  public double attack(Character attacker, Character defender){
    return attacker.baseAttack;
  }

  @Override
  public double defend(int incomingDamage){
    return incomingDamage;
  }
  
  @Override
  public String getStrategyName(){
    return "Balanced Strategy";
  }
}

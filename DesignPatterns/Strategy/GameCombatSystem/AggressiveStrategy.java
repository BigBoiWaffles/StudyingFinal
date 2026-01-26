public class AggressiveStrategy implements CombatStrategy {
  @Override
  public double attack(Character attacker, Character opponent){
    return attacker.baseAttack + (attacker.baseAttack * 0.50); 
  }

  @Override
  public double defend(int incomingDamage){
    return incomingDamage + (incomingDamage * 0.3);
  }

  @Override
  public String getStrategyName(){
    return "Aggressive Strategy";
  }
}

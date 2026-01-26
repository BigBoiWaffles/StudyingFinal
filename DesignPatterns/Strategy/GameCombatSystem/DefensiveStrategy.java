public class DefensiveStrategy implements CombatStrategy{

  @Override
  public double attack(Character attacker, Character defender){
    return attacker.baseAttack - (attacker.baseAttack * 0.3);
  }

  @Override
  public double defend(int incomingDamage){
    return incomingDamage - (incomingDamage * 0.5);
  }

  @Override
  public String getStrategyName(){
    return "Defensive Strategy";
  }
}

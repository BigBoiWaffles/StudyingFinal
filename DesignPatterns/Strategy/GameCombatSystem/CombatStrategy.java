public interface CombatStrategy {
  double attack(Character attacker, Character defender);
  double defend(int incomingDamage);
  String getStrategyName();
}

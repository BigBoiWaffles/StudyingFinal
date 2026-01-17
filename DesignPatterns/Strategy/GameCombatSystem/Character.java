public class Character{
  String name;
  int health;
  int baseAttack;
  CombatStrategy combatStrategy;

  public Character(String name){
    this.name = name;
  }

  public void setCombatStrategy(CombatStrategy strategy){
    this.combatStrategy = strategy;
  }

  public void attackOpponent(Character opponent){
    opponent.takeDamage()
  }
}

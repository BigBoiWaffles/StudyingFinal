public class Character{
  String name;
  int health;
  int baseAttack;
  CombatStrategy combatStrategy;

  public Character(String name){
    this.name = name;
    this.health = 100;
    this.baseAttack = 10;
  }

  public void setCombatStrategy(CombatStrategy strategy){
    this.combatStrategy = strategy;
  }

  public void attackOpponent(Character opponent){
    this.combatStrategy.attack(this, opponent);
  }

  public void takeDamage(int damage){
    this.combatStrategy.defend(damage);
  }

  public void displayStatus(){
    System.out.println("Health: " + this.health + ". Current Strategy: " + this.combatStrategy.getStrategyName());
  }
}

//Shiraz Turgeman 208250662 and Tehila Dahan 212633507
package ass1;

public class Enemy extends Character {
	private int damage;
	
	public Enemy(String name, int health, int level, int damage) {
		super(name, health, level);
		this.damage = damage;
	}
	public int getDamage() {
		return damage;
	}
	@Override
	public String toString() {
        return super.toString() + "\n" +"Damage: " + damage + "\n";
	}

}

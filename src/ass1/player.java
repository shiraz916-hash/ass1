//Shiraz Turgeman 208250662 and Tehila Dahan 212633507
package ass1;

public class Player extends Character {

    private Item[] inventory;

    public Player(String name) {
        super(name, 10, 1);
        this.inventory = new Item[0];
    }

    public Player(String name, int health, int level) {
        super(name, health, level);
        this.inventory = new Item[0];
    }

    public void addItem(Item item) {
        Item[] newArr = new Item[this.inventory.length + 1];

        for (int i = 0; i < inventory.length; i++) {
            newArr[i] = inventory[i];
        }

        newArr[newArr.length - 1] = item;
        this.inventory = newArr;
    }

    public int calculateInventoryValue() {
        int sum = 0;
        for (int i = 0; i < inventory.length; i++) {
            sum += inventory[i].getValue();
        }
        return sum;
    }

    public boolean hasMagicalItem() {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].isMagical()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String items = "";
        for (int i = 0; i < inventory.length; i++) {
            items += inventory[i].getName();
            if (i < inventory.length - 1) {
                items += " | ";
            }
        }

        return super.toString() +" "+ "Inventory: " + items;
    }
}

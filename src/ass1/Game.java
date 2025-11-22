//Shiraz Turgeman 208250662 and Tehila Dahan 212633507
package ass1;

public class Game {

    public static boolean simulateBattle(Player player, Enemy enemy) {
        if (player.getLevel() > enemy.getLevel()) {
            player.levelUp();
            return true;
        } else if (player.getLevel() < enemy.getLevel()) {
            enemy.levelUp();
            return false;
        } else {
            player.levelUp();
            return true;
        }
    }

    public static void main(String[] args) {

        Item item1 = new Item("Grimoire", 50, false);
        Item item2 = new Item("Ice Sword", 40, false);
        Item item3 = new Item("Guardian Shield", 30, false);
        Item item4 = new Item("Wand of Winds", 25, true);

        Player p1 = new Player("Elara the Enchanter", 5, 0);
        Player p2 = new Player("Kael the Windcaller", 5, 0);

        p1.addItem(item1);
        p1.addItem(item2);

        p2.addItem(item3);
        p2.addItem(item4);

        Enemy enemy1 = new Enemy("Goblin", 10, 2, 3);

        GameWorld world = new GameWorld("Crystalpath", 2);
        world.addPlayer(p1);
        world.addPlayer(p2);

        System.out.println("------------- Player 1 -------------");
        System.out.println(p1 + "\n");

        System.out.println("------------- Player 2 -------------");
        System.out.println(p2 + "\n");

        System.out.println(world + "\n");

        System.out.println(p1.getName() + " - level: " + p1.getLevel() +
                " VS " + enemy1.getName() + " - level: " + enemy1.getLevel());

        boolean result = simulateBattle(p1, enemy1);

        if (result) {
            System.out.println(p1.getName() + " wins!");
        } else {
            System.out.println(enemy1.getName() + " wins!");
        }
    }
}

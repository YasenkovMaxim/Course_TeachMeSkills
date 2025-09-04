package Player;

public class Player {
    int health = 100;
    String playerName;
    Weapon weapon;

    public Player(Weapon weapon, String playerName) {
        this.weapon = weapon;
        this.playerName = playerName;
    }

    void attack() {
        System.out.println("Игрок " + playerName + " атакует используя " + weapon.weaponName +
                ", нанося " + weapon.damage + " урона.");
    }
}







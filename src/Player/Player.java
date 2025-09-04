package Player;

public class Player {
    String playerName;
    Weapon weapon;

    void attack() {
        System.out.println("Игрок " + playerName + " атакует используя " + weapon.weaponName +
                ", нанося " + weapon.damage + " урона.");
    }
}




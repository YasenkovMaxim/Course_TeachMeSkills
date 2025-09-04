package Player;

public class Player {
    String playerName;
    Weapon weapon;

    void attack() {
        System.out.println("Игрок " + playerName + " атакует используя " + weapon.weaponName +
                ", нанося " + weapon.damage + " урона.");
    }

    public static class Weapon {
    String weaponName;
    int damage;

        public Weapon(int damage, String weaponName) {
            this.damage = damage;
            this.weaponName = weaponName;
        }
    }
}



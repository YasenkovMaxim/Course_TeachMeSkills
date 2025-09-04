package Player;

import java.util.Random;

public class PlayerMain {
    public static void main(String[] args) {
        Random random = new Random();
        Weapon gun = new Weapon("пистолет", random.nextInt(25, 50));
        Weapon axe = new Weapon("топор", random.nextInt(10, 25));
        Player maxim = new Player(axe, "Максим");
        Player lena = new Player(gun, "Лена");
        for (int i = 0; i >= 0; i++) {
            maxim.attack();
            lena.attack();
            maxim.health = maxim.health - gun.damage;
            lena.health = lena.health - gun.damage;
            if (maxim.health <= 0) {
                System.out.println(lena.playerName + " выйграла");
                break;
            } else if (lena.health <= 0) {
                System.out.println(maxim.playerName + " выйграл");
                break;
            }
        }
    }
}

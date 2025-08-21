public class DZ_1 {
    public static void main(String[] args) {
// Задача 1
        int b = 6;
        int c = 4;
        int a = 4 * (b + c - 1) / 2;
        System.out.println(a);

        // Задача 2
        int e = 47;
        int f = 0;
        f = e / 10;
        f = f + e % 10;
        System.out.println(f);

        // Задача 3
        int n = 493;
        int m = 0;
        m = n / 100;
        m = m + n / 10 % 10;
        m = m + n % 10;
        System.out.println(m);

        // Задача 4
        float g = 13.48f;
        int g1 = (int) (g + 0.5);
        System.out.println(g1);

        // Задача 5
        int q = 18;
        int w = 7;
        int x = q / w;
        int y = q % w;
        System.out.println(x + " и " + y + " в остатке");

        // Задача*
        int k = 12;
        int l = 5;
        k = k + l;
        l = k - l;
        k = k - l;
        System.out.println(k);
        System.out.println(l);
    }
}

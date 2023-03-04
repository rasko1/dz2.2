//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class main {
    public main() {
    }

    public static void main(String[] args) {
        int x = 100;
        int y = 1500;
        int bonus;
        if (y > 1000) {
            bonus = y / x;
        } else {
            bonus = 0;
        }

        int b = x + y + bonus;
        System.out.println("Спасибо за ваш платеж на сумму " + y + "р.\n Баланс: " + b + "р.\n Ваш бонус составляет: " + bonus + "р.");
    }
}

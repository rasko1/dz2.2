//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {

    public static void main(String[] args) {
        int startScore = 100;
        int deposit = 1500;
        int bonus;
        if (deposit > 1000) {
            bonus = deposit / startScore;
        } else {
            bonus = 0;
        }

        int balance = startScore + deposit + bonus;
        System.out.println("Спасибо за ваш платеж на сумму " + deposit + "р.\n Баланс: " + balance + "р.\n Ваш бонус составляет: " + bonus + "р.");
    }
}

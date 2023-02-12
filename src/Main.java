public class Main {
    public static void main(String[] args) {
        double startingScore = 450;
        double replenishmentAmount = 999;
        double totalAmount = startingScore + replenishmentAmount;
        double bonus = totalAmount / 100;
        double totalAmountWithBonus;

        totalAmount = startingScore + replenishmentAmount;

        if (replenishmentAmount > 1000) {
            totalAmountWithBonus = totalAmount + bonus;

        } else {
            totalAmountWithBonus = totalAmount;
        }

        System.out.println("Итоговый счет:" + " " + totalAmountWithBonus);
        System.out.println("Бонусы:" + " " + bonus);
    }
}

public class Main {
    public static void main(String[] args) {
        int cash = 150;
        int addCash = 1000;
        int bonus = addCash / 100;
        if (addCash >= 1000) {
            cash = cash + bonus + addCash;
            System.out.println("Бонусы " + bonus);
        } else {
            cash = cash + addCash;

        }
        System.out.println("Счет клиента " + cash);


    }
}

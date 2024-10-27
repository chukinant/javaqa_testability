public class Main {

    public static void main(String[] args) {

        // создание нового объекта класса BonusMilesService
        BonusMilesService calc = new BonusMilesService();
        // стоимость билета
        int ticketPrice = 10_000;
        // введение переменной для хранения результата и вызов метода
        int bonusMiles = calc.miles(ticketPrice);
        // пустая строка в консоли
        System.out.println();
        // вывод результата в консоли
        System.out.println("Цена билета: " + ticketPrice + " руб. Бонусных миль: " + bonusMiles);
    }
}



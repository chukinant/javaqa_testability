public class BonusMilesService {

    public int miles(int ticketPrice) {

        // Объявление переменной для хранения результата расчета
        int result;

        // Объявление переменной для хранения количества рублей для одной бонусной мили
        int earningThreshold = 20;

        // Расчет количества бонусных миль
        result = ticketPrice / earningThreshold;

        // отдать данные на выход
        return result;
    }

}

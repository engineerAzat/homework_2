public class Main {
    public static void main(String[] args) {

        // первое задание

        int a = 47513;
        byte b = -125;
        short c = 32767;
        long d = 51355684579L;
        float i = 3.1415f;
        double f = 3.14159265358979;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной i с типом float равно " + i);
        System.out.println("Значение переменной f с типом double равно " + f);

        // второе задание

        float a1 = 27.12f;
        long b1 = 987678965549L;
        float c1 = 2.786f;
        short d1 = 569;
        short i1 = -159;
        short f1 = 27897;
        byte g1 = 67;

        // третье задание

        byte lP = 23; // У Людмилы Павловны 23 ученика
        byte aS = 27; // у Анны Сергеевны 27 учеников
        byte eA = 30; // у Екатерины Андреевны 30 учеников
        int totalStudents =  lP + aS + eA; // общее количество учеников
        short totalSheets = 480; // общее количество листов бумаги
        int totalSheetsOneStudent = totalSheets / totalStudents; // количество листов на одного ученика
        System.out.println("На каждого ученика расчинано " + totalSheetsOneStudent + " листов бумаги");

        // четвертое задание

        byte productivityInOneMinute = 8; // Производительность машины 8 бутылок за одну минуту
        int productivityInTwentyMinutes = 20 * productivityInOneMinute;  // Производительность машины 8 бутылок за 20 минут
        int productivityInOneDay = 24 * 60 * productivityInOneMinute;  // Производительность машины 8 бутылок за сутки
        int productivityInThreeDay = 3 * productivityInOneDay;  // Производительность машины 8 бутылок за 3 дня
        int productivityInOneMonths = 30 * productivityInOneDay;  // Производительность машины 8 бутылок за месяц
        System.out.println("За 20 минут машина произвела " + productivityInTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + productivityInOneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivityInThreeDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + productivityInOneMonths + " штук бутылок");

        // пятое задание

        byte totalColors = 120;  // Необходимое количество банок краски для ремонта всех классов
        byte witheColor = 2;  // Необходимое количество банок белой краски на один класс
        byte brownColor = 4;  // Необходимое количество банок черной краски на один класс
        byte totalClass = (byte) (totalColors / (witheColor + brownColor)); // Расчет общего количествл классов
        byte totalWitheColors = (byte) (witheColor * totalClass); // Расчет необходимого количества банок белой краски
        byte totalBrownColor = (byte) (brownColor * totalClass); // Расчет необходимого количество банок черной краски
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWitheColors + " банок белой краски и " + totalBrownColor + " банок коричневой краски");

        // шестое задание

        byte totalBananas = 5; // Общее количество бананов
        byte weightBananas = 80; // Вес банана
        short totalWeightBananas = (short) (totalBananas * weightBananas); // Общий вес бананов
        short totalMilk = 200; // Общее количество молока
        byte weightMilk = 105; // Вес молока в 100 граммах
        short totalWeightMilk = (short) ((totalMilk / 100) * weightMilk); // Общий вес молока
        byte totalIceCream = 2; // Общее количество мороженого
        byte weightIceCream = 100; // Вес мороженого
        short totalWeightIceCream = (short) (totalIceCream * weightIceCream); //  Общий вес мороженого
        byte totalRawEgss = 4; // Общее количество сырых яиц
        byte weightRawEggs = 70; // Вес сыроко яица
        short totalWeightRawEggs = (short) (totalRawEgss * weightRawEggs); // Общий вес яиц
        short totalWeightbreakfastGg = (short) (totalWeightBananas + totalWeightMilk + totalWeightIceCream + totalWeightRawEggs); // Вес спортивного завтрака в граммах
        float totalWeightbreakfastKg = (float) (totalWeightBananas + totalWeightMilk + totalWeightIceCream + totalWeightRawEggs) / 1000; // Вес спорт завтрака в Килограммах
        System.out.println(totalWeightbreakfastGg);
        System.out.println(totalWeightbreakfastKg);

        // Седьмое задание

        byte excessWeightGr = 7; // Лишний вес спортсмена в кг
        short excessWeightKg = (short) (excessWeightGr * 1000);  // Лишний вес спортсмена в гр
        short minWeightOneDay = 250; // Минимальный вес который спортсмен может потерять в день в гр
        short maxWeightOneDay = 500; // Максимальный вес который спортсмен может потерять в день в гр
        byte maxTotalDays = (byte) (excessWeightKg / minWeightOneDay); // Максимальное количество дней для похудения
        byte minTotalDays = (byte) (excessWeightKg / maxWeightOneDay); // Минимальное количество дней для похудения
        byte averageDays = (byte) ((minTotalDays + maxTotalDays) / 2); // Среднее количество дней для похудения
        System.out.println(maxTotalDays);
        System.out.println(minTotalDays);
        System.out.println(averageDays);

        // Восьмое задание

        int SalaryPerMonthMasha = 67760; // Зарплата Маши в месяц до повышения
        int SalaryPerYearMasha = (SalaryPerMonthMasha * 12); // Годовой доход Маши до повышения
        int SalaryPerYearMashaForPlusTenPercent = (int) (SalaryPerYearMasha + (SalaryPerYearMasha * 0.1)); // Годовой доход Маши после повышения на 10 процентов
        int TotalSalaryMasha = (SalaryPerYearMashaForPlusTenPercent - SalaryPerYearMasha); // Разница годового дохода Маши после повышения на 10 процентов
        int SalaryPerMonthDenis = 83690; // Зарплата Дениса в месяц до повышения
        int SalaryPerYearDenis = (SalaryPerMonthDenis * 12); // Годовой доход Дениса до повышения
        int SalaryPerYearDenisForPlusTenPercent = (int) (SalaryPerYearDenis + (SalaryPerYearDenis * 0.1)); // Годовой доход Дениса после повышения на 10 процентов
        int TotalSalaryDenis = (SalaryPerYearDenisForPlusTenPercent - SalaryPerYearDenis); // Разница годового дохода Дениса после повышения на 10 процентов
        int SalaryPerMonthKristina = 76230;  // Зарплата Кристины в месяц до повышения
        int SalaryPerYearKristina = (SalaryPerMonthKristina * 12); // Годовой доход Кристины до повышения
        int SalaryPerYearKristinaForPlusTenPercent = (int) (SalaryPerYearKristina + (SalaryPerYearKristina * 0.1)); // Годовой доход Кристины после повышения на 10 процентов
        int TotalSalaryKristina = (SalaryPerYearKristinaForPlusTenPercent - SalaryPerYearKristina); // Разница годового дохода Кристины после повышения на 10 процентов
        System.out.println("Маша теперь получает " + SalaryPerYearMashaForPlusTenPercent + " рублей. Годовой доход вырос на " + TotalSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + SalaryPerYearDenisForPlusTenPercent + " рублей. Годовой доход вырос на " + TotalSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + SalaryPerYearKristinaForPlusTenPercent + " рублей. Годовой доход вырос на " + TotalSalaryKristina + " рублей");

















    }
}
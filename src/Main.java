public class Main {
    public static void main(String[] args) {

        // первое задание

        int a = 47513;
        byte b = -125;
        short c = 32767;
        long d = 51355684579L;
        float i = 3.1415f;
        double f = 3.14159265358979;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(i);
        System.out.println(f);

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







    }
}
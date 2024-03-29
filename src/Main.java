public class Main {
    public static void main(String[] args) {

        //Task 1
        byte a = 8;
        short b = 512;
        int c = 149_310_000; //Расстояние от Земли до Солнца в км
        long d =  4_550_000_000L; //Расстояние от Солнца до Нептуна в км
        float e = 3.14f;
        double f = 3.141592653589;

        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        // Task 2
        float flo = 27.12f;
        long lon = 987_678_965_549L;
        double dou = 2.786;
        short sho = 569;
        int in = 27897;
        byte byt = 67;

        // Task 3

        int ludmilaPavlovnaStudents = 23;
        int annaSergeevnaStudents = 27;
        int ekaterinaAndreevnaStudents = 30;
        int allPaper = 480;
        int allStudents = ludmilaPavlovnaStudents + annaSergeevnaStudents + ekaterinaAndreevnaStudents;
        int studentPaper = allPaper / allStudents;

        System.out.println("На каждого ученика рассчитано " + studentPaper + " листов бумаги.");

        // Task 4
         int twoMinutesEfficiency = 16;
         int twentyMinutesEfficiency = twoMinutesEfficiency * 10;
         int dayEfficiency = (twentyMinutesEfficiency * 3) * 24;
         int threeDayEfficiency = dayEfficiency * 3;
         int monthEfficiency = threeDayEfficiency * 10;

         System.out.println("За 20 минут машина произвела " + twentyMinutesEfficiency + " штук бутылок.");
         System.out.println("За сутки машина произвела " + dayEfficiency + " штук бутылок.");
         System.out.println("За 3 дня машина произвела " + threeDayEfficiency + " штук бутылок.");
         System.out.println("За месяц машина произвела " + monthEfficiency + " штук бутылок.");

         // Task 5

        int allPot = 120;
        int whitePotClass = 2;
        int brownPotClass = 4;
        int allPotClass = whitePotClass + brownPotClass;
        int allClasses = allPot / allPotClass;
        int whitePot = whitePotClass * allClasses;
        int brownPot = brownPotClass * allClasses;

        System.out.println("В школе, где " + allClasses + " классов, нужно " + whitePot + " банок белой краски и " + brownPot + " банок коричневой краски.");
    }
}
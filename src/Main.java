import static java.lang.Math.ceil;

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

        // Task 6

        int bananaWeight = 80;
        int milkWeight = 105;
        int plombirBriquetteWeight = 100;
        int eggWeight = 70;
        int bananas = 5;
        int milkPortion = 2;
        int plombirBriquettes = 2;
        int eggs = 4;
        int kG = 1000;
        int cocktailWeight = (bananaWeight * bananas) + (milkWeight * milkPortion) + (plombirBriquetteWeight * plombirBriquettes) + (eggWeight * eggs);
        float cocktailWeightKG = (float)cocktailWeight / (float)kG;

        System.out.println(cocktailWeight + " гр");
        System.out.println(cocktailWeightKG + " кг");

        //Task 7

        double finalTargetWeight = 7;
        double dayTargetWeightMin = 0.25;
        double dayTargetWeightMax = 0.5;
        double dayTargetWeightMid = (dayTargetWeightMin + dayTargetWeightMax) / 2;
        double daysFinalTargetMin = finalTargetWeight / dayTargetWeightMax;
        double daysFinalTargetMax = finalTargetWeight / dayTargetWeightMin;
        double daysFinalTargetMid = finalTargetWeight / dayTargetWeightMid;
        daysFinalTargetMid =  Math.ceil(daysFinalTargetMid);

        System.out.println(daysFinalTargetMin + " дней минимум потребуется для похудения.");
        System.out.println(daysFinalTargetMax + " дней максимум потребуется для похудения.");
        System.out.println(daysFinalTargetMid + " дней в среднем потребуется для похудения.");

        // Task 8

        float mashaSalaryOld = 67760f;
        float denisSalaryOld = 83690f;
        float cristinaSalaryOld = 76230f;
        float index = 0.1f;
        float mashaSalaryNew = mashaSalaryOld + (mashaSalaryOld * index);
        float denisSalaryNew = denisSalaryOld + (denisSalaryOld * index);
        float cristinaSalaryNew = cristinaSalaryOld + (cristinaSalaryOld * index);
        float mashaYearSalaryOld = mashaSalaryOld * 12f;
        float mashaYearSalaryNew = mashaSalaryNew * 12f;
        float denisYearSalaryOld = denisSalaryOld * 12;
        float denisYearSalaryNew = denisSalaryNew * 12;
        float cristinaYearSalaryOld = cristinaSalaryOld * 12;
        float cristinaYearSalaryNew = cristinaSalaryNew * 12;
        float mashaYearSalaryIncrease = mashaYearSalaryNew - mashaYearSalaryOld;
        float denisYearSalaryIncrease = denisYearSalaryNew - denisYearSalaryOld;
        float cristinaYearSalaryIncrease = cristinaYearSalaryNew  - cristinaYearSalaryOld;

        System.out.println("Маша теперь получает " + mashaSalaryNew + " рублей. Годовой доход вырос на " + mashaYearSalaryIncrease + " рублей.");
        System.out.println("Денис теперь получает " + denisSalaryNew + " рублей. Годовой доход вырос на " + denisYearSalaryIncrease + " рублей.");
        System.out.println("Кристина теперь получает " + cristinaSalaryNew + " рублей. Годовой доход вырос на " + cristinaYearSalaryIncrease + " рублей.");
    }
}
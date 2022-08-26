public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        byte a = 11;
        short b = 22;
        int c = 33;
        long d = 4444L;
        float e = 1.5f;
        double g = 12.2545856255;
        System.out.println( " Значение переменной a с типом byte равно " + a  );
        System.out.println( " Значение переменной b с типом short равно " + b  );
        System.out.println( " Значение переменной c с типом int равно " + c  );
        System.out.println( " Значение переменной d с типом long равно " + d  );
        System.out.println( " Значение переменной e с типом float равно " + e  );
        System.out.println( " Значение переменной g с типом double равно " + g  );

        // Задача 2
        System.out.println("Задача 2");
        float q = 27.12f;
        long w = 987678965549L;
        double r = 2.786;
        boolean u = false;
        short t = 569;
        short o = -159;
        int p = 27187;
        byte x = 67;

        // Задача 3
        System.out.println("Задача 3");
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short papers = 480;
        int students = teacher1+teacher2+teacher3;
        int everyStudent = papers/students;
        System.out.println("На каждого ученика расчитано " + everyStudent + " листов бумаги ");

        // Задача 4
        System.out.println("Задача 4");
        byte machineMin = 16/2;
        int machine20Min = 20*machineMin;
        System.out.println("За 20 минут машина произвела бутылок " + machine20Min + " шт");
        int machineDay = 24*60*machineMin;
        System.out.println("За сутки машина произвела бутылок " + machineDay + " шт");
        int machine3Days = 3*24*60*machineMin;
        System.out.println("За 3 суток машина произвела бутылок " + machine3Days + " шт");
        int machineMonth = 30*24*60*machineMin;
        System.out.println("За месяц машина произвела бутылок " + machineMonth + " шт");

        // Задача 5
        System.out.println( "Задача 5");
        byte paint = 120;
        byte oneClassWhite = 2;
        byte oneClassBrown = 4;
        int whiteBrown = oneClassBrown + oneClassWhite;
        int classes = paint/whiteBrown;
        System.out.println(" В школе " + classes + " классов" );
        int sumWhite = classes * oneClassWhite;
        int sumBrown = classes * oneClassBrown;
        System.out.println("В школе, где " + classes + " классов, нужно " + sumWhite + " банок белой краски, и " + sumBrown +
                " коричневой краски");

        //Задача 6
        System.out.println( "Задача 6");
        byte bananas = 5;
        byte weightBananas = 80;
        int sumWeightBananas = bananas * weightBananas;
        short milk = 200;
        short weightMilk = 105;
        int sumWeightMilk = milk/100 * 105;
        byte iceCream = 2;
        byte weightIceCream = 100;
        int sumWeightIceCream = iceCream * weightIceCream;
        byte eggs =  4;
        byte weightEggs = 70;
        int sumWeightEggs = eggs*weightEggs;
        int totalMassGram = sumWeightBananas + sumWeightMilk + sumWeightIceCream + sumWeightEggs;
        System.out.println("Масса готового питания составляет " + totalMassGram + " грамма ");
        float totalMassKg = totalMassGram / 1000f;
        System.out.println("Масса готового питания составляет " + totalMassKg + " килограмм ");

        // Задача 7
        System.out.println("Задача 7");
        byte Weight = 7;
        float EveryDayWeight250 = 0.25f;
        float days250 = Weight / EveryDayWeight250;
        System.out.println( " При похудений 250 грамм в день необходимо " + days250 + " дней");
        float EveryDayWeight500 = 0.5f;
        float days500 = Weight / EveryDayWeight500;
        System.out.println( " При похудений 500 грамм в день необходимо " + days500 + " дней");
        float EveryDayWeightAverage = (EveryDayWeight250 + EveryDayWeight500) / 2;
        float DaysAverage = Weight / EveryDayWeightAverage;
        System.out.println( " При среднем значении похудения необходимо " + DaysAverage + " дней");

        // Задача 8
        System.out.println("Задача 8");
        int Masha = 67760;
        int Denis = 83690;
        int Kristi = 76230;
        int MashaPromote = Masha/10;
        int DenisPromote = Denis/10;
        int KristiPromote = Kristi/10;
        int Year = 12;
        int TotalMasha = (Masha + MashaPromote) * Year;
        int TotalDenis = (Denis + DenisPromote) * Year;
        int TotalKristi = (Kristi + KristiPromote) * Year;
        int TotalMashaPr = MashaPromote * Year;
        int TotalDenisPr = DenisPromote * Year;
        int TotalKristiPr = KristiPromote * Year;
        System.out.println( " Маша теперь получает " + TotalMasha + " рублей в год. Годовой доход увеличился на "
                + TotalMashaPr + " рублей ");
        System.out.println( " Денис теперь получает " +  TotalDenis + " рублей в год. Годовой доход увеличился на "
                + TotalDenisPr + " рублей ");
        System.out.println( " Кристина теперь получает " + TotalKristi + " рублей в год. Годовой доход увеличился на "
                + TotalKristiPr + " рублей ");

    }
}

public class Main {
    public static void main(String[] args) {
        String line="-------------------------------------------------------------";
              /*Задача 1
Продолжите работать с кодом, который вы написали в предыдущем уроке — в задачах с накоплениями.
С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
Результат программы должен быть выведен в консоль с тем количеством месяцев,
 которое необходимо для накопления данной суммы. Формат сообщения:
  «Месяц …, сумма накоплений равна … рублей» .*/
        int totalDep=2_459_000;
        int monthDep=15_000;
        int numberMonth=1;
        int temp=monthDep;
        while (monthDep<=totalDep){
            System.out.println("за "+numberMonth+" месяц сумма накоплений равна "+monthDep);
            numberMonth++;
            monthDep+=temp;
        }
        System.out.println(line);
/*Задача 2
Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
Для обоих циклов можно использовать как одну общую переменную, так и свою в каждом цикле.
Не забудьте выполнить переход на новую строку между двумя циклами.
В результате программы вывод должен получиться следующим:
1 2 3 4 5 6 7 8 9 10
10 9 8 7 6 5 4 3 2 1*/
        int i = 1;
        int lenghtRound=10;
        while (i<=lenghtRound){
            System.out.print(i+",");
            i++;
        }
        System.out.println();
        for(i=0;i<lenghtRound;lenghtRound--){
            System.out.print(lenghtRound+",");
        }
        System.out.println("\n"+line);
/*Задача 3
В стране Y население — 12 миллионов человек.
Рождаемость составляет 17 человек на 1000, смертность — 8 человек.
Рассчитайте, какая численность населения будет через 10 лет, если показатели рождаемости и смертности постоянны.
В консоль выведите результат операции на каждый год в формате: «Год …, численность населения составляет …».*/
        {
            int populationInY = 12_000_000;
            /*низнаю ,как правильно назвать переменную..,и нужна ли она вообще*/
            int conditionalNumber = 1_000;
            int natalityHuman = 17;
            int natalityHumanTotal = populationInY / conditionalNumber * natalityHuman;
            int deathRateHuman = 8;
            int deathRateHumanTotal = populationInY / conditionalNumber * deathRateHuman;
            int growthHumanOnYear = natalityHumanTotal - deathRateHumanTotal;
            int countYears = 10;
            for ( i = 1; i <= countYears;i++){
                populationInY+=growthHumanOnYear;
                System.out.println("за " +i+" год численность населения составляет "
                        +populationInY+" ,прирост составляет "+growthHumanOnYear+" человек.");
            }
        }
        System.out.println(line);
        {
/*Задача 4
Василий решил положить деньги на накопительный счет,
где каждый месяц к сумме его вклада добавляется еще 7%. Первоначальная сумма вклада — 15 тысяч рублей.
Вычислите и выведите в консоль,
сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей при условии,
что процент банка от накоплений не меняется, а всегда равен 7%.
Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.*/
            var startDeposit = 15_000;
            var bankInterestMonth = 0.07;
            int totalDeposit = 12_000_000;
            int countMonth = 1;
            int interesDeposit = (int) (startDeposit * bankInterestMonth);
            //не уверен ,что подводить к int правильно.
            var temporary = interesDeposit;
            while ((interesDeposit + startDeposit) < totalDeposit) {
                System.out.println("за " + countMonth + " месяц сумма накоплений составила ->"
                        + (interesDeposit + startDeposit) + " руб.");
                interesDeposit += temporary;
                countMonth++;
            }
        }
        System.out.println(line);
        {
            /*Задача 5
Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд,
а только каждый шестой. Должны быть видны накопления за 6-й, 12-й, 18-й, 24-й и следующие месяцы.*/
            var startDeposit=15_000;
            var bankInterestMonth=0.07;
            int totalDeposit=12_000_000;
            int countMonth=1;
            int interesDeposit=(int) (startDeposit*bankInterestMonth);
            var temporary=interesDeposit ;
            while ((interesDeposit+startDeposit)<totalDeposit){
                if(countMonth%6==0) {
                    System.out.println("за " + countMonth + " месяц сумма накоплений составила ->"
                            + (interesDeposit + startDeposit) + " руб.");
                }
                interesDeposit+=temporary;
                countMonth++;
            }
        }
        System.out.println(line);
        /*Задача 6
Василий решил, что будет копить деньги ближайшие 9 лет.
Он хочет знать, какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
Исходная сумма всё та же — 15 тысяч рублей, проценты банка — 7% ежемесячно.
Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.*/
        {
            var startDeposit = 15_000;
            var bankInterestMonth = 0.07;
            int countMonth = 1;
            int interesDeposit = (int) (startDeposit * bankInterestMonth);
            var temporary=interesDeposit ;
            int monthInYear=12;
            int totalYears=countMonth*monthInYear*9;
            for(i=countMonth;i<=totalYears;i++){
                if(i%6==0){
                    System.out.println("за "+i+" месяцев сумма вклада составляет -> "
                            +(interesDeposit + startDeposit) + " руб.");
                }
                interesDeposit+=temporary;
            }
        }
        System.out.println(line);
    /*Задача 7
В компании пятница — отчетный день.
Нужно написать программу, которая считает дни месяца по датам,
определяет, какой день — пятница, и выводит сообщение с напоминанием,
что нужно подготовить еженедельный отчет.
Создайте переменную типа int,
которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
Выведите на каждую пятницу месяца (включая полученную)
сообщение следующего вида: «Сегодня пятница, ...-е число. Необходимо подготовить отчет».
В нашем месяце 31 день.
В результате у вас должно получиться от 4 до 5 сообщений с напоминаниями по разным датам.*/
        int countDayInMonth=31;
        int friday=4;
        int countDayInWeek=7;
        while (friday<=countDayInMonth){
            System.out.println("Сегодня пятница "+friday+"-е число. Необходимо подготовить отчет");
            friday+=countDayInWeek;
        }
        System.out.println(line);
/*Задача 8
Нам нужно написать астрономическое приложение, которое считает, когда над Землей пролетает комета.
Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
В консоль нужно вывести все годы за последние 200 лет,
когда появлялась комета, а также следующий год ее появления (ближайшие 100 лет).
Для вычисления периода можно создать две дополнительные переменные,
которые содержат год за 200 лет до текущего (из созданной ранее переменной)
в качестве старта и 100 лет после в качестве завершения периода расчета.
В результате решения задачи в консоли должен получиться следующий результат:
1896  1975 2054*/
        int startYear=1823;
        int stopYear=2023;
        int cometYear=1896;
        int countYearComet=79;
        while (startYear<=stopYear+countYearComet){
            if(startYear==cometYear){
                System.out.println("год когда комета пролетает над землей "+startYear);
                cometYear+=countYearComet;
            }
            startYear++;
        }


    }
}
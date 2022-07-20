public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");

        int age = 19;
        if (age > 20) {
            System.out.println("Возраст: старше 20 лет");
        } else {
            System.out.println("Возраст: младше 20 лет");
        }

        String sex = "female";
        if (sex != "male") {
            System.out.println("Пол: женский");
        }

        double height = 1.90;
        if (height < 1.80) {
            System.out.println("Рост: ниже 180 см");
        } else {
            System.out.println("Рост: выше 180 см");
        }

        String name = "Minnie";
        char firstLetterOfName;
        firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Первая буква имени М");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Первая буква имени I");
        } else {
            System.out.println("Первая буква не M и не I");
        }
        
        System.out.println("\n2. Поиск max и min числа\n");

        int num1 = 5;
        int num2 = 7;

        if (num1 > num2) {
            System.out.println("Максимальное число: " + num1 + "\nМинимальное число: " + num2);
        } else {
            System.out.println("Максимальное число: " + num2 + "\nМинимальное число: " + num1);
        }
        
        System.out.println("\n3. Работа с числом\n");

        int srcNum = 0;

        System.out.print("Число: " + srcNum + " является");
        if (srcNum == 0) {
            System.out.print(" нулём");
        } else {
            if (srcNum % 2 != 0) {
                System.out.print(" нечетным");
            } else if (srcNum % 2 == 0) {
                System.out.print(" четным");
            }
            if (srcNum > 0) {
                System.out.print(" положительным");
            } else if (srcNum < 0) {
                System.out.print(" отрицательным");
            }
        }

        System.out.println("\n\n4. Поиск одинаковых цифр в числах\n");

        int firstNumber = 521;
        int secondNumber = 521;
        int firstNum1 = firstNumber / 100;
        int secondNum1 = (firstNumber % 100) / 10;
        int thirdNum1 = firstNumber % 10;
        int firstNum2 = secondNumber / 100;
        int secondNum2 = (secondNumber % 100) / 10;
        int thirdNum2 = secondNumber % 10;

        System.out.print("В числах " + firstNumber + " и " + secondNumber + " одинаковые цифры: ");
        if (firstNum1 == firstNum2) {
            System.out.print(firstNum1 + " в первом разряде, ");
        }
        if (secondNum1 == secondNum2) {
            System.out.print(secondNum1 + " во втором разряде, ");
        }
        if (thirdNum1 == thirdNum2) {
            System.out.print(thirdNum1 + " в третьем разряде, ");
        }

        System.out.println("\n\n5. Определение буквы, числа или символа по их коду\n");

        char unknownChar = '\u0057';

        System.out.print(unknownChar);
        if (unknownChar >= 'A' && unknownChar <= 'Z') {
            System.out.print(" это большая буква");
        } else if (unknownChar >= 'a' && unknownChar <= 'z') {
            System.out.print(" это маленькая буква");
        } else if (unknownChar >= '0' && unknownChar <= '9') {
            System.out.print(" это число");
        } else {
            System.out.print(" это символ");
        }

        System.out.println("\n\n6. Определение суммы вклада и начисленных банком %\n");

        int depositSum = 300_000;
        int depositInterest = 1;
        double percentage;

        System.out.println("Сумма вклада: " + depositSum);
        if (depositSum < 100_000) {
            depositInterest = 5;
        } else if (depositSum >= 100_000 && depositSum < 300_000) {
            depositInterest = 7;
        } else if (depositSum >= 300_000) {
            depositInterest = 10;
        }
        System.out.print("Начисленый процент: " + depositInterest + "% годовых");
        percentage = depositSum * depositInterest / 100;
        System.out.println(" (" + percentage + " руб.)");
        System.out.println("Итоговая сумма с процентами составляет: " + (depositSum + percentage) + "руб.");

        System.out.println("\n7. Определение оценки по предметам\n");

        int historyPercent = 59;
        int programmingPercent = 91;
        int historyGrade = 0;
        int programmingGrade = 0;

        if (historyPercent > 91) {
            historyGrade = 5;
        } else if (historyPercent > 73) {
            historyGrade = 4;
        } else if (historyPercent > 60) {
            historyGrade = 3;
        } else if (historyPercent <= 60) {
            historyGrade = 2;
        }
        System.out.println(historyGrade + " История");

        if (programmingPercent > 91) {
            programmingGrade = 5;
        } else if (programmingPercent > 73) {
            programmingGrade = 4;
        } else if (programmingPercent > 60) {
            programmingGrade = 3;
        } else if (programmingPercent <= 60) {
            programmingGrade = 2;
        }
        System.out.println(programmingGrade + " Программирование");
        System.out.println("Средний балл оценок по предметам: " + ((historyGrade + programmingGrade) / 2));
        System.out.println("Средний % по предметам: " + ((historyPercent + programmingPercent) / 2));

        System.out.println("\n8. Расчет прибыли");

        int rentPrice = 5_000;
        int averageSale = 13_000;
        int costOfGoods = 9_000;
        int yearProfit = (averageSale - (costOfGoods + rentPrice)) * 12;

        System.out.print("Прибыль за год: ");
        if (yearProfit > 0) {
            System.out.print("+");
        }
        System.out.println(yearProfit + ("руб"));

        System.out.println("\n9. Подсчет количества банкнот\n");

        int requiredSum = 567;
        int hundreds = 100;
        int dozens = 10;
        int units = 1;
        int requiredHundreds = requiredSum / 100;
        int requiredDozens = (requiredSum - (requiredHundreds * hundreds)) / 10;
        int dozensAmount = 5;

        System.out.println("Доступные номиналы банкнот: " + hundreds + ", " + dozens + ", " + units);
        System.out.print("Необходимое количество банкот: ");
        if (requiredDozens > dozensAmount) {
            requiredDozens = dozensAmount;
        }
        int requiredUnits = requiredSum -(requiredHundreds * hundreds) - (requiredDozens * dozens);
        System.out.print(requiredHundreds + " сотен" + ", " + requiredDozens + " десяток" + ", ");
        System.out.print(requiredUnits + " купюр по доллару\nUSD к выдаче: ");
        System.out.println((requiredHundreds * hundreds) + (requiredDozens * dozens) + (requiredUnits));
    }
}

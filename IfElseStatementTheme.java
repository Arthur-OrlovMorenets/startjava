public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");

        int age = 19;
        double height = 1.90;
        String name = "Minnie";
        String sex = "female";
        char firstLetterOfName;

        if (age > 20) {
            System.out.println("Возраст: старше 20 лет");
        } else {
            System.out.println("Возраст: младше 20 лет");
        }

        if (sex != "male") {
            System.out.println("Пол: женский");
        }

        if (height < 1.80) {
            System.out.println("Рост: ниже 180 см");
        } else {
        System.out.println("Рост: выше 180 см");
        }

        firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Первая буква имени М");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Первая буква имени I");
        } else {
            System.out.println("Первая буква не M и не I");
        }
        
        System.out.println("\n2. Поиск max и min числа\n");

        int firstVal = 5;
        int secondVal = 7;

        if (firstVal > secondVal) {
            System.out.println("Максимальное число: " + firstVal + "\nМинимальное число: " + secondVal);
        } else {
            System.out.println("Максимальное число: " + secondVal + "\nМинимальное число: " + firstVal);
        }
        
        System.out.println("\n3. Работа с числом\n");

        int srcNum = -18;

        System.out.print("Число: " + srcNum);
        if (srcNum == 0) {
            System.out.print(" является нулём");
        } else {
            if (srcNum % 2 != 0) {
                System.out.print(" является нечетным");
            if (srcNum > 0) {
                System.out.print(" положительным");
            } else {
                System.out.print(" отрицательным");
            }
            } else if (srcNum % 2 == 0) {
                System.out.print(" является четным");
            if (srcNum > 0) {
                System.out.print(" положительным");
            } else {
                System.out.print(" отрицательным");
                }
            }
        }

        System.out.println("\n\n4. Поиск одинаковых цифр в числах\n");

        int firstNumber = 521;
        int secondNumber = 521;
        int firstNum1 = firstNumber / 100;
        int secondNum1 = (firstNumber % 100) / 10;
        int thirdNum1 = (firstNumber % 100) % 10;
        int firstNum2 = secondNumber / 100;
        int secondNum2 = (secondNumber % 100) / 10;
        int thirdNum2 = (secondNumber % 100) % 10;

        System.out.print("В числах " + firstNumber + " и " + secondNumber + " одинаковые цифры");
        if (firstNum1 == firstNum2) {
            System.out.print(" " + firstNum1);
            if (secondNum1 == secondNum2) {
                System.out.print(", " + secondNum1);
                    if (thirdNum1 == thirdNum2) {
                    System.out.print(", " + thirdNum1);
                }
            }
        } else if (secondNum1 == secondNum2) {
            System.out.print(" " + secondNum1);
            if (thirdNum1 == thirdNum2) {
                System.out.print(" и " + thirdNum1);
            }
        } else if (thirdNum1 == thirdNum2) {
            System.out.print(" " + thirdNum1);
        }
        if ( firstNum1 == firstNum2 && secondNum1 == secondNum2 && thirdNum1 == thirdNum2) {
            System.out.print(" стоят в 1, 2, 3 разрядах");
        } else if (secondNum1 == secondNum2 && thirdNum1 == thirdNum2) {
            System.out.print(" стоят в 2, 3 разрядах");
        } else if (thirdNum1 == thirdNum2) {
            System.out.print(" стоят третьем разряде");
        }

        System.out.println("\n\n5. Определение буквы, числа или символа по их коду\n");

        char srcChar = '\u0057';

        System.out.print(srcChar);
        if (srcChar >= 'A' && srcChar <= 'Z') {
            System.out.print(" это большая буква");
        } else if (srcChar >= 'a' && srcChar <= 'z') {
            System.out.print(" это маленькая буква");
        } else if (srcChar >= 0 && srcChar <= 9) {
            System.out.print(" это число");
        } else {
            System.out.print(" это символ");
        }

        System.out.println("\n\n6. Определение суммы вклада и начисленных банком %\n");

        int depositSum = 300_000;
        int depositRateLess100k = 5;
        int depositRateLess300k = 7;
        int depositRateMore300k = 10;
        double percentage;

        System.out.println("Сумма вклада: " + depositSum);
        if ( depositSum < 100_000) {
            System.out.print("Начисленный процент: " + depositRateLess100k + "% годовых");
            percentage = depositSum * depositRateLess100k / 100;
            System.out.println(" (" + percentage + " руб.)");
            System.out.println("Итоговая сумма с процентами составляет: " + (depositSum + percentage) + "руб.");
        } else if ( depositSum >= 100_000 && depositSum < 300_000) {
            System.out.print("Начисленный процент: " + depositRateLess300k + "% годовых");
            percentage = depositSum * depositRateLess300k / 100;
            System.out.println(" (" + percentage + " руб.)");
            System.out.println("Итоговая сумма с процентами составляет: " + (depositSum + percentage) + "руб.");
        } else if ( depositSum >= 300_000) {
            System.out.print("Начисленный процент: " + depositRateMore300k + "% годовых");
            percentage = depositSum * depositRateMore300k / 100;
            System.out.println(" (" + percentage + " руб.)");
            System.out.println("Итоговая сумма с процентами составляет: " + (depositSum + percentage) + "руб.");
        }

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
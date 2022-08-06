public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEven = 0;
        int sumOdd = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max)");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max;
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }
        int min;
        if (num1 < num2 && num1 < num3) {
            min = num1;
        } else if (num2 < num1 && num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }
        System.out.println("Наименьшее число: " + min + ", наибольшее число: " + max);
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");

        int srcNumber = 1234;
        int sumDigits = 0;
        while (srcNumber > 0) {
            int digit;
            System.out.print(digit = srcNumber % 10);
            sumDigits += digit;
            srcNumber /= 10;
        }
        System.out.println("\n" + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        counter = 0;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%5d", i);
            counter++;
            if (counter % 5 == 0) {
                System.out.println();
            }
        }
        for (int i = counter; i % 5 != 0; i += 1) {
            System.out.printf("%5d", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        srcNumber = 3141591;
        int countOnes = 0;
        System.out.print("число " + srcNumber);
        while (srcNumber > 0) {
            int digit = srcNumber % 10;
            if (digit == 1) {
                countOnes++;
            }
            srcNumber /= 10;
        }
        System.out.print(" содержит " + countOnes);
        if (countOnes % 2 == 0) {
            System.out.print(" (четное) количество единиц");
        } else {
            System.out.print(" (нечетное) количество единиц");
        }

        System.out.println("\n\n6. Отображение фигур в консоли");
        for (int i = 1; i < 6; i++) {
            System.out.println("**********");
        }

        System.out.println("");

        int iteration = 5;
        int symbolsAmount = 5;
        while (iteration > 0) {
            while (symbolsAmount > 0) {
                System.out.print("#");
                symbolsAmount--;
            }
            System.out.println("");
            iteration--;
            symbolsAmount = iteration;
        }

        System.out.println("");

        iteration = 0;
        symbolsAmount = 5;

        do {
            if (symbolsAmount < 3) {
                iteration = symbolsAmount;
            } else {
                iteration = 6 - symbolsAmount;
            }
            do {
                System.out.print("$");
            } while (--iteration > 0);
            System.out.println("");
            symbolsAmount--;
        } while (symbolsAmount > 0);

        System.out.println("\n7. Отображение ASCII-символов");

        System.out.printf("%10s%10s%n","Dec","Char");
        for (int i = 1; i < 48; i += 2) {
            System.out.printf("%10s%10c%n",i,(char) i);
        }

        for (int i = 98; i < 123; i+=2) {
            System.out.printf("%10s%10c%n",i,(char) i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");

        srcNumber = 1234321;
        int reversed = 0;
        int number = srcNumber;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        if (srcNumber == reversed) {
            System.out.println("число " + srcNumber + " является палиндромом");
        } else {
            System.out.println("не палиндром");
        }

        System.out.println("\n9. Определение, является ли число счастливым");

        srcNumber = 123321;
        int firstSum = 0;
        int secondSum = 0;
        counter = 0;
        int countDigits = 0;

        //счетчик для подсчета количества цифр в числе\
        number = srcNumber;
        while (number != 0) {
            int digit = number % 10;
            countDigits++;
            number /= 10;
        }

        number = srcNumber;
        System.out.print("Сумма цифр ");
        while (number != 0) {
            int digit = number % 10;
            counter++;
            number /= 10;
            if (counter < (countDigits / 2) + 1) {
                firstSum += digit;
                System.out.print(digit);
                if (counter == countDigits / 2) {
                    System.out.print(" = " + firstSum + ";\n");
                    System.out.print("Сумма цифр ");
                }
            }
            if (counter > countDigits / 2 && counter < countDigits + 1) {
                secondSum += digit;
                System.out.print(digit);
                if (counter == countDigits) {
                    System.out.print(" = " + secondSum + ";\n");
                }
            }
        }
        if (firstSum == secondSum) {
            System.out.println("Число " + srcNumber + " является счастливым");
        } else {
            System.out.println("Число " + srcNumber + " не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");

        System.out.printf("%11s%12s%n", "ТАБЛИЦА", "ПИФАГОРА");
        System.out.printf("%4s%3s%3s%3s%3s%3s%3s%3s%3s%n", "|", "2", "3", "4", "5", "6", "7", "8", "9");
        System.out.printf("%28s%n", "___|________________________");
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%3d", i * j);
                if (j == 1) {
                    System.out.print("|");
                }
                if (j == 9) {
                    System.out.println();
                }
            }
        }
    }
}

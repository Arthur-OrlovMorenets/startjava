import java.sql.SQLOutput;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEven = 0;
        int sumOdd = 0;
        int limitValue = -10;
        do {
            if (limitValue % 2 == 0) {
                sumEven += limitValue;
            } else {
                sumOdd += limitValue;
            }
            limitValue++;
        } while (limitValue <= 21);
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
        int digit;
        int sumDigits = 0;
        while (srcNumber > 0) {
            digit = srcNumber % 10;
            System.out.print(digit);
            sumDigits += digit;
            srcNumber /= 10;
        }
        System.out.println("\n" + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int counter = 0;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%5d", i);
            counter ++;
            if (counter % 5 == 0) {
                System.out.print("\n");
            }
        }
        for (int i = counter; counter >= 12 && counter < 15; counter += 1) {
            System.out.printf("%5d", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        int number = 3141591;
        int countOnes = 0;
        System.out.print("число " + number);
        while (number > 0) {
            int lastNumber = number % 10;
            if (lastNumber == 1) {
                countOnes ++;
            }
            number /= 10;
        }
        if (countOnes % 2 == 0) {
            System.out.print(" содержит четное количество единиц");
        } else {
            System.out.print(" содержит нечетное количество единиц");
        }

        System.out.println("\n\n6. Отображение фигур в консоли");
        for (int i = 1; i < 6; i++) {
            System.out.println("**********");
        }

        System.out.println("");

        int cycle = 5;
        int symbol = 5;
        while (cycle > 0) {
            while ( symbol > 0) {
                System.out.print("#");
                symbol--;
            }
            System.out.println("");
            cycle--;
            symbol = cycle;
        }

        System.out.println("");

        cycle = 0;
        symbol = 5;

        do {
            if (symbol < 3) {
                cycle = symbol;
            } else {
                cycle = 6 - symbol;
            }
            do {
                System.out.print("$");
            } while ( --cycle > 0);
            System.out.println("");
            symbol--;
        } while ( symbol > 0);

        System.out.println("\n7. Отображение ASCII-символов");

        System.out.printf("%10s%10s%n","Dec","Char");
        for (int i = 1; i < 48; i+=2) {
            System.out.printf("%10s%10c%n",i,(char)i);
        }

        for (int i = 98; i < 123; i+=2) {
            System.out.printf("%10s%10c%n",i,(char)i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");

        int num = 1234321;
        int reversed = 0;

        for (number = num; number != 0; number /= 10) {
            digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        if (num == reversed) {
            System.out.println("число " + num + " является палиндромом");
        } else {
            System.out.println("не палиндром");
        }

        System.out.println("\n9. Определение, является ли число счастливым");

        num = 123321;
        int firstSum = 0;
        int secondSum = 0;
        counter = 0;

        System.out.print("Сумма цифр ");
        for (number = num; number != 0; number /= 10) {
            digit = number % 10;
            counter++;
        if ( counter < 4) {
            firstSum = firstSum + digit;
            System.out.print(digit);
            if (counter == 3) {
                System.out.print(" = " + firstSum + ";\n");
                System.out.print("Сумма цифр ");
            }
        }
        if (counter > 3 && counter < 7) {
            secondSum = secondSum + digit;
            System.out.print(digit);
            if (counter == 6) {
                System.out.print(" = " + secondSum + ";\n");
            }
        }
        }
        if ( firstSum == secondSum) {
            System.out.println("Число " + num + " является счастливым");
        } else {
            System.out.println("Число " + num + " не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");

        int result = 0;
        System.out.printf("%11s%12s%n", "ТАБЛИЦА", "ПИФАГОРА");
        System.out.printf("%4s%3s%3s%3s%3s%3s%3s%3s%3s%n", "|", "2", "3", "4", "5", "6", "7", "8", "9");
        System.out.printf("%28s%n", "___|________________________");
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                result = i * j;
                System.out.printf("%3d", result);
                if ( j == 1) {
                    System.out.print("|");
                }
                if ( j == 9) {
                    System.out.println("");
                }
            }
        }
    }
}

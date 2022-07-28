public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int even = 0;
        int uneven = 0;
        int i = -10;
        do {
            if (i % 2 == 0) {
                even += i;
            } else {
                uneven += i;
            }
            i++;
        } while (i <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + even + ", а нечетных = " + uneven);

        System.out.println("\n2. Вывод чисел в интервале (min и max)");
        int firstValue = 10;
        int secondValue = 5;
        int thirdValue = -1;
        int max;
        if (firstValue > secondValue && firstValue > thirdValue) {
            max = firstValue;
        } else if (secondValue > firstValue && secondValue > thirdValue) {
            max = secondValue;
        } else {
            max = thirdValue;
        }
        int min;
        if (firstValue < secondValue && firstValue < thirdValue) {
            min = firstValue;
        } else if (secondValue < firstValue && secondValue < thirdValue) {
            min = secondValue;
        } else {
            min = thirdValue;
        }
        System.out.println("Наименьшее число: " + min + ", наибольшее число: " + max);
        for (int j = max; j >= min; j--) {
            System.out.print(j + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int lastNumber;
        int sum = 0;
        while (number > 0) {
            lastNumber = number % 10;
            System.out.print(lastNumber);
            sum += lastNumber;
            number = number / 10;
        }
        System.out.println("\n" + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int counter = 0;
        for (int k = 1; k < 24; k += 2) {
            System.out.printf("%5d", k);
            counter += 1;
            if (k >= 9 && k < 11) {
                System.out.println("\n");
            }
            if (k >= 19 && k < 21) {
                System.out.println("\n");
            }
            if (k >=23) {
                for (counter = counter; counter < 15; counter += 1) {
                    System.out.printf("%5d", 0);
                }
            }
        }

        System.out.println("\n5. Проверка количества единиц на четность");
        number = 3141591;
        int sumOfNumbers = 0;
        System.out.print("число " + number);
        while (number > 0) {
            lastNumber = number % 10;
            if (lastNumber == 1) {
                sumOfNumbers += 1;
            }
            number = number / 10;
        }
        if (number == '0') {
            System.out.println(" не содержит едениц");
        } else if (sumOfNumbers % 2 == 0) {
            System.out.print(" содержит четное количество единиц");
        } else if (sumOfNumbers % 2 != 0) {
            System.out.print(" содержит нечетное количество единиц");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        for (int l = 1; l < 6; l++) {
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

        System.out.println("7. Отображение ASCII-символов");

        System.out.printf("%10s%10s%n","Dec","Char");
        for (int o = 1; o < 48; o+=2) {
            System.out.printf("%10s%10c%n",o,(char)o);
        }

        for (int p = 98; p < 123; p+=2) {
            System.out.printf("%10s%10c%n",p,(char)p);
        }

        System.out.println("8. Проверка, является ли число палиндромом");

        int num = 1234321;
        int reversed = 0;

        for (number = num; number != 0; number /= 10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        if (num == reversed) {
            System.out.println("число " + num + " является палиндромом");
        } else {
            System.out.println("не палиндром");
        }

        System.out.println("9. Определение, является ли число счастливым");



    }
}

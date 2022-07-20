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
    int l = 5;
    int k = 5;
    while (l > 0) {
        while ( k > 0) {
            System.out.print("#");
            k -= 1;
        }
        System.out.println("");
        l -= 1;
        k = l;
        }
    }
}


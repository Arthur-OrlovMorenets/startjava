public class VariablesTheme {
    public static void main(String[] args) {
            //Задача №1
        byte screen = 2;
        short core = 4;
        int ddr = 16000;
        long time = 157_680_000;
        float freqn = 2.6f;
        double freqt = 2.8;
        char c = 'Z';
        boolean boo = true;

        System.out.println("1. Создание переменных и вывод их значений на консоль." + "\n");
        System.out.println("Корпус: Zalman " + c + "3Plus");
        System.out.println("Количество мониторов: " + screen);
        System.out.println("Количество ядер: " + core + "\n" + "Частота ядра Normal: " + freqn + "\n" + "Частота ядра TurboBoost: " + freqt);
        System.out.println("Количество оперативной памяти в Мб: " + ddr + "\n" + "Примерное количество минут с момента сборки ПК: " + time + " минут");
        System.out.println("\"правда\" на английском это: " + "\"" + boo + "\"" + "\n");

            /*Задача №2 
            */
        int x = 100;
        int y = 200;
        int discount = 11;
        double price;

        price = (x + y) - (x + y) * discount / 100;

        System.out.println("2. Расчет стоимости товара со скидкой" + "\n");
        System.out.println("На товары X и Y действует скидка " + discount + "%" + "!");
        System.out.println("Общая стоимость товаров X и Y со скидкой составит: " + price + " рублей!" + "\n");

            //Задача №3 (Внимательный-копирует, невнивательный-высчитывает. =^.^= )
        System.out.println("3. Вывод на консоль слова JAVA" + "\n");
        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a" + "\n");

            //Задача №4 (Представлять в консоли по ТЗ их не требовалось, поэтому как есть)
        byte b = 127;
        short s = 32767;
        int i = 2_147_483_647;
        long l = 9_223_372_036_854_775_807l;

        System.out.println("4. Отображение min и max значений числовых типов данных" + "\n");
        System.out.println(b + "\n" + b++ + "\n" + b-- + "\n");
        System.out.println(s + "\n" + s++ + "\n" + s-- + "\n");
        System.out.println(i + "\n" + i++ + "\n" + i-- + "\n");
        System.out.println(l + "\n" + l++ + "\n" + l-- + "\n");

            //Задача №5
        double d1 = 1.1;
        double d2 = 2.2;
        double d3;

        System.out.println("5. Перестановка значений переменных" + "\n");
        System.out.println("Перестановка значений с помощью третьей переменной:");
        System.out.println("Исходное значение первой переменной d1: " + d1 + ", " + "второй перменной d2: " + d2);
        
        d3 = d1;
        d1 = d2;
        d2 = d3;
        
        System.out.println("Новое значение первой переменной d1: " + d1 + ", " + "второй переменной d2: " + d2 + "\n");
        System.out.println("Перестановка значений с помощью арифметических операций(сложение и вычитание):");
        System.out.println("Текущее значение первой переменной d1: " + d1 + ", " + "второй перменной d2: " + d2);
        
        d1 = d1 + d2;
        d2 = d1 - d2;
        d1 = d1 - d2;
        
        System.out.println("Новое значение первой переменной d1: " + d1 + ", " + "второй переменной d2: " + d2 + "\n");
        System.out.println("Перестановка значений с помощью побитовой операции:");
        System.out.println("Текущее значение первой переменной d1: " + d1 + ", " + "второй перменной d2: " + d2);
        
        //превращаем дробные числа в целые
        d1 = d1 * 1000;
        d2 = d2 * 1000;

        int d11 = (int)d1;
        int d22 = (int)d2;

        d11 = d11 ^ d22;
        d22 = d11 ^ d22;
        d11 = d11 ^ d22;
        //превращаем целые числа обратно в дробные
        d1 = (double)d11 / 1000;
        d2 = (double)d22 / 1000;
        System.out.println("Новое значение первой переменной d1: " + d1 + ", " + "второй переменной d2: " + d2 + "\n");
        
            //Задача №6
        int chr1 = 35;
        char chrSym1 = (char)chr1;
        int chr2 = 38;
        char chrSym2 = (char)chr2;
        int chr3 = 64;
        char chrSym3 = (char)chr3;
        int chr4 = 94;
        char chrSym4 = (char)chr4;
        int chr5 = 95;
        char chrSym5 = (char)chr5;

        System.out.println("6. Вывод символов и их кодов");
        System.out.println(chr1 + " " + chrSym1);
        System.out.println(chr2 + " " + chrSym2);
        System.out.println(chr3 + " " + chrSym3);
        System.out.println(chr4 + " " + chrSym4);
        System.out.println(chr5 + " " + chrSym5 + "\n");

            //Задача №7
        int number = 345;
        int firstNumber;
        int secondNumber;
        int thirdNumber;

        firstNumber = number / 100;
        secondNumber = (number - firstNumber * 100) / 10;
        thirdNumber = number - firstNumber * 100 - secondNumber * 10;
        System.out.println("7. Произведение и сумма цифр числа");
        System.out.println(firstNumber * secondNumber * thirdNumber);
        System.out.println(firstNumber + secondNumber + thirdNumber + "\n");

            //Задача №8
        char space = ' ';
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char lbracket = '(';
        char rbracket = ')';
        
        System.out.println("8. Вывод на консоль ASCII-арт Дюка");
        System.out.println(space + "" + space + "" + space + "" + space + "" + slash + "" + backslash + "" + space + "" + space + "" + space + "" + space + "" + space);
        System.out.println(space + "" + space + "" + space + "" + slash + "" + space + "" + space + "" + backslash + "" + space + "" + space + "" + space + "" + space);
        System.out.println(space + "" + space + "" + slash + "" + underscore + "" + lbracket + "" + space + "" + rbracket + "" + backslash + "" + space + "" + space + "" + space);
        System.out.println(space + "" + slash + "" + space + "" + space + "" + space + "" + space + "" + space + "" + space + "" + backslash + "" + space + "" + space);
        System.out.println(slash + "" + underscore + "" + underscore + "" + underscore + "" + underscore + "" + slash + "" + backslash + "" + underscore + "" + underscore + "" + backslash + "" + space);

            //Задача №9
        int primeNumber = 123;
        int hundreds;
        int dozens;
        int units;

        hundreds = primeNumber / 100;
        dozens = (primeNumber - hundreds * 100) / 10;
        units = primeNumber % (dozens * 10);

        System.out.println("9. Отображение количества сотен, десятков и единиц числа");
        System.out.println("Число " + primeNumber + " содержит:" + "\n" + hundreds + " сотен" + "\n" + dozens + " десятков" + "\n" + units + " единиц" + "\n");

            //Задача №10
        int primeSec = 86_399;
        int hours;
        int minutes;
        int seconds;

        System.out.println("10. Преобразование секунд");
        hours = primeSec / 3600;
        minutes = (primeSec - 3600 * hours) / 60;
        seconds = primeSec % (hours * 3600 + minutes * 60);
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}

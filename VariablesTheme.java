public class VariablesTheme {
    public static void main(String[] args) {
        
        System.out.println("1. Создание переменных и вывод их значений на консоль." + "\n");
        byte screen = 2;
        short core = 4;
        int ddr = 16000;
        long time = 157_680_000;
        float freqn = 2.6f;
        double freqt = 2.8;
        char c = 'Z';
        boolean boo = true;
        
        System.out.println("Корпус: Zalman " + c + "3Plus");
        System.out.println("Количество мониторов: " + screen);
        System.out.println("Количество ядер: " + core + "\n" + "Частота ядра Normal: " + freqn);
        System.out.println("Частота ядра TurboBoost: " + freqt);
        System.out.println("Количество оперативной памяти в Мб: " + ddr);
        System.out.println("Примерное количество минут с момента сборки ПК: " + time + " минут");
        System.out.println("\"правда\" на английском это: " + "\"" + boo + "\"");

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");
        int potatoPrice = 100;
        int colaPrice = 200;
        int discount = 11;
        double discountSize = (potatoPrice + colaPrice) * discount / 100;
        double discountPrice = (potatoPrice + colaPrice) - discountSize;
        
        System.out.println("На картошку и колу действует скидка " + discount + "%" + "(" + discountSize + " рублей)");
        System.out.println("Общая стоимость картошки с колой со скидкой составит: " + discountPrice + " рублей!");

        System.out.println("\n3. Вывод на консоль слова JAVA\n");
        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных\n");        
        byte b = 127;
        short s = 32767;
        int i = 2_147_483_647;
        long l = 9_223_372_036_854_775_807l;
        
        System.out.println(b + "\n" + ++b + "\n" + --b + "\n");
        System.out.println(s + "\n" + ++s + "\n" + --s + "\n");
        System.out.println(i + "\n" + ++i + "\n" + --i + "\n");
        System.out.println(l + "\n" + ++l + "\n" + --l);

        System.out.println("\n5. Перестановка значений переменных\n");        
        double d1 = 1.1;
        double d2 = 2.2;
        double d3;

        System.out.println("Перестановка значений с помощью третьей переменной:");
        System.out.println("Исходное значение первой переменной d1: " + d1 + ", " + "второй перменной d2: " + d2);
        
        d3 = d1;
        d1 = d2;
        d2 = d3;
        
        System.out.println("Новое значение первой переменной d1: " + d1 + ", " + "второй переменной d2: " + d2 + "\n");
        System.out.println("Перестановка значений с помощью арифметических операций(сложение и вычитание):");
        System.out.println("Текущее значение первой переменной d1: " + d1 + ", " + "второй перменной d2: " + d2);
        
        d1 += d2;
        d2 = d1 - d2;
        d1 -= d2;
        
        System.out.println("Новое значение первой переменной d1: " + d1 + ", " + "второй переменной d2: " + d2 + "\n");
        System.out.println("Перестановка значений с помощью побитовой операции:");
        System.out.println("Текущее значение первой переменной d1: " + d1 + ", " + "второй перменной d2: " + d2);
        
        //превращаем дробные числа в целые
        d1 *= 1000;
        d2 *= 1000;

        int d11 = (int) d1;
        int d22 = (int) d2;

        d11 ^= d22;
        d22 = d11 ^ d22;
        d11 ^= d22;
        //превращаем целые числа обратно в дробные
        d1 = (double) d11 / 1000;
        d2 = (double) d22 / 1000;
        System.out.println("Новое значение первой переменной d1: " + d1 + ", " + "второй переменной d2: " + d2);
        
        System.out.println("\n6. Вывод символов и их кодов\n");
        int codeChar1 = 35;
        int codeChar2 = 38;
        int codeChar3 = 64;
        int codeChar4 = 94;
        int codeChar5 = 95;

        System.out.println(codeChar1 + " " + (char) codeChar1);
        System.out.println(codeChar2 + " " + (char) codeChar2);
        System.out.println(codeChar3 + " " + (char) codeChar3);
        System.out.println(codeChar4 + " " + (char) codeChar4);
        System.out.println(codeChar5 + " " + (char) codeChar5);

        System.out.println("\n7. Произведение и сумма цифр числа\n");
        int number = 345;
        int firstNumber = number / 100;
        int secondNumber = (number % 100) / 10;
        int thirdNumber = (number % 100) % 10;

        System.out.println(firstNumber * secondNumber * thirdNumber);
        System.out.println(firstNumber + secondNumber + thirdNumber);

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка\n");
        char space = ' ';
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char lbracket = '(';
        char rbracket = ')';
        
        System.out.println("" +space + space + space + space + slash + backslash + space + space + space + space + space);
        System.out.println(""+ space + space + space + slash + space + space + backslash + space + space + space + space);
        System.out.println(""+ space + space + slash + underscore + lbracket + space + rbracket + backslash + space + space + space);
        System.out.println("" + space + slash + space + space + space + space + space + space + backslash + space + space);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + backslash + underscore + underscore + backslash + space);

        System.out.println("\n9. Отображение количества сотен, десятков и единиц числа\n");
        int srcNum = 123;
        int hundreds = srcNum / 100;
        int dozens = (srcNum % 100 ) / 10;
        int units = (srcNum % 100 ) % 10;

        System.out.println("Число " + srcNum + " содержит:");
        System.out.println(hundreds + " сотен" + "\n" + dozens + " десятков" + "\n" + units + " единиц");

        System.out.println("\n10. Преобразование секунд\n");
        int srcSec = 86_399;
        int hours = srcSec / 3600;
        int minutes = (srcSec % 3600) / 60;
        int seconds = (srcSec % 3600) % 60;
        
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        
        int age = 19;
        double height = 1.90;
        String name = "Max";
        boolean male = false;
        char firstLetterOfName;

        if (age > 20) {
            System.out.println("Больше 20 лет");
        } else {
            System.out.println("Младше 20 лет");
        }

        if(!male) {
            System.out.println("Не мужик!");
        }

        if(height < 1.80) {
            System.out.println("Меньше 180");
        } else {
        System.out.println("Больше 180!");
        }

        firstLetterOfName = name.charAt(0);
        if(firstLetterOfName == 'M') {
            System.out.println("Первая буква имени М");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Первая буква имени I");
        } else {
            System.out.println("Первая буква не M и не I");
        }
    }
}
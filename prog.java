import java.util.Scanner;

public class prog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("выберите что собираетесь сделать");
        System.out.println("1Сложить");
        System.out.println( "2вычитать");
        System.out.println("3Умножить");
        System.out.println("4делить ");
        System.out.println("5выйти");
        int person = scanner.nextInt();
        int result;
        if (person == 5){
            break;
        } 
            if (person == 1){
            System.out.println("Введите первое число:");
            int a = scanner.nextInt();
            System.out.println("Введите второе число:");
            int b = scanner.nextInt();
            System.out.println(("a:" +a));
            System.out.println("b:" +b);
            result = a + b;
            System.out.println("Ответ" +result);
        } else if (person == 2){
            System.out.println("Введите первое число:");
            int a = scanner.nextInt();
            System.out.println("Введите второе число:");
            int b = scanner.nextInt();
            System.out.println(("a:" +a));
            System.out.println("b:" +b);
            result = a - b;
            System.out.println("Ответ" +result);
        } else if (person == 3){
            System.out.println("Введите первое число:");
            int a = scanner.nextInt();
            System.out.println("Введите второе число:");
            int b = scanner.nextInt();
            System.out.println(("a:" +a));
            System.out.println("b:" +b);
            result = a * b;
            System.out.println("Ответ" +result);
        } else if (person == 4){
            System.out.println("Введите первое число:");
            int a = scanner.nextInt();
            System.out.println("Введите второе число:");
            int b = scanner.nextInt();
            if (b == 0){
                System.out.println("На ноль делить нельзя");
            }
            System.out.println(("a:" +a));
            System.out.println("b:" +b);
            result = a / b;
            System.out.println("Ответ" +result);
         
         } else {
            System.out.println("Ошибка");
        }
        System.out.println("Завершено");
    }
        
    }
}

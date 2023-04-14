import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String first = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String second = scanner.nextLine();

        int count = 0;
        int index = first.indexOf(second); // ищем первое вхождение
        while (index != -1) {
            count++; // увеличиваем счетчик вхождений
            index = first.indexOf(second, index + 1); // ищем следующее вхождение
        }

        System.out.println("Количество вхождений: " + count);
    }
}

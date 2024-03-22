import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CarNumberValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите номер автомобиля (для выхода введите 'exit'): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Программа завершена.");
                break;
            }

            if (isValidCarNumber(input)) {
                System.out.println("Номер автомобиля валиден.");
            } else {
                System.out.println("Введен некорректный номер автомобиля.");
            }
        }

        scanner.close();
    }

    public static boolean isValidCarNumber(String carNumber) {
        String regex = "^[А-Я]{1}\\d{3}[А-Я]{2}\\d{2,3}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(carNumber);

        return matcher.matches();
    }
}
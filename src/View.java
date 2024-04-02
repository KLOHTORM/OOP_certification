import java.util.Scanner;

public class View {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getResult(){
        System.out.println("Введите полностью выражение, разделяя все пробелами: ");
        return scanner.nextLine();
    }

    public static void presentResult(int result){
        System.out.println("Ответ: " + result);
    }




}

import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClazzAction action = new ClazzAction();
        ArrayList<Clazz> clazzes = new ArrayList<>();
        Clazz clazz = action.inputClazz(scanner);
        clazzes.add(clazz);
        System.out.println("Bạn có muốn nhập thêm nữa không: ");
        System.out.println("1. Có");
        System.out.println("2. Không");
        System.out.print("Mời bạn chọn: ");
        int functionchoice = functionchoice();
        switch (functionchoice) {
            case 1:
                Clazz clazz1 = action.inputClazz(scanner);
                clazzes.add(clazz1);
                Lab1 lab1 = new Lab1(clazzes);
                System.out.println(lab1.toString());
                break;
            case 2:
                Lab1 lab2 = new Lab1(clazzes);
                System.out.println(lab2.toString());
                break;
        }
    }

    private static int functionchoice() {
        int choice = 0;
        try {
            do {
                choice = new Scanner(System.in).nextByte();
                if (choice > 0 && choice <= 2)
                    break;
                System.out.print("nhập sai, mời nhập lại: ");
            } while (true);
            return choice;
        } catch (Exception e) {
            System.out.print("Nhập sai, nhập lại: ");
        }
        return functionchoice();
    }
}

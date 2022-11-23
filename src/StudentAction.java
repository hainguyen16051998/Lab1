import java.util.Scanner;

public class StudentAction {
    public Student inputStudent(Scanner scanner){
        System.out.print("Mời bạn nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Mời bạn nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.print("Mời bạn nhập tuổi: ");
        Integer age = Integer.parseInt(scanner.nextLine());

//        return new Student(name, address, age);
        Student student = new Student(name, address, age);
        return student;
    }
}

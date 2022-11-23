public class Student {
    public static  int autoID = 0;
    private int id;
    private String name;
    private String address;
    private int age;

    public Student(String name, String address, int age) {
        int temp = autoID++;
        this.id = temp;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getAuto_ID() {
        return autoID;
    }

    public static void setAuto_ID(int auto_ID) {
        Student.autoID = auto_ID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}

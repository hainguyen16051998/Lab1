import java.util.ArrayList;

public class Lab1 {
    private ArrayList<Clazz> clazzes;

    public Lab1(ArrayList<Clazz> clazzes) {
        this.clazzes = clazzes;
    }

    public ArrayList<Clazz> getClazzes() {
        return clazzes;
    }

    public void setClazzes(ArrayList<Clazz> clazzes) {
        this.clazzes = clazzes;
    }

    @Override
    public String toString() {
        return "Lab1{" +
                "clazzes=" + clazzes +
                '}';
    }
}

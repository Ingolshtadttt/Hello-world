import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var students = new Students();
        var st = students.getStudent("Уткин Павел");
        System.out.println(st);
        System.out.println();
        System.out.println(st.getFinalScores());
        System.out.println();
        System.out.println(st.getResultModules());
    }
}

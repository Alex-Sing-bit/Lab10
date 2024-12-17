import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input professor's name: ");
        String name = scanner.next();

        List<Student> s = new ArrayList<>();
        s.add(new Student("Wally"));
        s.add(new Student("Dolly"));
        s.add(new Student("Billy"));

        Lecturer lecturer = new Lecturer(111, name,
                "email@email.com", "Math", s);

        lecturer.teach();
        System.out.println(lecturer.doResearchPaperWork());
    }
}

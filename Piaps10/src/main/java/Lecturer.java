import java.util.List;

public class Lecturer extends ResearchEmployee {

	List<Course> teaches;
	List<Student> connectedStudents;

	public Lecturer(int socialSecurityNumber, String name, String email, String fieldOfStudy, List<Student> students) {
		super(socialSecurityNumber, name, email, fieldOfStudy);
		connectedStudents = students;
	}

	public void teach() {
		for (Student s : connectedStudents) {
			System.out.println("Make " + s.fullName + " study. " + s.study());
		}
	}

	public String createATrainingProgram() {
		// TODO - implement Lecturer.createATrainingProgram
		throw new UnsupportedOperationException();
	}

	public int giveMarksToStudents() {
		// TODO - implement Lecturer.giveMarksToStudents
		throw new UnsupportedOperationException();
	}

}
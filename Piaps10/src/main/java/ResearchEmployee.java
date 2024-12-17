public class ResearchEmployee extends Employee {
	Project project;
	public String fieldOfStudy;

	public ResearchEmployee(int socialSecurityNumber, String name, String email, String fieldOfStudy) {
		this.socialSecurityNumber = socialSecurityNumber;
		this.setName(name);
		this.email = email;
		this.fieldOfStudy = fieldOfStudy;
	}

	public String doResearchPaperWork() {
		return this.getName() + "is doing research paper work in the field of " + this.fieldOfStudy;
	}

	public void superviseTheResearchFieldOfStudents() {
		// TODO - implement ResearchEmployee.superviseTheResearchFieldOfStudents
		throw new UnsupportedOperationException();
	}

}
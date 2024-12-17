public abstract class Employee {

	protected int socialSecurityNumber;
	private String name;
	public String email;

	public void performanceOfOfficialDuties() {
		// TODO - implement Employee.performanceOfOfficialDuties
		throw new UnsupportedOperationException();
	}

	public void getSalary() {
		// TODO - implement Employee.getSalary
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

}
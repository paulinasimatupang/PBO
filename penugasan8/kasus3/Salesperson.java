public class Salesperson implements Comparable<Salesperson> {
    private String firstName;
    private String lastName;
    private int totalSales;

	public Salesperson(String firstName, String lastName, int totalSales) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalSales = totalSales;
	}

	public int compareTo(Salesperson other) {
        int salesComparison = Integer.compare(other.totalSales, this.totalSales);
        if (salesComparison != 0) {
            return salesComparison;
        } else {
            return this.lastName.compareTo(other.lastName);
        }
    }
	
	
	public boolean equals(Object other) {
		return (lastName.equals(((Salesperson)other).getLastName()) 
				&& firstName.equals(((Salesperson)other).getFirstName()));
	}

    public String toString() {
        return firstName + " " + lastName + " (Total Sales: " + totalSales + ")";
    }

    public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getTotalSales() {
		return totalSales;
	}
}

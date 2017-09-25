package chinookdb

class Employee {

	String lastName
	String firstName
	String title
	Date birthDate
	Date hireDate
	String address
	String city
	String state
	String country
	String postalCode
	String phone
	String fax
	String email
	Employee employee

	static hasMany = [customers: Customer,
	                  employees: Employee]

	static mapping = {
		id column: "EmployeeId", generator: "assigned"
		version false
	}

	static constraints = {
		lastName maxSize: 20
		firstName maxSize: 20
		title nullable: true, maxSize: 30
		birthDate nullable: true
		hireDate nullable: true
		address nullable: true, maxSize: 70
		city nullable: true, maxSize: 40
		state nullable: true, maxSize: 40
		country nullable: true, maxSize: 40
		postalCode nullable: true, maxSize: 10
		phone nullable: true, maxSize: 24
		fax nullable: true, maxSize: 24
		email nullable: true, maxSize: 60
	}
}

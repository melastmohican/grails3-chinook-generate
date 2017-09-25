package chinookdb

class Customer {

	String firstName
	String lastName
	String company
	String address
	String city
	String state
	String country
	String postalCode
	String phone
	String fax
	String email
	Employee employee

	static hasMany = [invoices: Invoice]
	static belongsTo = [Employee]

	static mapping = {
		id column: "CustomerId", generator: "assigned"
		version false
	}

	static constraints = {
		firstName maxSize: 40
		lastName maxSize: 20
		company nullable: true, maxSize: 80
		address nullable: true, maxSize: 70
		city nullable: true, maxSize: 40
		state nullable: true, maxSize: 40
		country nullable: true, maxSize: 40
		postalCode nullable: true, maxSize: 10
		phone nullable: true, maxSize: 24
		fax nullable: true, maxSize: 24
		email maxSize: 60
	}
}

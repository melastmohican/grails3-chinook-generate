package chinookdb

class Invoice {

	Date invoiceDate
	String billingAddress
	String billingCity
	String billingState
	String billingCountry
	String billingPostalCode
	BigDecimal total
	Customer customer

	static hasMany = [invoiceLines: InvoiceLine]
	static belongsTo = [Customer]

	static mapping = {
		id column: "InvoiceId", generator: "assigned"
		version false
	}

	static constraints = {
		billingAddress nullable: true, maxSize: 70
		billingCity nullable: true, maxSize: 40
		billingState nullable: true, maxSize: 40
		billingCountry nullable: true, maxSize: 40
		billingPostalCode nullable: true, maxSize: 10
	}
}

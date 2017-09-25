package chinookdb

class InvoiceLine {

	BigDecimal unitPrice
	Integer quantity
	Invoice invoice
	Track track

	static belongsTo = [Invoice, Track]

	static mapping = {
		id column: "InvoiceLineId", generator: "assigned"
		version false
	}
}

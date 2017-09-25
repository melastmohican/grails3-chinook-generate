package chinookdb

class Track {

	String name
	String composer
	Integer milliseconds
	Integer bytes
	BigDecimal unitPrice
	Album album
	Genre genre
	MediaType mediaType

	static hasMany = [invoiceLines: InvoiceLine,
	                  playlists: Playlist]
	static belongsTo = [Album, Genre, MediaType]

	static mapping = {
		id column: "TrackId", generator: "assigned"
		version false
	}

	static constraints = {
		name maxSize: 200
		composer nullable: true, maxSize: 220
		bytes nullable: true
	}
}

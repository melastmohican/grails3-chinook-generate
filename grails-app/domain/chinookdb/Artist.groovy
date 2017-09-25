package chinookdb

class Artist {

	String name

	static hasMany = [albums: Album]

	static mapping = {
		id column: "ArtistId", generator: "assigned"
		version false
	}

	static constraints = {
		name nullable: true, maxSize: 120
	}
}

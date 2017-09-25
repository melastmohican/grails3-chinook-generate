package chinookdb

class Genre {

	String name

	static hasMany = [tracks: Track]

	static mapping = {
		id column: "GenreId", generator: "assigned"
		version false
	}

	static constraints = {
		name nullable: true, maxSize: 120
	}
}

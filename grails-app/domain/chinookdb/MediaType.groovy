package chinookdb

class MediaType {

	String name

	static hasMany = [tracks: Track]

	static mapping = {
		id column: "MediaTypeId", generator: "assigned"
		version false
	}

	static constraints = {
		name nullable: true, maxSize: 120
	}
}

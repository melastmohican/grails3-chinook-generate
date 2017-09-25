package chinookdb

class Playlist {

	String name

	static hasMany = [tracks: Track]

	static mapping = {
		id column: "PlaylistId", generator: "assigned"
		version false
	}

	static constraints = {
		name nullable: true, maxSize: 120
	}
}

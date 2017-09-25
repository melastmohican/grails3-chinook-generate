package chinookdb

class Album {

	String title
	Artist artist

	static hasMany = [tracks: Track]
	static belongsTo = [Artist]

	static mapping = {
		id column: "AlbumId", generator: "assigned"
		version false
	}

	static constraints = {
		title maxSize: 160
	}
}

package com.solutions.problem_two;

public class Song {

	private String artist;
	private String album;
	private int trackId;
	
	public Song(String artist, String album, int trackId) {
		this.artist = artist;
		this.album = album;
		this.trackId = trackId;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getTrackId() {
		return trackId;
	}
	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}
	@Override
	public String toString() {
		return this.artist + this.album + Integer.valueOf(trackId).toString();
	}
	@Override
	public int hashCode() {
		return this.artist.hashCode()
				+ this.album.hashCode()
				+ this.trackId;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj.toString().equals(this.toString())) {
			return true;
		} else {
			return false;
		}
	}
}

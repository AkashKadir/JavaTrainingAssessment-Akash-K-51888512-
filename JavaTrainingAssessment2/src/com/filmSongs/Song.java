package com.filmSongs;

public class Song {

	private int id;
	private String name;
	private String Singers;
	private int film_id;
	
	public Song(int id, String name, String singers, int film_id) {
		super();
		this.id = id;
		this.name = name;
		Singers = singers;
		this.film_id = film_id;
	}
	
	public Song() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSingers() {
		return Singers;
	}

	public void setSingers(String singers) {
		Singers = singers;
	}

	public int getFilm_id() {
		return film_id;
	}

	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}
	
	
	
}

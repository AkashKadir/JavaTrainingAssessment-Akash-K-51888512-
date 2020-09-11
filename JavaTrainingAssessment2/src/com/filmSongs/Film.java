package com.filmSongs;

public class Film {

	private int Id;
	private String name;
	private Song[] songsArray;
	private int songCount = 0;
	private int index = 0;
	
	public Song[] getSongsArray() {
		return songsArray;
	}

	public void setSongsArray(Song[] songsArray) {
		this.songsArray = songsArray;
	}

	public int getSongCount() {
		return songCount;
	}

	public void setSongCount(int songCount) {
		this.songCount = songCount;
		this.songsArray = new Song[songCount];
	}

	public Film(int id, String name) {
		Id = id;
		this.name = name;
	}
	
	public Film() {}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static int getfilmld(String filmName, Film[] arr){
		
		for(int i=0 ; i<arr.length;i++) {
			
			if((arr[i].name).equals(filmName)) {				
				return i;				
			}			
		}		
		return 0;		
	}
	
	public void addSong(Song s)
	{
		songsArray[index++] = s;
	}
}

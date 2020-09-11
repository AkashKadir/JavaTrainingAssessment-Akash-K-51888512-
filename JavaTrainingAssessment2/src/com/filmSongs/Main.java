package com.filmSongs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Films: ");
		int noOfFilms = sc.nextInt();
		Film[] filmArr = new Film[noOfFilms];
		sc.nextLine();
		
		for(int i=0;i<noOfFilms;i++) {
			
			System.out.println("Enter film details: (id , name)");
			String filmDetails = sc.nextLine();
			String[] splitFilm = filmDetails.split(",");
			Film f = new Film(Integer.parseInt(splitFilm[0]),splitFilm[1]);	
			System.out.println("How many songs in "+splitFilm[1]);
			
			int noOfSongs = sc.nextInt();
			sc.nextLine();
			f.setSongCount(noOfSongs);
			
			System.out.println("Enter song details: (id:name:singers)");
			
			for(int j=0;j<noOfSongs;j++) {				
				String songDetails = sc.nextLine();
				String[] splitSong = songDetails.split(":");
				Song s = new Song(Integer.parseInt(splitSong[0]),splitSong[1],splitSong[2], f.getId());
				f.addSong(s);
			}
			filmArr[i]=f;
		}
		
		System.out.println("Enter film name: ");
		String nameCheck = sc.nextLine();
		int id = Film.getfilmld(nameCheck,filmArr);
		System.out.println(id);
		System.out.println("Songs of film "+ filmArr[id].getName()+":");
		System.out.println();		
		
		Song[] songss = filmArr[id].getSongsArray();
		for(int j=0;j<filmArr[id].getSongCount();j++) {		
			System.out.println("Song Name: " + songss[j].getName());
			System.out.println("Singers: " + songss[j].getSingers());			
		}		
	}

}

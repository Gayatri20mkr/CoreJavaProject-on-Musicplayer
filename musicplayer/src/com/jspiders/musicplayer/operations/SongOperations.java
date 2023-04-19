package com.jspiders.musicplayer.operations;

import com.jspiders.musicplayer.entity.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SongOperations {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Song> list = new ArrayList<Song>();
	Song song1 = new Song("boy with love","BTS","Boy with love");
	Song song2 = new Song("life goes on","BTS","Life goes on");
	Song song3 = new Song("Home","BTS","home");
	
	public void playAllSongs() {
		System.out.println("playing All Songs");
		viewAllSongs();
		
	}
	public void playRandomSong() {
		System.out.println("playing random Song");
		Math.random();
	}
    public void chooseSong() {
    	viewAllSongs();
    	System.out.println("enter the song name to add ");
    	String string1 = scanner.nextLine();
    	System.out.println(string1+" is now playing");
    	
    }
    public void editSong() {
    	viewAllSongs();
    	
    }
    public void addSong() {
    	
    	System.out.println("enter the song name to add ");
    	String string = scanner.nextLine();
    	System.out.println("enter the singer name to add ");
    	String singer = scanner.nextLine();
    	System.out.println("enter the movie or album name to add ");
    	String movie = scanner.nextLine();
    	Song song = new Song(string,singer,movie); 
    	
    	list.add(song);
    	
    	System.out.println(string+" is added in your play list");
    	
    	
    }
    public void removeSong() {
    	
    	System.out.println("enter the song name to remove  ");
    	viewAllSongs();
    	Scanner scanner = new Scanner(System.in);
    	String string = scanner.nextLine();
    	list.remove(string);
    	System.out.println(string+" is removed in your play list");
    	
    	
    }
    public void viewAllSongs() {
    	list.add(song1);
    	list.add(song2);
    	list.add(song3);
    	Iterator<Song> i = list.iterator();
    	while(i.hasNext()) {
    		System.out.println(i.next());
    	}
    	
    	
    	
    }
}


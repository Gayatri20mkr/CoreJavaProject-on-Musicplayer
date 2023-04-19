package com.jspiders.musicplayer.main;

import com.jspiders.musicplayer.operations.*;

import java.util.Scanner;

public class MusicPlayer {
	public static void main(String[] args) {
		
	SongOperations operations = new SongOperations();
	
	int choice;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("MusicPlayer");
	System.out.println("1. Play Song");
	System.out.println("2. Add/Remove");
	System.out.println("3. Edit Song");
	System.out.println("4. Exit");
	
	System.out.println("Enter your choice : ");
	
	choice = scanner.nextInt();
	
	//logic
	
	switch(choice) {
	case 1:
		System.out.println("1. Play All");
		System.out.println("2. Play random");
		System.out.println("3. Chose to Play");
		System.out.println("4. Exit");
		System.out.println("Enter your choice : ");
		
		choice = scanner.nextInt();
		
		 switch (choice) {
		      
		case 1:
			operations.playAllSongs();
			break;
		case 2:
			operations.playRandomSong();
			break;
		case 3:
			operations.chooseSong();
			break;
		case 4:
			
			break;

		default:
			System.out.println("enter the valid choice");
			break;
		}
		break;
		
	case 2:
		System.out.println("1. Add Song");
		System.out.println("2. Remove Song");
		System.out.println("3. Go Back");
		System.out.println("Enter your choice : ");
		
		choice = scanner.nextInt();
		
		switch (choice) {
		case 1:
			operations.addSong();
			break;
		case 2:
			operations.removeSong();
			break;
		case 3:
			
			break;

		default:
			break;
		}
		break;
		
	case 3:
		System.out.println("Select Song to edit..");
		operations.editSong();
		break;
		
	case 4:
		
		break;

	default:
		System.out.println("Enter the valid choice...");
		break;
	}
	

}
}

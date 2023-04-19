package com.jspiders.musicplayer.entity;

public class Song {
	private String name;
	private String singer;
	private String movie;
	private double duration;
	int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "Song name : "+name+",Singer Name : " +singer+",movie or album name : "+movie+", duration : "+duration ;
	}
	public Song(String name , String singer , String movie ){
		this.name=name;
		this.movie=movie;
		this.singer=singer;
		this.duration=2.30;
		toString();
	}

}

package com.javacha.demos.mlchallenge.service;

public class TimeTrack {

	private long start, end ;
	
	void start() {
		start = System.currentTimeMillis();
	}
	
	long end() {
		end = System.currentTimeMillis();
		return (end-start);
	}
	
	long elapsed() {
		return end-start;
	}
}

package com.movietime;

public class Showtime implements Comparable<Showtime> {
    private String movieName;
    private int timeSlot; // Time in minutes since midnight for simplicity

    public Showtime(String movieName, int timeSlot) {
        this.movieName = movieName;
        this.timeSlot = timeSlot;
    }

    public String getMovieName() {
        return movieName;
    }

    public int  getTimeSlot() {  
        return timeSlot;
    }

    @Override
    public int compareTo(Showtime other) {
        return this.timeSlot - other.timeSlot;
    }

    @Override
    public String toString() {
        return movieName + " at " + timeSlot + " minutes";
    }
}
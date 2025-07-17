package com.movietime;

public class MovieTimeApplication {
    public static void main(String[] args) {
        Theater theater = new Theater();

        // Initial showtimes
        theater.addShowtime(new Showtime("Inception", 540)); // 9:00 AM
        theater.addShowtime(new Showtime("The Dark Knight", 720)); // 12:00 PM

        // Real-time insertions
        theater.addShowtime(new Showtime("Interstellar", 600)); // 10:00 AM
        theater.addShowtime(new Showtime("Dune", 660)); // 11:00 AM

        // Display sorted list
        theater.displayShowtimes();
    }
}
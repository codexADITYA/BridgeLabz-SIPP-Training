package com.movietime;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private List<Showtime> showtimes;

    public Theater() {
        this.showtimes = new ArrayList<>();
    }

    // Insertion Sort for real-time insertion
    public void addShowtime(Showtime newShow) {
        showtimes.add(newShow);
        int i = showtimes.size() - 1;
        while (i > 0 && showtimes.get(i - 1).compareTo(showtimes.get(i)) > 0) {
            Showtime temp = showtimes.get(i);
            showtimes.set(i, showtimes.get(i - 1));
            showtimes.set(i - 1, temp);
            i--;
        }
        System.out.println("Added: " + newShow);
    }

    public void displayShowtimes() {
        System.out.println("Current Showtimes:");
        for (Showtime show : showtimes) {
            System.out.println(show);
        }
    }
}
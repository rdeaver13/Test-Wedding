/*
 * Author: Ray Deaver
 * Date: 2/15/2023
 */
package TestWedding;

import java.time.LocalDate;

public class Wedding {
    // Variables
    private LocalDate weddingDate;
    private Couple weddingCouple;
    private String weddingLocation;

    // Constructor
    public Wedding(LocalDate weddingDate, Couple weddingCouple, String weddingLocation) {
        this.weddingDate = weddingDate;
        this.weddingCouple = weddingCouple;
        this.weddingLocation = weddingLocation;
    }

    // Getters
    public LocalDate getWeddingDate() {
        return this.weddingDate;
    }

    public Couple getWeddingCouple() {
        return this.weddingCouple;
    }

    public String getWeddingLocation() {
        return this.weddingLocation;
    }
    
}

package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {
    private String bandName;
    private LocalDateTime dateAndTime;
    private int price;

    public Ticket() {
        super();
    }

    public Ticket(String bandName, LocalDateTime dateAndTime, int price) {
        this.bandName = bandName;
        this.dateAndTime = dateAndTime;
        this.price = price;
    }

    public String getBandName() {
        return bandName;
    }

    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }

    public int getPrice() {
        return price;
    }

    public LocalTime entryTime() {
        return dateAndTime.toLocalTime().minusHours(1);
    }
}
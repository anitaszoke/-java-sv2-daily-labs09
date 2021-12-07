package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FromOfStageTicket extends Ticket {

    private String extraCode;

    public FromOfStageTicket(String bandName, LocalDateTime dateAndTime, int price, String extraCode) {
        super(bandName, dateAndTime, price);
        this.extraCode = extraCode;
    }

    public String getExtraCode() {
        return extraCode;
    }

    @Override
    public LocalTime entryTime() {
        return super.entryTime().minusHours(1);
    }
}
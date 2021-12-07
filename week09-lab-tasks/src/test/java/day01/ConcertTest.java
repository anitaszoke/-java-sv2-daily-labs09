package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

    @Test
    void addPersonTest() {
        Person person = new Person(new Ticket("Gojira", LocalDateTime.of(2021, 12, 7, 19, 00), 25000));
        Person personWithExtraCode = new Person(new FromOfStageTicket("Gojira", LocalDateTime.of(2021, 12, 7, 19, 00), 35000, "qwertz"));

        Concert concert = new Concert();
        concert.addPerson(person, LocalTime.of(18, 15));
        concert.addPerson(personWithExtraCode, LocalTime.of(17, 15));

        assertTrue(concert.addPerson(personWithExtraCode, LocalTime.of(17, 15)));
        assertTrue(concert.addPerson(personWithExtraCode, LocalTime.of(17, 15)));
    }


    @Test
    void addPersonCanGetIn() {
        Person person = new Person(new Ticket("Gojira", LocalDateTime.of(2021, 12, 7, 19, 00), 25000));
        Person personWithExtraCode = new Person(new FromOfStageTicket("Gojira", LocalDateTime.of(2021, 12, 7, 19, 00), 35000, "qwertz"));

        Concert concert = new Concert();

        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> concert.addPerson(person, LocalTime.of(17, 15)));
        assertEquals("Can get in", ex.getMessage());
    }

    @Test
    void addPersonCanGetInWithExtraCode() {
        Person personWithExtraCode = new Person(new FromOfStageTicket("Gojira", LocalDateTime.of(2021, 12, 7, 19, 00), 35000, "qwertz"));
        Concert concert = new Concert();

        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> concert.addPerson(personWithExtraCode, LocalTime.of(16, 15)));
        assertEquals("Can get in", ex.getMessage());
    }
}
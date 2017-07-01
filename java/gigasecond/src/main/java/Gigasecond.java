import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    LocalDateTime start;

    Gigasecond(LocalDate birthDate) {
        this(birthDate.atStartOfDay());
    }

    Gigasecond(LocalDateTime birthDateTime) {
        start = birthDateTime;
    }

    LocalDateTime getDate() {
        return start.plusSeconds((long)1e9);
    }

}

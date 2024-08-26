package in.itkaran.bookmyshow_240824.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus status;

    public String toString() {
        return seat.getSeatNumber();
    }
}


/*

ShowSeat: Show
1 - 1
m  - 1

ShowSeat: Seat
1 - 1
m  - 1
 */
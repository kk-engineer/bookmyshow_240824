package in.itkaran.bookmyshow_240824.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{
    private String bookingReference;
    @OneToMany
    private List<ShowSeat> showSeats;
    @ManyToOne
    private User user;
    private int amount;
    @OneToMany
    private List<Payment> payments;
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;
}

/*

User : Booking
1 : M
1 : 1

Enum: Integer Value (Ordinal) : String (String)

 */

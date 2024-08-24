package in.itkaran.bookmyshow_240824.dtos;

import in.itkaran.bookmyshow_240824.models.ShowSeat;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookTicketRequestDto {
    private Long userId;
    private Long showId;
    List<Long> showSeatIds;
}

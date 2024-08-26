package in.itkaran.bookmyshow_240824;

import in.itkaran.bookmyshow_240824.controllers.BookingController;
import in.itkaran.bookmyshow_240824.dtos.BookTicketRequestDto;
import in.itkaran.bookmyshow_240824.dtos.BookTicketResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestBookTicket {
    @Autowired
    BookingController bookingController;

    @Test
    void testBooking() {
        BookTicketRequestDto bookTicketRequestDto = new BookTicketRequestDto();
        bookTicketRequestDto.setUserId(1L);
        bookTicketRequestDto.setShowId(1L);
        bookTicketRequestDto.setShowSeatIds(List.of(9L, 10L));

        BookTicketResponseDto bookTicketResponseDto = bookingController.bookTicket(bookTicketRequestDto);
        System.out.println(bookTicketResponseDto.getBooking());
        System.out.println(bookTicketResponseDto.getStatus());
    }
}

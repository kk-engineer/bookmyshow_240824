package in.itkaran.bookmyshow_240824;

import in.itkaran.bookmyshow_240824.controllers.BookingController;
import in.itkaran.bookmyshow_240824.controllers.UserController;
import in.itkaran.bookmyshow_240824.dtos.BookTicketRequestDto;
import in.itkaran.bookmyshow_240824.dtos.BookTicketResponseDto;
import in.itkaran.bookmyshow_240824.dtos.SignUpRequestDto;
import in.itkaran.bookmyshow_240824.dtos.SignUpResponseDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.BooleanString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Bookmyshow240824ApplicationTests {
    @Autowired
    private UserController userController;

    @Test
    void contextLoads() {
    }

    @Test
    void testUser() {
        SignUpRequestDto signUpRequestDto = new SignUpRequestDto();
        signUpRequestDto.setName("Souvik");
        signUpRequestDto.setEmail("sm@x.com");
        signUpRequestDto.setPassword("123456");

        SignUpResponseDto signUpResponseDto = userController.signUp(signUpRequestDto);
        System.out.println(signUpResponseDto.getName());
        System.out.println(signUpResponseDto.getStatus());
    }
}

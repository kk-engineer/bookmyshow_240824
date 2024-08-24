package in.itkaran.bookmyshow_240824.controllers;

import in.itkaran.bookmyshow_240824.dtos.ResponseStatus;
import in.itkaran.bookmyshow_240824.dtos.SignUpRequestDto;
import in.itkaran.bookmyshow_240824.dtos.SignUpResponseDto;
import in.itkaran.bookmyshow_240824.exceptions.UserAlreadyExistsException;
import in.itkaran.bookmyshow_240824.models.User;
import in.itkaran.bookmyshow_240824.services.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public SignUpResponseDto signUp(SignUpRequestDto signUpRequestDto) {
        SignUpResponseDto signUpResponseDto = new SignUpResponseDto();
        try {
            User user = userService.signUp(
                    signUpRequestDto.getName(),
                    signUpRequestDto.getEmail(),
                    signUpRequestDto.getPassword());

            signUpResponseDto.setName(user.getName());
            signUpResponseDto.setStatus(ResponseStatus.SUCCESS);
        } catch (UserAlreadyExistsException e) {
            System.out.println(e.getMessage());
            signUpResponseDto.setStatus(ResponseStatus.FAILURE);
        }

        return signUpResponseDto;
    }
}

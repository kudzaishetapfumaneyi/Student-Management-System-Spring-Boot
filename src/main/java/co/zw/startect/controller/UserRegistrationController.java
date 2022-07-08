//package co.zw.startect.controller;
//
//import co.zw.startect.service.UserService;
//import co.zw.startect.web.dto.UserRegistrationDto;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//@RequestMapping( "/registration" )
//public class UserRegistrationController {
//
//
//    private UserService userService;
//
//    public UserRegistrationController(UserService userService) {
//        super();
//        this.userService = userService;
//    }
//
//    @ModelAttribute("user")
//    public UserRegistrationDto userRegistrationDto() {
//
//        return new UserRegistrationDto();
//    }
//
//    @GetMapping
//    public String showRegistrationForm(Model model) {
//        model.addAttribute("user", new UserRegistrationDto());
//        return "registration";
//    }
//
//    //post method when user press the registration button
//    @PostMapping
//    public String registerUserAccount(@ModelAttribute("user")UserRegistrationDto registrationDto) {
//        userService.save(registrationDto);
//        return "redirect:/registration?success";
//    }
//
//
//}

package co.simplon.profileUpdate.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.profileUpdate.dtos.ProfileDetailView;
import co.simplon.profileUpdate.dtos.ProfileUpdateDto;
import co.simplon.profileUpdate.services.ProfileService;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

    private ProfileService service;

    public ProfileController(ProfileService service) {
	this.service = service;
    }

    @GetMapping("/1")
    public ProfileDetailView getProfile() {
	return service.getProfile(1L);
    }

    @PatchMapping("/1")
    public String update(
	    @ModelAttribute @Valid ProfileUpdateDto inputs) {
	service.update(inputs, 1L);
	return service.getProfile(1L).getAvatar();

    }

}

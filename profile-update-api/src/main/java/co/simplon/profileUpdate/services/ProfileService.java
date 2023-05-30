package co.simplon.profileUpdate.services;

import co.simplon.profileUpdate.dtos.ProfileDetailView;
import co.simplon.profileUpdate.dtos.ProfileUpdateDto;

public interface ProfileService {

    ProfileDetailView getProfile(Long id);

    void update(ProfileUpdateDto inputs, Long id);

}

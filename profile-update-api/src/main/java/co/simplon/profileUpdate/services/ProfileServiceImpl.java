package co.simplon.profileUpdate.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import co.simplon.profileUpdate.dtos.ProfileDetailView;
import co.simplon.profileUpdate.dtos.ProfileUpdateDto;
import co.simplon.profileUpdate.entities.Profile;
import co.simplon.profileUpdate.repositories.ProfileRepository;

@Service
@org.springframework.transaction.annotation.Transactional(readOnly = true)
public class ProfileServiceImpl implements ProfileService {

    private ProfileRepository profiles;

    @Value("${profiles-api.uploads.location}")
    private String uploadDir;

    public ProfileServiceImpl(ProfileRepository profiles) {
	this.profiles = profiles;
    }

    @Override
    public ProfileDetailView getProfile(Long id) {
	return profiles.findProjectedById(id);
    }

    @Override
    @Transactional
    public void update(ProfileUpdateDto inputs, Long id) {
	Profile entity = profiles.findById(id).get();

	if ((inputs.getAvatar() != null)) {
	    // to do

	}
	entity.setDescription(inputs.getDescription());
	profiles.save(entity);

    }

    private void store(MultipartFile file,
	    String fileName) {
	// to do

    }

}

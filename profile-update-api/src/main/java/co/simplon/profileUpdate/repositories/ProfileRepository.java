package co.simplon.profileUpdate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.profileUpdate.dtos.ProfileDetailView;
import co.simplon.profileUpdate.entities.Profile;

public interface ProfileRepository
	extends JpaRepository<Profile, Long> {
    ProfileDetailView findProjectedById(Long id);
}

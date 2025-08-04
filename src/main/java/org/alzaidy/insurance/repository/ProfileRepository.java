package org.alzaidy.insurance.repository;

import org.alzaidy.insurance.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
    Optional<Profile> findByUuid(String uuid);
}

package org.has.repository;

import org.has.dto.response.DoctorFindallResponseDto;
import org.has.repository.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {
//    Optional<Doctor> findByUuid(UUID uuid);

}

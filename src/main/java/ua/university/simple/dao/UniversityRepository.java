package ua.university.simple.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.university.simple.domain.TypeOfAccreditation;
import ua.university.simple.domain.University;

import java.util.List;

public interface UniversityRepository extends JpaRepository<University, Long> {

    List<University> findByTypeOfAccreditation(TypeOfAccreditation typeOfAccreditation);
}

package ua.university.simple.service;

import ua.university.simple.domain.TypeOfAccreditation;
import ua.university.simple.domain.University;

import java.util.List;

public interface UniversityService {
    University create(University university);

    University update(University university);

    void delete(Long id);

    University findById(Long id);

    List<University> findAll();

    List<University> findByTypeOfAccreditation(TypeOfAccreditation typeOfAccreditation);
}

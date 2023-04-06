package ua.university.simple.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.university.simple.dao.UniversityRepository;
import ua.university.simple.domain.TypeOfAccreditation;
import ua.university.simple.domain.University;
import ua.university.simple.service.UniversityService;

import java.util.List;

@Service
public class UniversityServiceImpl implements UniversityService {

    @Autowired
    private UniversityRepository repository;

    @Override
    public University create(University university) {
        return repository.save(university);
    }

    @Override
    public University update(University university) {
        return repository.save(university);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public University findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<University> findAll() {
        return repository.findAll();
    }

    @Override
    public List<University> findByTypeOfAccreditation(TypeOfAccreditation typeOfAccreditation) {
        return repository.findByTypeOfAccreditation(typeOfAccreditation);
    }
}

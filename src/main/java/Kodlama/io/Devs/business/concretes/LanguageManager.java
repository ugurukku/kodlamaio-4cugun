package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.concretes.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import Kodlama.io.Devs.entities.dtos.LanguageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {

    private final LanguageRepository repository;

    @Autowired
    public LanguageManager(LanguageRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return repository.getAll();
    }

    @Override
    public ProgrammingLanguage getLanguageById(int id) {
        return repository.getById(id);
    }

    @Override
    public boolean deleteLanguageById(int id) {
        return repository.deleteById(id);
    }

    @Override
    public boolean updateLanguage(ProgrammingLanguage language) {
        return repository.updateById(language);
    }

    @Override
    public boolean addLanguage(LanguageRequest language) {
        return repository.addLanguage(language);
    }
}

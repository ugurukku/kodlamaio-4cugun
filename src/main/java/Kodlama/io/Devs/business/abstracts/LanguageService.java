package Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import Kodlama.io.Devs.entities.dtos.LanguageRequest;

import java.util.List;

public interface LanguageService {

    List<ProgrammingLanguage> getAll();

    ProgrammingLanguage getLanguageById(int id);

    boolean deleteLanguageById(int id);

    boolean updateLanguage(ProgrammingLanguage language);

    boolean addLanguage(LanguageRequest language);

}


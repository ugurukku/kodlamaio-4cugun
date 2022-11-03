package Kodlama.io.Devs.dataAccess.abstracts;


import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import Kodlama.io.Devs.entities.dtos.LanguageRequest;

import java.util.List;

public interface ILanguageRepository{

    List<ProgrammingLanguage> getAll();

    ProgrammingLanguage getById(int id);

    boolean deleteById(int id);

    boolean updateById(ProgrammingLanguage language);

    boolean addLanguage(LanguageRequest language);

}

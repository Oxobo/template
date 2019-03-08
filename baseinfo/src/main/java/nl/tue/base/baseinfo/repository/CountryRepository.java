package nl.tue.base.baseinfo.repository;

import nl.tue.base.baseinfo.domain.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository  extends CrudRepository<Country,Long> {
    Country findByTitle(String title);
    Country findByEnglishTitle(String englishTitle);
    Country findByBriefTitle(String briefTitle);
}

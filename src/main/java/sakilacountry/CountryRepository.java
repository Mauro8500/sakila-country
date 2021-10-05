package sakilacountry;

import org.springframework.data.repository.PagingAndSortingRepository;

interface CountryRepository extends PagingAndSortingRepository<Country, Integer>{
    
}

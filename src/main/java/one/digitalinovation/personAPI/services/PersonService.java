package one.digitalinovation.personAPI.services;

import one.digitalinovation.personAPI.dto.mapper.PersonMapper;
import one.digitalinovation.personAPI.dto.request.PersonDTO;
import one.digitalinovation.personAPI.dto.response.MessageResponseDTO;
import one.digitalinovation.personAPI.entities.Person;
import one.digitalinovation.personAPI.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }

}

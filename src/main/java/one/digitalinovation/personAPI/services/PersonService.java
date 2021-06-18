package one.digitalinovation.personAPI.services;

import one.digitalinovation.personAPI.dto.mapper.PersonMapper;
import one.digitalinovation.personAPI.dto.request.PersonDTO;
import one.digitalinovation.personAPI.dto.response.MessageResponseDTO;
import one.digitalinovation.personAPI.entities.Person;
import one.digitalinovation.personAPI.exception.PersonNotFoundException;
import one.digitalinovation.personAPI.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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


    public List<PersonDTO> listAll(){

        List<Person> allPeople = personRepository.findAll();

        List<PersonDTO> allPeopleDTO = allPeople
                .stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());

        return allPeopleDTO;
    }

    public PersonDTO findById(Long id) throws PersonNotFoundException {
        Person person = personRepository
                .findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));

        return personMapper.toDTO(person);
    }
}

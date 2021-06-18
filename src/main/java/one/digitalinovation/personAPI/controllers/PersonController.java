package one.digitalinovation.personAPI.controllers;

import one.digitalinovation.personAPI.dto.request.PersonDTO;
import one.digitalinovation.personAPI.dto.response.MessageResponseDTO;
import one.digitalinovation.personAPI.entities.Person;
import one.digitalinovation.personAPI.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO) {
        return personService.createPerson(personDTO);
    }

}

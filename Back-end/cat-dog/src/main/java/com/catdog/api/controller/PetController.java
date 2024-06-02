package com.catdog.api.controller;

import com.catdog.api.entity.Pet;
import com.catdog.api.repository.PetRepository;
import com.catdog.api.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@RestController
public class PetController {

    private final PetService petService;
    @Autowired
    private PetRepository petRepository;
    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping("/GetPets")
    public List<Pet> getPets(){
        return petService.getPets();
    }
    @GetMapping("/GetPetsById/{id}")
    public Pet getPetsById(@PathVariable int id) {
        var petOptional = petRepository.findById(id);
        if (petOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return petOptional.get();
    }

    @PostMapping("/CreatePet")
    public String salvar(@RequestBody Pet pet){
        petRepository.save(pet);
        return "Pet Cadastrado com sucesso";
    }

    @DeleteMapping("/DeletePet/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public String excluirPetPorId(@PathVariable int id) {
        var petOptional = petRepository.findById(id);
        if (petOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        petRepository.delete(petOptional.get());
        return "Cliente excluido com sucesso!";
    }


}

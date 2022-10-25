package tech.devinhouse.m01s06ex0102.servlets.controllers;

import java.util.List;
@RestController
@RequestMapping(value = "pet")
public class PetControllers {
    @Autowired
    private PetService petService;

    @GetMapping
    public List<Pet> get() {
        return petService.findAll();
    }

    @PostMapping
    public Pet post(@RequestBody Pet pet) {
        return petService.save(pet);
    }

    @PutMapping
    public Pet put(@RequestBody Pet pet) {
        return petService.save(pet);
    }

    @DeleteMapping
    public boolean delete(Integer id) {
        return petService.delete(id);
    }

}

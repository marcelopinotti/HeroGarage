package marcelo.HeroGarage.Personagem;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonagemService {
    private PersonagemRepository personagemRepository;

    public PersonagemService(PersonagemRepository personagemRepository) {this.personagemRepository = personagemRepository;}

    public PersonagemModel criarPersonagem(PersonagemModel personagem){return personagemRepository.save(personagem);}


    public List<PersonagemModel> mostrarPersonagem(){
        return personagemRepository.findAll();
    }

    // listar por id
    public PersonagemModel mostrarPersonagemPorId(Long id){
        Optional<PersonagemModel> personagemID = personagemRepository.findById(id);
        return personagemID.orElse(null);
    }

    public void deletarPersonagem(Long id){
        personagemRepository.deleteById(id);
    }

}

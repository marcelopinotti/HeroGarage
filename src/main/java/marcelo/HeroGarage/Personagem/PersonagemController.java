package marcelo.HeroGarage.Personagem;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/personagem")
public class PersonagemController {
    private PersonagemService personagemService;

    public PersonagemController(PersonagemService personagemService) {this.personagemService = personagemService;}

    // Adicionar personagem
    @PostMapping("/adicionar")
    public PersonagemModel criarPersonagem(@RequestBody PersonagemModel personagem){
        return personagemService.criarPersonagem(personagem);
    }

    // Mostrar personagem por id
    @GetMapping("/listar/{id}")
    public PersonagemModel mostrarPersonagemPorId(@PathVariable Long id){return personagemService.mostrarPersonagemPorId(id);}

    // Listar todos os personagens
    @GetMapping("/listar")
    public List<PersonagemModel> mostrarPersonagem(){
        return personagemService.mostrarPersonagem();
    }

    //Atualizar personagem
    @PutMapping("/atualizarId")  //TODO: Atualizar para receber o id como parametro
    public String atualizarPersonagem(){
        return "Personagem atualizado com sucesso";
    }

    // Deletar personagem
    @DeleteMapping("/deletarID")
    public String deletarPersonagem(){
        return "Personagem deletado com sucesso";
    }

}


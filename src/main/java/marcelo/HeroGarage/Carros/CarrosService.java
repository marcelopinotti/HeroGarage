package marcelo.HeroGarage.Carros;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarrosService {

    private final CarrosRepository carrosRepository;

    public List<CarrosModel> mostrarCarros(){
        return carrosRepository.findAll();
    }
}

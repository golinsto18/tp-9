package Service.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvaliacaoService {
    private final AvaliacaoRepository avaliacaoRepository;

    @Autowired
    public AvaliacaoService(AvaliacaoRepository avaliacaoRepository) {
        this.avaliacaoRepository = avaliacaoRepository;
    }

}



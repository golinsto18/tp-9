package Repository;

import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {
    // Adicione métodos específicos se necessário
}


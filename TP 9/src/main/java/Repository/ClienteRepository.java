package Repository;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    // Adicione métodos específicos se necessário
}

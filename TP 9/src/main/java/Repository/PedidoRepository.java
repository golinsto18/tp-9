package Repository;

import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<Pedido, Long> {
    // Adicione métodos específicos se necessário
}
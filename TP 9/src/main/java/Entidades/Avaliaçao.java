package Entidades;

public class Avaliaçao {
    @Entity
    public static class AvaliacaoFeedback {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private int nota;
        private String comentario;
        private LocalDateTime dataAvaliacao;

        @ManyToOne
        @JoinColumn(name = "cliente_id")
        private Cliente cliente;

        @ManyToOne
        @JoinColumn(name = "pedido_id")
        private Pedido pedido;


    }
}

package br.com.alurafood.Pagamentos.repository;

import br.com.alurafood.Pagamentos.Model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}

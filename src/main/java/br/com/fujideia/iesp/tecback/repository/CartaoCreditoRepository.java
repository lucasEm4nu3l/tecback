package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.CartaoCredito;
import br.com.fujideia.iesp.tecback.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface CartaoCreditoRepository extends JpaRepository<CartaoCredito, Long> {

        List<Filme> findByNome(String nome);
}

package br.com.sergio.forum.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sergio.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	Page<Topico> findByCurso_Nome(String nomeCurso, Pageable paginacao);
	
	/* UMA FORMA DE COLOCAR O NOME QUE QUISER NA FUNÇÃO, POREM PRECISA PASSAR A QUERY DO JPQL
	 * @Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso") List<Topico>
	 * carregarPorNomeCurso(@Param("nomeCurso") String nomeCurso);
	 */
}

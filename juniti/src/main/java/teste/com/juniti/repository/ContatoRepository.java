package teste.com.juniti.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import teste.com.juniti.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> { 
	
}

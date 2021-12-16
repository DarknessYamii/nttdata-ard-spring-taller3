package com.nttdata.spring.persistence;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Repository of Client
 * @author DarknessYamii
 *
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

	public Client findByIdClient(Long idClient);
	
	public List<Client> findByName(String name);
	
	public List<Client> findByNameAndFirstNameAndSecondName(String name, String firstName, String secondName);
	
}

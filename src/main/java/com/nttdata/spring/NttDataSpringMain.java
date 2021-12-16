package com.nttdata.spring;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.persistence.Client;
import com.nttdata.spring.services.ClientManagementServiceI;
/**
 * Main Spring DATA
 */
@SpringBootApplication
public class NttDataSpringMain implements CommandLineRunner {

	@Autowired
	private ClientManagementServiceI clientService;
	
	public static void main(String[] args) {
		SpringApplication.run(NttDataSpringMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Client client1 = new Client();
		client1.setIdClient(1L);
		client1.setName("Andres");
		client1.setFirstName("Ruiz");
		client1.setSecondName("Delgado");
		client1.setDni("15456782T");
		client1.setBirthdate(new Date(2002,06,01));
		Client client2 = new Client();
		client2.setIdClient(2L);
		client2.setName("Maria Del Carmen");
		client2.setFirstName("Gonzalez");
		client2.setSecondName("Carranza");
		client2.setDni("15456782M");
		client2.setBirthdate(new Date(1999,01,29));
		Client client3 = new Client();
		client3.setIdClient(3L);
		client3.setName("Javier");
		client3.setFirstName("Campos");
		client3.setSecondName("Cuevas");
		client3.setDni("11223344T");
		client3.setBirthdate(new Date(2020,11,12));
		/* INSERTAMOS LOS CLIENTES EN LA BBDD */
		clientService.insertNewClient(client1);
		clientService.insertNewClient(client2);
		clientService.insertNewClient(client3);
		/* UPDATEAMOS LOS CLIENTES */
		clientService.updateClient(client1);
		clientService.updateClient(client2);
		clientService.updateClient(client3);
		/* CONSUMIMOS LOS METODOS */ 
		System.out.println("\n |------------- INICIO METODOS ---------------| \n ");
		
		System.out.println("\n |------------- BUSCAR POR NOMBRE COMPLETO ---------------| \n ");
		clientService.searchByFullName("Maria Del Carmen", "Gonzalez", "Carranza").forEach(System.out::println);
		System.out.println("\n |------------- BUSCAR POR ID ---------------| \n ");
		System.out.println(clientService.searchById(1L));
		System.out.println("\n |------------- BUSCAR POR NOMBRE ---------------| \n ");
		clientService.searchByName("Javier").forEach(System.out::println);
		System.out.println("\n |------------- BUSCAR TODO ---------------| \n ");
		clientService.searchAll().forEach(System.out::println);
		
		System.out.println("\n |------------- FIN METODOS ---------------| \n ");
	}

}

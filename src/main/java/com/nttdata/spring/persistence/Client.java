package com.nttdata.spring.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CLIENT TABLE
 * @author DarknessYamii
 *
 */

@Entity
@Table(name = "CLIENT")
public class Client implements Serializable{

	/* ATRIBUTOS */
	
	/* ID */
	private static final long serialVersionUID = 1L;
	
	private Long idClient;
	private String name, firstName, secondName, dni;
	private Date birthdate;
	/**
	 * @return the idClient
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getIdClient() {
		return idClient;
	}
	/**
	 * @param idClient the idClient to set
	 */
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	/**
	 * @return the name
	 */
	@Column(name = "NAME", nullable = false)
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dni
	 */
	@Column(name = "DNI", nullable = false, unique = true, length = 9)
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return the birthdate
	 */
	@Column(name = "BIRTHDATE", nullable = false)
	public Date getBirthdate() {
		return birthdate;
	}
	/**
	 * @param birthdate the birthdate to set
	 */
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	/**
	 * @return the firstName
	 */
	@Column(name = "FIRST_NAME", nullable = false)
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the secondName
	 */
	@Column(name = "SECOND_NAME", nullable = false)
	public String getSecondName() {
		return secondName;
	}
	/**
	 * @param secondName the secondName to set
	 */
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", name=" + name + ", firstName=" + firstName + ", secondName="
				+ secondName + ", dni=" + dni + ", birthdate=" + birthdate + "]";
	}



	
}

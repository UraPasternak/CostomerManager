package net.codejava.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private String name_n;
    private String email;
    private String address;
 
    protected Customer() {
    }
 
    protected Customer(String name_n, String email, String address) {
        this.name_n = name_n;
        this.email = email;
        this.address = address;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName_n() {
		return name_n;
	}

	public void setName_n(String name_n) {
		this.name_n = name_n;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
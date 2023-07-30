package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Passport;
import org.jsp.dto.Person;

public class Mypassport_dao{
	
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("PAS");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	// save =========
	
	public void savePerson(Person person ) {
		transaction.begin();
		manager.persist(person);
		transaction.commit();
		
	}
	
	public void savePassport(Passport passport ) {
		transaction.begin();
		manager.persist(passport);
		transaction.commit();
		
	}
	
	  //Update ========
	
	public void UpdatePerson(Person person ) {
		transaction.begin();
		manager.merge(person);
		transaction.commit();
		
	}
	
	public void UpdatePassport(Passport passport ) {
		transaction.begin();
		manager.merge(passport);
		transaction.commit();
		
	}
	
	  //Find with Id and Psno ========
	
	public void Findperson(int id) {
		Person person=manager.find(Person.class, id);
		transaction.commit();
	}
	
	public void FindPassport(long Psno) {
		Passport passport=manager.find(Passport.class, Psno);
		transaction.commit();
	}

	
	
}
package net.javaguides.hibernate.dao;

import java.util.List;

import javax.transaction.*;
import javax.transaction.Transaction;

import org.hibernate.*;
import net.javaguides.hibernate.model.Calibrateur;

import net.javaguides.hibernate.util.hibernateUtil;
public class Calibrateurdao  {
	
	
	
	
	public static void saveCalibrateur(Calibrateur calibrateur) throws IllegalStateException, SystemException  {
		Transaction transaction = null;
		try(Session session = hibernateUtil.getSessionFactory().openSession()){
			transaction =  (Transaction) session.beginTransaction();
			
			session.save(calibrateur);
			
			transaction.commit();
		}catch (Exception e) {
			if(transaction !=null)
			{
				transaction.rollback();
			}
		}
	}
	
	
	
	
	public void UpdateCalibrateur(Calibrateur calibrateur) throws IllegalStateException, SystemException  {
		Transaction transaction = null;
		try(Session session = hibernateUtil.getSessionFactory().openSession()){
			transaction =  (Transaction) session.beginTransaction();
			
			session.saveOrUpdate(calibrateur);
			
			transaction.commit();
		}catch (Exception e) {
			if(transaction !=null)
			{
				transaction.rollback();
			}
		}
	}
	
	public static Calibrateur getCalibrateurId(String désignation) throws IllegalStateException, SystemException  {
		Transaction transaction = null;
		Calibrateur calibrateur=null;
		try(Session session = hibernateUtil.getSessionFactory().openSession()){
			transaction =  (Transaction) session.beginTransaction();
			
			session.saveOrUpdate(calibrateur);
			
			calibrateur=session.get(Calibrateur.class, désignation);
			
			transaction.commit();
		}catch (Exception e) {
			if(transaction !=null)
			{
				transaction.rollback();
			}
		}
		return calibrateur;
	}

	@SuppressWarnings ("unchecked")

	public static List<Calibrateur> getAllCalibrateur() throws IllegalStateException, SystemException {

	Transaction transaction = null;

	List<Calibrateur> calibrateur = null;

	try(Session session = hibernateUtil.getSessionFactory().openSession()){
	// start the transaction

	transaction = (Transaction) session.beginTransaction();

	// get students

	calibrateur = session.createQuery("from Calibrateur").list();

	//student = session.load(Student.class, id);

	// commit the transaction

	transaction.commit();

	}catch (Exception e) {

	if(transaction  != null) {

	transaction.rollback();

	}

	}

	return calibrateur;
	}
	
	
	
	public void deleteCalibrateur(String désignation) throws IllegalStateException, SystemException {

		Transaction transaction = null;

		Calibrateur calibrateur = null;

		try(Session session = hibernateUtil.getSessionFactory().openSession()){
		// start the transaction

		transaction = (Transaction) session.beginTransaction();

		// get students

		calibrateur = session.get(Calibrateur.class,désignation);

		//student = session.load(Student.class, id);

		// commit the transaction

		transaction.commit();

		}catch (Exception e) {

		if(transaction  != null) {

		transaction.rollback();

		}

		}

		
	}
	
	
}

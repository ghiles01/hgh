package net.javaguides.hibernate;

import net.javaguides.hibernate.model.Calibrateur;

import java.util.List;

import javax.transaction.SystemException;

import net.javaguides.hibernate.dao.*;

public class App {

	public static void main(String[] args) throws IllegalStateException, SystemException  {
	    // Création d'une instance de CalibrateurDao
	    Calibrateurdao calibrateurdao = new Calibrateurdao();

	    // Création d'une instance de Calibrateur
	    Calibrateur calibrateur = new Calibrateur("toto", "fg", "ty", "tyyyy", "yaw", "erty", "redf");

	    // Attribution manuelle de la valeur de la clé primaire
	     // Remplacez 1L par l'ID souhaité

	    // Sauvegarde de l'entité Calibrateur
	    try {
			calibrateurdao.saveCalibrateur(calibrateur);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    // Test de getCalibrateurById.
	    Calibrateur calibrateur2 = calibrateurdao.getCalibrateurId(calibrateur.getDésignation());

	    // Test de getAllCalibrateurs
	    List<Calibrateur> calibrateurs = null;
		try {
			calibrateurs = calibrateurdao.getAllCalibrateur();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    // Vérifiez si calibrateurs est null avant d'itérer
	    if (calibrateurs != null) {
	        calibrateurs.forEach(c -> System.out.println(c.getDésignation() + ": " + c.getDésignation()));
	    } else {
	        System.out.println("Aucun calibrateur trouvé.");
	    }

	    // Test de deleteCalibrateur
	    try {
			calibrateurdao.deleteCalibrateur(calibrateur.getDésignation());
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}

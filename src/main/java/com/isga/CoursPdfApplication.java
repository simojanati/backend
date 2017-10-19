package com.isga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.isga.model.Cours;
import com.isga.model.Filiere;
import com.isga.model.Matiere;
import com.isga.model.Responsable;
import com.isga.model.User;
import com.isga.service.ICoursService;
import com.isga.service.IFiliereService;
import com.isga.service.IMatiereService;
import com.isga.service.IResponsableService;
import com.isga.service.IUserService;

@SpringBootApplication
public class CoursPdfApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CoursPdfApplication.class, args);
	}

	@Autowired
	private IUserService userService;

	@Autowired
	private IResponsableService responsableService;

	@Autowired
	private ICoursService coursService;

	@Autowired
	private IFiliereService filiereService;

	@Autowired
	private IMatiereService matiereService;

	@Override
	public void run(String... arg0) throws Exception {

		userService.addUser(new User("Nabil Bartout", "nabil@gmail.com", "nbartout", "123456", "Admin"));
		userService.addUser(new User("Etudiants isga", "isga@gmail.com", "isga", "111111", "Etudiant"));

		responsableService.addResponsable(new Responsable("simojanati92@gmail.com"));

		Filiere filiere1 = filiereService.addFiliere(new Filiere("Ingénierie", "fa-desktop","../../assets/cours/Ingenierie_logo.png"));
		Filiere filiere2 = filiereService.addFiliere(new Filiere("Management", "fa-university","../../assets/cours/management_logo.png"));

		Matiere matiere1 = matiereService.addMatiere(new Matiere("Programmation", filiere1));
		Matiere matiere2 = matiereService.addMatiere(new Matiere("Conception", filiere1));
		Matiere matiere3 = matiereService.addMatiere(new Matiere("Finance", filiere2));
		Matiere matiere4 = matiereService.addMatiere(new Matiere("Marketing", filiere2));

		coursService.addCour(new Cours("Java", "../../assets/cours/java.jpg",
				"../../assets/pdf/Sommaire.pdf", matiere1));
		coursService.addCour(new Cours("Uml", "../../assets/cours/uml.jpg",
				"../../assets/pdf/Sommaire.pdf", matiere2));
		coursService.addCour(new Cours("cour finance", "../../assets/cours/java.jpg",
				"../../assets/pdf/Sommaire.pdf", matiere3));
		coursService.addCour(new Cours("cour marketing", "../../assets/cours/java.jpg",
				"../../assets/pdf/Sommaire.pdf", matiere4));

	}
}

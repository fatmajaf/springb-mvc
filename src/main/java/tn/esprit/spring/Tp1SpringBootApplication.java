package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication

public class Tp1SpringBootApplication {

	
	public static void main(String[] args) {
	 SpringApplication.run(Tp1SpringBootApplication.class, args);
		
	}
	/*
	 * 
	 * @SpringBootApplication
public class SpringBootDataJpaApplication {
private static IUserControl userControl;
public static void main(String[] args) {
//Charger la configuration
ApplicationContext applicationContext =
SpringApplication.run(SpringBootDataJpaApplication.class, args);
//Instantiation du controleur par le container
userControl = (IUserControl)applicationContext.getBean("userControlImpl");
userControl.getAllUsers();
//Ajouter la modification et la suppression TODO
}
}
	 * */

}

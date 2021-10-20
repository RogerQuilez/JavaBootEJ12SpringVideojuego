package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import videojuego.personaje.Combat;
import videojuego.personaje.Personaje;

public class TestGame {
	
	public static ApplicationContext context = null;
	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Personaje gandalf = context.getBean("gandalf", Personaje.class);
		
		Personaje aragorn = context.getBean("aragorn", Personaje.class);
		
		Combat batalla = context.getBean("batalla", Combat.class);
		
		System.out.println(batalla.startCombat(gandalf, aragorn));
		
	}

}

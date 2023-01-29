package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*Quando usamos essa notação podemos colocar na classe main o comando
SpringApplicatin.run("Classe que inicializa o programa.class",args);*/
@SpringBootApplication
public class VendasApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(VendasApplication.class, args);
	}

}

package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*Quando usamos essa notação podemos colocar na classe main o comando
SpringApplicatin.run("Classe que inicializa o programa.class",args);*/
@SpringBootApplication
/*
 * @RestController simplesmente retorna o objeto e os dados do objeto são
 * gravados diretamente na resposta HTTP como JSON ou XML.
 */
@RestController
public class VendasApplication {
	
	/*O @Autowired permite que o próprio Spring gerencie os objetos instanciados de outras
	 * para serem utilizados na classe em questão
	 */
	@Autowired
	/*Utilizamos o @Qualifier para chamar o bean em outras classes. */
	@Qualifier("nomedaAplicacao")
	private String apresentarTela;
	 
	/*Faz o mapeamento de uma chamada indicando o caminho a função "GET"*/
	@GetMapping("/hello")
	public String helloWorld() {
		return apresentarTela;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(VendasApplication.class, args);
	}

}

package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
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
	
	/*Com o @Value podemos puxar inforçoes direto do properties utilizando chave/valor*/
	@Value("${application.name}")
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

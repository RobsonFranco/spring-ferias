package application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*Uma notação que define uma classe com todas as configurações que queremos incluir
 *  e que serão utilizadas no projeto. Apenas configurações vão em uma classe com esta notação,
 *   não podendo conter métodos essenciais ao código, aqui vão configurações de rede e outras
 *    coisas. */
@Configuration
public class MinhasConfiguracoes {
	
	
	/*A notação @Bean trabalha em conjunto com a @Configuration na classe especifica para configurações. 
O Bean sugere nomes melhores para que a configuração feita seja utilizada e outras classes.
Neste caso estamos chamando em algum lugar o conteudo desse metodo "applicationName" porém, pelo nome "nomedaAplicacao"*/
	@Bean(name = "nomedaAplicacao")
	public String applicationName() {
		return "Treino de Férias";
	}
}

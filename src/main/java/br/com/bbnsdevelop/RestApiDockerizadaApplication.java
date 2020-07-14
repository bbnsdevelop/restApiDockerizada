package br.com.bbnsdevelop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import br.com.bbnsdevelop.config.FileStorageConfig;

@SpringBootApplication
@EnableConfigurationProperties({
	FileStorageConfig.class
})
@EnableAutoConfiguration
@ComponentScan
public class RestApiDockerizadaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiDockerizadaApplication.class, args);
	}

}

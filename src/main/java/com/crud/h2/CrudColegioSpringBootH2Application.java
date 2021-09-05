package com.crud.h2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudColegioSpringBootH2Application implements CommandLineRunner {

	@Autowired
	//private JdbcTemplate template;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudColegioSpringBootH2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		template.execute("DROP TABLE COLEGIO IF EXISTS");
//		template.execute("CREATE TABLE COLEGIO(id INTEGER(11) PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), cursos VARCHAR(255))");
//		
//		template.update("insert into colegio(name)values('colegio del olimpo')");
		
	}

}

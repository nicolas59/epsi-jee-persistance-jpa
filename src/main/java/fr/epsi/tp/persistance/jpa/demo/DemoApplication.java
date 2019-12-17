package fr.epsi.tp.persistance.jpa.demo;

import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

  @Autowired
  private EntityManagerFactory emf;
  
  @Transactional
  public void run(String... args) throws Exception {

    // A compléter
    
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

}

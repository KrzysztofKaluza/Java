package com.krzysztof.accessingdatawithjpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class AccessingDataWithJPA {

    private static final Logger log = LoggerFactory.getLogger(AccessingDataWithJPA.class);

    public static void main(String[] args){
        SpringApplication.run(AccessingDataWithJPA.class, args);
    }

    @Bean
    public CommandLineRunner demo(CustomerRepository repository){
        return(args) -> {
            //some new customers
            repository.save(new Customer("Jack", "Bauer"));
            repository.save(new Customer("Chloe", "O'Brian"));
            repository.save(new Customer("Kim", "Bauer"));
            repository.save(new Customer("Dawid", "Palmer"));
            repository.save(new Customer("Michelle", "Dessler"));

            //fetching customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Customer customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            Customer customer = repository.findById(1L); //1L - 1 long
            log.info("Customer found with findById(1L):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");

            log.info("Customer found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            repository.findByLastName("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });

            log.info("");
        };
    }
}

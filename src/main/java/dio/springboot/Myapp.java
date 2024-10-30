package dio.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Myapp implements CommandLineRunner {

    private  Calculadora calculadora;
    
    public Myapp(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("O resultado da soma é: " + calculadora.somar(2, 3));
         System.out.println("Esse projetotem o objetivo de demonstrar os conceitos de Spring Boot e seu uso dentro do ambiente de uma aplicação Java.");
    }
}

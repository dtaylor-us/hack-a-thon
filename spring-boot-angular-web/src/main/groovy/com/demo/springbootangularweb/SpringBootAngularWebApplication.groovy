package com.demo.springbootangularweb

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SpringBootAngularWebApplication {

    static void main(String[] args) {
        SpringApplication.run(SpringBootAngularWebApplication.class, args)
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        def nameList = ["John", "Julie", "Jennifer", "Helen", "Rachel"]
        return { args ->
            nameList.forEach { name ->
                User user = new User(name, name.toLowerCase() + "@domain.com")
                userRepository.save(user)
            }
            userRepository.findAll().forEach { System.out.println(it) }
        }
    }

}

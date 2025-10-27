package br.senac.tads.dsw.crudclienteprodutobackend.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenAPIConfiguration {

    @Bean
    public OpenAPI defineOpenAPI() {
        Server server = new Server();
        server.setUrl("http://localhost:8080");
        server.setDescription("Desenvolvimento");

        Contact contact = new Contact();
        contact.setName("João Cláudio");
        contact.setEmail("joaocontatos56@gmail.com");

        Info information = new Info();
        information.title("Sistema de Gerenciamento - Ecommerce");
        information.version("1.0");
        information.description("Essa API expoe endpoints para gerenciar clientes e produtos.");
        information.contact(contact);

        return new OpenAPI().info(information).servers(List.of(server));
    }
}

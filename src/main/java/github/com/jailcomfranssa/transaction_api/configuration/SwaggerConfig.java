package github.com.jailcomfranssa.transaction_api.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "API TRANSACTION",
                description = "API DE TRANSACTION DOCUMENTAÇÃO",
                termsOfService = "www.jf-programa.com",
                version = "1.0.0",
                contact = @Contact(
                        name = "Jailson S. França",
                        url = "www.jf-programa.com/contact",
                        email = "jailson.franca@dce.ufpb.br"
                ),
                license = @License(
                        name = "Software Livre de Licenciamento",
                        url = "www.jf-programa.com/licence",
                        identifier = "123.768.569.159"
                )


        ),
        servers = {
                @Server(
                        description = "DEV SERVER",
                        url = "http://localhost:8080"
                )

        }

)
public class SwaggerConfig {
}



































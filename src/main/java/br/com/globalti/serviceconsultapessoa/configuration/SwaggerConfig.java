package br.com.globalti.serviceconsultapessoa.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.globalti.servicecep.api"))
                .build()
                .apiInfo(this.informacoesApi().build());
    }

    private ApiInfoBuilder informacoesApi() {
        return new ApiInfoBuilder()
                .title("Busca Endereço")
                .description("\"Consulta de endereços por CEP\"")
                .version("1.0.0")
                .contact(this.contato());
    }

    private Contact contato() {

        return new Contact(
                "Kleber Nunes Inacio",
                "",
                "klebernunes182@gmail.com");
    }
}
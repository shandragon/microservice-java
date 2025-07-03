package br.edu.cerqueira.adailton.microservices.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	@Value("${USER_API_URL:http://localhost:8081}")
	private String userApiURL;

	@Value("${CARD_API_URL:http://localhost:8082}")
	private String cardApiURL;

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("user_route", r -> r.path("/user/**")
						.uri(userApiURL))
				.route("card_route", r -> r.path("/card/**")
						.uri(cardApiURL))
				.route("category_route", r -> r.path("/category/**")
						.uri(cardApiURL))
				.build();

	}
}

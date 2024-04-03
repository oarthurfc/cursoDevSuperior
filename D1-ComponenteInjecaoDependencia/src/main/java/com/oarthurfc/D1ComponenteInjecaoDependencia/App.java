package com.oarthurfc.D1ComponenteInjecaoDependencia;

import com.oarthurfc.D1ComponenteInjecaoDependencia.entities.Order;
import com.oarthurfc.D1ComponenteInjecaoDependencia.services.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.oarthurfc"})
public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US); // Define o local para aceitar ponto como separador decimal

		int code;
		double basic;
		double discount;

		SpringApplication.run(App.class, args);
		System.out.println("Digite o código do produto: ");
		code = scanner.nextInt();

		System.out.println("Digite o preço base: ");
		basic = scanner.nextDouble();

		System.out.println("Digite o desconto aplicado: ");
		discount = scanner.nextDouble();

		Order order = new Order(code, basic, discount);
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: " + String.format("R$%.2f", OrderService.total(order)));
		scanner.close();

	}

}

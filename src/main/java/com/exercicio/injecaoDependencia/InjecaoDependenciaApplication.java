package com.exercicio.injecaoDependencia;

import com.exercicio.injecaoDependencia.entities.Order;
import com.exercicio.injecaoDependencia.services.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class InjecaoDependenciaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InjecaoDependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int orderCode = sc.nextInt();
		double basic = sc.nextDouble();
		double discount = sc.nextDouble();

		Order order = new Order(orderCode, basic, discount);

		ShippingService shippingService = new ShippingService();

		System.out.println("Pedido código " + orderCode);
		System.out.printf("Valor total: R$ %.2f%n", shippingService.shipment(order));

		sc.close();
	}
}

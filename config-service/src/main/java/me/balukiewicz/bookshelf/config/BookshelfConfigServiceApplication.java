package me.balukiewicz.bookshelf.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BookshelfConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookshelfConfigServiceApplication.class, args);
	}
}

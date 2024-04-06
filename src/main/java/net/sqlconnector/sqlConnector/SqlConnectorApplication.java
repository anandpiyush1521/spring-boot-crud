package net.sqlconnector.sqlConnector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SqlConnectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqlConnectorApplication.class, args);
	}

}

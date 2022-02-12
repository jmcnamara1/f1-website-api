package com.joel.f1websiteapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

//Added exclusions to avoid data source start up error:
//   Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.
@SpringBootApplication(exclude = {
		DataSourceAutoConfiguration.class,
		DataSourceTransactionManagerAutoConfiguration.class,
		HibernateJpaAutoConfiguration.class
})public class F1WebsiteApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(F1WebsiteApiApplication.class, args);
	}

}

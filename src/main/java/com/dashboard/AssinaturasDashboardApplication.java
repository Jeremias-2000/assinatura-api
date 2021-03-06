package com.dashboard;

import com.dashboard.document.Assinatura;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableSpringDataWebSupport
@EnableMongoAuditing
@SpringBootApplication
public class AssinaturasDashboardApplication {


	public static void main(String[] args) {
		SpringApplication.run(AssinaturasDashboardApplication.class, args);
	}

}

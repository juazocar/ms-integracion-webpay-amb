package cl.duoc.msintegracionwebpayamb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsIntegracionWebpayAmbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsIntegracionWebpayAmbApplication.class, args);
	}

}

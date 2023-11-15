package mariangelamarasciuolo.s7d3;

import mariangelamarasciuolo.s7d3.adapter.Info;
import mariangelamarasciuolo.s7d3.adapter.InfoAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class S7d3Application {

	public static void main(String[] args) {
		SpringApplication.run(S7d3Application.class, args);

		Info info = new Info("Aldo", "Baglio", LocalDate.of(1958, 9, 28));
		InfoAdapter adapter = new InfoAdapter(info);
		System.out.println(adapter.getNomeCompleto());
		System.out.println((adapter.getEta()));
	}



}

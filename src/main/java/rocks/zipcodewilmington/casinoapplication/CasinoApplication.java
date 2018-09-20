package rocks.zipcodewilmington.casinoapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import rocks.zipcodewilmington.casinoapplication.model.CasinoProfile;
import rocks.zipcodewilmington.casinoapplication.services.CasinoProfileService;

/**
 * @author leon on 9/9/18.
 */
@SpringBootApplication
public class CasinoApplication {
    @Autowired
    private CasinoProfileService service;

    public static void main(String[] args) {
        SpringApplication.run(CasinoApplication.class, args);
    }


    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }


    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) {
        return args -> {
            String[] names = {"Leon", "Wilhem", "Domi"};
            for (Integer i = 0; i < names.length;) {
                String profileName = names[i++];
                CasinoProfile cp = new CasinoProfile(i.longValue(), profileName, 0.0);
                service.createProfile(cp);
            }
        };
    }
}
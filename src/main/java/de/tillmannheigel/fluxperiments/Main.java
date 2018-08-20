package de.tillmannheigel.fluxperiments;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
	// write your code here
        Mono.just(1);
    }
}

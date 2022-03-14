package br.com.italo.greetingservice.web;

import java.util.concurrent.atomic.AtomicLong;

import br.com.italo.greetingservice.config.GreetingConfiguration;
import br.com.italo.greetingservice.entity.Greeting;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GreetingController {

    private static final String template = "%s, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final GreetingConfiguration configuration;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "") String name) {
        if (name.isEmpty()) name = configuration.getDefaultValue();
        return new Greeting(
                counter.incrementAndGet(),
                String.format(template, configuration.getGreeting(), name)
        );
    }
}

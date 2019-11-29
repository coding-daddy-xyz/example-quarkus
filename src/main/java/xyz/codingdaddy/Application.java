package xyz.codingdaddy;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class Application {

    void onStart(@Observes StartupEvent startupEvent) {
        System.out.println("The application is starting . . .");
    }

    void onStop(@Observes ShutdownEvent shutdownEvent) {
        System.out.println("The application is stopping . . .");
    }
}

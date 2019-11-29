package xyz.codingdaddy;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class ApplicationContextListener {

    private static final Logger LOG = LoggerFactory.getLogger(ApplicationContextListener.class.getSimpleName());

    void onStart(@Observes StartupEvent startupEvent) {
        LOG.info("The application is starting . . .");
    }

    void onStop(@Observes ShutdownEvent shutdownEvent) {
        LOG.info("The application is stopping . . .");
    }
}

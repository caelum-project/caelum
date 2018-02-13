package com.forrent.caelum.runtime;

import com.forrent.caelum.runtime.lifecycle.Startable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CaelumContainer implements Startable {

    protected static final Logger logger = LoggerFactory.getLogger(CaelumContainer.class);
    
    private final ApplicationContext applicationContext;

    public CaelumContainer(String[] args) {
        applicationContext = createApplicationContext();
    }

    public void start() throws CaelumException {
        
    }

    protected ApplicationContext createApplicationContext() {
        return new AnnotationConfigApplicationContext(CaelumContainer.class);
    }

    public static void main(String[] args) {
        final CaelumContainer container = new CaelumContainer(args);

        try {

            container.start();
        } catch (CaelumException e) {
            logger.error("An error occurred starting the container.", e);
        }
    }
}

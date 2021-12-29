package com.example.app;

import io.smallrye.reactive.messaging.kafka.Record;
import io.vertx.core.json.JsonObject;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.io.IOException;
import java.time.temporal.ChronoUnit;

@ApplicationScoped
public class ProcessStatusProcessor {

    @Inject
    Logger log;

    @Incoming("process-status-in")
    @Retry(delay = 10, delayUnit = ChronoUnit.SECONDS, maxRetries = 5)
    public void process(Record<String, JsonObject> record) throws IOException {
        log.info(record.value());
    }
}
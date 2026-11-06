package com.aggxb.real.config;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.instrumentation.logback.appender.v1_0.OpenTelemetryAppender;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InstallOpenTelemetryAppender implements InitializingBean {

    private final OpenTelemetry openTelemetryAppender;

    @Override
    public void afterPropertiesSet() throws Exception {
        OpenTelemetryAppender.install(openTelemetryAppender);
    }
}

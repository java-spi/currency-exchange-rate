open module currency.exchange.rate.api {

    exports spi.currency.rate.domain.model;
    exports spi.currency.rate.service.api;

    requires transitive java.annotation;
    requires transitive lombok;
    requires transitive org.slf4j;
    requires transitive logback.classic;
    requires transitive logback.core;
    requires transitive com.google.common;
}
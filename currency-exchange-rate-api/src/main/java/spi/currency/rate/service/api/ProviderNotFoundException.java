//: spi.currency.rate.service.api.ProviderNotFoundException


package spi.currency.rate.service.api;


public class ProviderNotFoundException extends RuntimeException {

    public ProviderNotFoundException() {
        super();
    }

    public ProviderNotFoundException(String message) {
        super(message);
    }

}///:~
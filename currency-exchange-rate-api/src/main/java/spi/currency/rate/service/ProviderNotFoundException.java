//: spi.currency.rate.service.ProviderNotFoundException


package spi.currency.rate.service;


public class ProviderNotFoundException extends RuntimeException {

    public ProviderNotFoundException() {
        super();
    }

    public ProviderNotFoundException(String message) {
        super(message);
    }

}///:~
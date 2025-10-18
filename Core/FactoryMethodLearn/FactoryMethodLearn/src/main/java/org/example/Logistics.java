package org.example;

public abstract class Logistics {
    public void doLogistics() {
        Transport transport = createTransport();
        transport.deliver();
    }
    public abstract Transport createTransport();
}

package com.example.consomi.enumerated;

public enum MeansOfTransportDelivery {
    Motorcycle("Motorcycle"),
    Car("Car"),
    Truck("Truck");

    private final String meansOfTransport;
    MeansOfTransportDelivery(String meansOfTransport){
        this.meansOfTransport=meansOfTransport;
    }

    public String getMeansOfTransport() {
        return this.meansOfTransport;
    }
}

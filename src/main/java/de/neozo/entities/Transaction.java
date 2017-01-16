package de.neozo.entities;


import java.time.Instant;

public class Transaction {

    private byte[] hash;
    private String text;
    private Address sender;
    private byte[] signature;
    private Instant timestamp;

}
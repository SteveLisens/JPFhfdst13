package be.vdab.util;

public class isbn13Exception extends RuntimeException {
    public isbn13Exception() {}
    public isbn13Exception(String omschrijving) {
        super(omschrijving);
    }
}

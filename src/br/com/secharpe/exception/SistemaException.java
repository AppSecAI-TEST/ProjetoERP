package br.com.secharpe.exception;

public class SistemaException extends Exception {
    private static final long serialVersionUID = 1L;

    public SistemaException() {
    }

    public SistemaException(String message) {
        super(message);
    }
}

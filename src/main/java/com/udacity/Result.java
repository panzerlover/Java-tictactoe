package com.udacity;

public enum Result {
    X_WINS(".*x{3}.*|(.x. .x. .x. )|(..x ..x ..x )|(x.. x.. x.. )|(x.. .x. ..x )|(..x .x. x.. )"),
    O_WINS(".*o{3}.*|(.o. .o. .o. )|(..o ..o ..o )|(o.. o.. o.. )|(o.. .o. ..o)|(..o .o. o..)"),
    TIE("[^-]{12}"),
    NONE("");

    final String regex;
    Result (String regex){
        this.regex = regex;
    }
    public boolean equalsIgnoreCase(String message){
        return (String.valueOf(this).equals(message));
    }
}

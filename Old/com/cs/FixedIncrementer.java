package com.cs;

/**
* An Incrementable that allows incrementing by a specified integer value.
*/
public class FixedIncrementer implements Incrementable {

    private int value;
    private int incrementSize;

    /**
     * Creates a new {@code FixedIncrementer} with a specified
     * incrementSize and zero as the default start value.
     */
    public FixedIncrementer(int incrementSize) {
        this(incrementSize, 0);
    }

    /**
     * Creates a new {@code FixedIncrementer} with a specified
     * incrementSize and a start value.
     */
    public FixedIncrementer(int incrementSize, int value) {
        this.incrementSize = incrementSize;
        this.value = value;
    }


    /**
     * Returns the current value without incrementing.
     * 
     * @return The incrementer's current value
     */
    @Override
    public int getValue() {
       return value; 
    }

    /**
     * Increments the integer value by incrementSize.
     * 
     * @return The new integer value after incrementing.
     */
    @Override
    public int increment() {
        this.value += incrementSize;
        return getValue();
    }
}


package com.cs;

/**
* Defines interface for incrementing integer values.
*/
public interface Incrementable {
    /**
     * Returns the current value without incrementing.
     * 
     * @return The incrementer's current value
     */
    public int getValue();

    /**
     * Increments the integer value by one.
     * 
     * @return The new integer value after incrementing.
     */
    public int increment();
}
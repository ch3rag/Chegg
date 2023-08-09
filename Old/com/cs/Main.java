package com.cs;

public class Main {
    public static void main(String[] args) {
        FixedIncrementer fixedIncrementer = new FixedIncrementer(5);
        AlexaInspectionDeviceSelector selector = new AlexaInspectionDeviceSelector(fixedIncrementer);
        System.out.println(selector.getSampleDevicePosition());
        System.out.println(selector.getSampleDevicePosition());
    }
}

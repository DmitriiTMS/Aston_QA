package com.chunosov.task_2;

public interface GeometricActions {
    double calculateArea();

    default double calculatePerimeter() {
        return 0.0;
    }

    void setFillColor(String fillColor);

    void setBorderColor(String borderColor);

    void printInfo();
}

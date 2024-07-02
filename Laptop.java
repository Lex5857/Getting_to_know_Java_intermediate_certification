package GettingToKnowTheBasicApiJava.Seminar.Lesson6.Homework;

import java.util.Objects;

import GettingToKnowTheBasicApiJava.Seminar.Lesson6.Homework.Laptop;

public class Laptop {
    private int ramMemorySize;
    private int hardDriveSize;
    private String operatingSystem;
    private String color;

    public Laptop(int ramMemorySize, int hardDriveSize, String operatingSystem, String color) {
        this.ramMemorySize = ramMemorySize;
        this.hardDriveSize = hardDriveSize;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public int getRamMemorySize() {
        return ramMemorySize;
    }

    public int getHardDriveSize() {
        return hardDriveSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void setRamMemorySize(int ramMemorySize) {
        this.ramMemorySize = ramMemorySize;
    }

    public void setHardDriveSize(int hardDriveSize) {
        this.hardDriveSize = hardDriveSize;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String result = "Объем оперативной памяти: " + ramMemorySize + " ГБ" + System.lineSeparator()
                + "Объем жесткого диска: " + hardDriveSize + " ГБ" + System.lineSeparator()
                + "Операционная система: " + operatingSystem + System.lineSeparator()
                + "Цвет: " + color;

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Laptop laptop = (Laptop) obj;
        return ramMemorySize == laptop.ramMemorySize && hardDriveSize == laptop.hardDriveSize
                && operatingSystem.equals(laptop.operatingSystem) && color.equals(laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ramMemorySize, hardDriveSize, operatingSystem, color);
    }

}

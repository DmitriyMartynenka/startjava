package com.startjava.lesson_2_3.robot;

public class Jaeger {

    private String modelName;
    private int mark;
    private float weight;
    private float height;
    private String dateLaunch;
    private String status;
    static int murder = 0;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getDateLaunch() {
        return dateLaunch;
    }

    public void setDateLaunch(String dateLaunch) {
        this.dateLaunch = dateLaunch;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void move() {
        System.out.println(modelName + " moving");
    }

    public void drift() {
        System.out.println(modelName + " drift");
    }

    public void useCannon() {
        System.out.println(modelName + ": cannon activated");
    }

    public void kill() {
        murder++;
        System.out.println(modelName + " kill kaiju");
        System.out.println("Total killed: " + murder);
    }
}

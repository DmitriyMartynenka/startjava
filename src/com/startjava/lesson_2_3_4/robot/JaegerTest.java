package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        Jaeger jaeger2 = new Jaeger();
        jaeger1.setModelName("Gipsy Avenger");
        jaeger1.setMark(6);
        jaeger1.setDateLaunch("12.01.2034");
        jaeger1.setStatus("Active");
        jaeger1.setHeight(81.77f);
        jaeger1.setWeight(2.004f);
        jaeger2.setModelName("Striker Eureka");
        jaeger2.setMark(5);
        jaeger2.setDateLaunch("02.11.2019");
        jaeger2.setStatus("Active");
        jaeger2.setHeight(76.2f);
        jaeger2.setWeight(1.850f);
        System.out.println(jaeger1.getModelName());
        System.out.println(jaeger1.getStatus());
        System.out.println(jaeger2.getModelName());
        System.out.println(jaeger2.getStatus());
        jaeger1.drift();
        jaeger2.drift();
        jaeger1.useCannon();
        for (int i = 0; i < 5; i++) {
            jaeger1.kill();
        }
        jaeger2.useCannon();
        jaeger2.kill();
        jaeger1.setStatus("Destroyed");
        jaeger2.setStatus("Destroyed");
        System.out.println(jaeger1.getModelName() + " " + jaeger1.getStatus());
        System.out.println(jaeger2.getModelName() + " " + jaeger2.getStatus());
    }
}

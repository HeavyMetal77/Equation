package ua.tarastom.entity;

import javax.persistence.*;

@Entity
@Table(name = "equation")
public class EquationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "a")
    private int a;

    @Column(name = "b")
    private int b;

    @Column(name = "c")
    private int c;

    @Column(name = "x1")
    private double x1;

    @Column(name = "x2")
    private double x2;

    public EquationModel() {
    }

    public EquationModel(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    @Override
    public String toString() {
        return "EquationModel{" +
                "id=" + id +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", x1=" + x1 +
                ", x2=" + x2 +
                '}';
    }
}


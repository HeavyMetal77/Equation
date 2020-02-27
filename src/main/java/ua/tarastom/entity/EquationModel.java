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
    private Double a;

    @Column(name = "b")
    private Double b;

    @Column(name = "c")
    private Double c;

    @Column(name = "x1")
    private Double x1;

    @Column(name = "x2")
    private Double x2;

    public EquationModel() {
    }

    public EquationModel(double a, double b, double c) {
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

    public Double getA() {
        if (a == null) {
            return 0.0;
        }
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        if (b == null) {
            return 0.0;
        }
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        if (c == null) {
            return 0.0;
        }
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Double getX1() {
        return x1;
    }

    public void setX1(Double x1) {
        this.x1 = x1;
    }

    public Double getX2() {
        return x2;
    }

    public void setX2(Double x2) {
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


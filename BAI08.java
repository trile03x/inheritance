/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI08;

import java.util.*;

abstract class Number {

    int a;
    int b;

    Number() {

    }

    public Number(int a, int b) {
        this.a = a;
        this.b = b;
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

    public abstract void Add(Number x);

    public abstract void Subtract(Number x);

    public abstract void Multiply(Number x);

    public abstract void Divide(Number x);
}

class Complex extends Number {

    Complex() {

    }

    public Complex(int a, int b) {
        super(a, b);
    }

    @Override
    public void Add(Number x) {
        Number Cc = new Complex();
        Cc.a = a + x.a;
        Cc.b = b + x.b;
        System.out.println("- Ket qua cong 2 so phuc : " + Cc.a + " + " + Cc.b + "i");
    }

    @Override
    public void Subtract(Number x) {
        Number Ct = new Complex();
        Ct.a = a - x.a;
        Ct.b = b - x.b;
        System.out.println("- Ket qua tru 2 so phuc : " + Ct.a + " + " + Ct.b + "i");
    }

    @Override
    public void Multiply(Number x) {
        Number Cn = new Complex();
        Cn.a = a * x.a - b * x.b;
        Cn.b = a * x.b + x.a * b;
        System.out.println("- Ket qua nhan 2 so phuc : " + Cn.a + " + " + Cn.b + "i");
    }

    @Override
    public void Divide(Number x) {
        Number Cchia = new Complex();
        Cchia.a = (int) ((a * x.a + b * x.b) / (Math.pow(x.a, 2) + Math.pow(x.b, 2)));
        Cchia.b = (int) ((x.a * b - a * x.b) / (Math.pow(x.a, 2) + Math.pow(x.b, 2)));
        System.out.println("- Ket qua chia 2 so phuc : " + Cchia.a + " + " + Cchia.b + "i");
    }

}

class Fraction extends Number {

    public Fraction() {
    }

    public Fraction(int a, int b) {
        super(a, b);
    }

    int UCLN(int t, int m) {
        if (t == 0 || m == 0) {
            return t + m;
        }
        while (t != m) {
            if (t > m) {
                t -= m; // a = a - b
            } else {
                m -= t;
            }
        }
        return t;
    }

    @Override
    public void Add(Number x) {
        Number fCong = new Fraction();
        int t = a * x.b + x.a * b;
        int m = b * x.b;
        fCong.a = t / UCLN(t, m);
        fCong.b = m / UCLN(t, m);
        System.out.println("- Tong 2 phan so = " + fCong.a + "/" + fCong.b);
    }

    @Override
    public void Subtract(Number x) {
        Number fTru = new Fraction();
        int t = a * x.b - x.a * b;
        int m = b * x.b;
        fTru.a = t / UCLN(t, m);
        fTru.b = m / UCLN(t, m);
        System.out.println("- Tru 2 phan so = " + fTru.a + "/" + fTru.b);
    }

    @Override
    public void Multiply(Number x) {
        Number fNhan = new Fraction();
        int t = a * x.a;
        int m = b * x.b;
        fNhan.a = t / UCLN(t, m);
        fNhan.b = m / UCLN(t, m);
        System.out.println("- Nhan 2 phan so = " + fNhan.a + "/" + fNhan.b);
    }

    @Override
    public void Divide(Number x) {
        Number fChia = new Fraction();
        int t = a * x.b;
        int m = b * x.a;
        fChia.a = t / UCLN(t, m);
        fChia.b = m / UCLN(t, m);
        System.out.println("- Chia 2 phan so = " + fChia.a + "/" + fChia.b);
    }

}

public class BAI08 {

    public static void main(String[] args) {
        Number c1 = new Complex(15, 67);
        Number c2 = new Complex(8, 5);
        c1.Add(c2);
        c1.Divide(c2);
        c1.Multiply(c2);
        c1.Subtract(c2);
        Number f1 = new Fraction(5, 7);
        Number f2 = new Fraction(19, 33);
        f1.Add(f2);
        f1.Divide(f2);
        f1.Multiply(f2);
        f1.Subtract(f2);
    }

}

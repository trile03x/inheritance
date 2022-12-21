/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI05;

import java.util.*;

class Store {

    String name;
    String color;
    Store()
    {
        
    }
    Store(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void out() {
        System.out.println("\n- Name website : " + name
                + "\n- Color theme of website : " + color);
    }

}

class Website extends Store {

    String addressWeb;
    String language;

     Website(String addressWeb, String language, String name, String color) {
        super(name, color);
        this.addressWeb = addressWeb;
        this.language = language;
    }

    void out() {
        super.out();
        System.out.println("- Address of website : " + addressWeb
                + "\n- Language build website : " + language);
    }
}

class Restaurant extends Store {

    long numberpeople;// so nguoi duoc phuc vu
    long priceperpeople;

    public Restaurant(long numberpeople, long priceperpeople, String name, String color) {
        super(name, color);
        this.numberpeople = numberpeople;
        this.priceperpeople = priceperpeople;
    }

    void out() {
        super.out();
        System.out.println("- Number of people severd per year : " + numberpeople
                + "\n- The average price per person : " + priceperpeople);
    }
}

public class BAI05_06 {

    public static void main(String[] args) {
        System.out.println("----------------EX 5----------------");
        Website f = new Website("TriTechz.com", "HTML, CSS, JAVASCRIPT", "TECHNOLOGY STORE", "YELLOW");
        f.out();
        System.out.println("----------------EX 6----------------");
        Restaurant f2 = new Restaurant(10000009, 99999, "Luxury", "Pink");
        f2.out();
        System.out.println("=>The average taxes per year: "+(double)(f2.numberpeople*f2.priceperpeople*0.06));
    }

}

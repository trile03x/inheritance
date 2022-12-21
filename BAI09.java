/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FixBai9;

import java.util.*;

abstract class Food {

    private String Description;
    private Double Calo;

    Food() {

    }

    public Food(String Description, Double Calo) {
        this.Description = Description;
        this.Calo = Calo;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Double getCalo() {
        return Calo;
    }

    public void setCalo(Double Calo) {
        this.Calo = Calo;
    }

    double CheckCalo() {
        return 10 * Calo;
    }

    public abstract void display();

}

class LiquidFood extends Food {

    private Double viscosity;

    LiquidFood() {

    }

    public LiquidFood(Double viscosity, String Description, Double Calo) {
        super(Description, Calo);
        this.viscosity = viscosity;
    }

    public Double getViscosity() {
        return viscosity;
    }

    public void setViscosity(double viscosity) {
        this.viscosity = viscosity;
    }

    @Override
    public void display() {
        System.out.println("______________Info Liquid Food______________");
        System.out.println("-  Description : " + getDescription());
        System.out.println("-  Calo : " + getCalo());
        System.out.println("-  Viscosity : " + getViscosity());
        System.out.println("-  Calo per 10 servings : " + CheckCalo());
    }

}

class Fruit extends Food {

    private String season;

    Fruit() {

    }

    public Fruit(String season, String Description, Double Calo) {
        super(Description, Calo);
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public void display() {
        System.out.println("______________Info Fruit______________");
        System.out.println("-  Description : " + getDescription());
        System.out.println("-  Calo : " + getCalo());
        System.out.println("-  Season : " + getSeason());
        System.out.println("-  Calo per 10 servings : " + CheckCalo());
    }

}

public class BAI09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LiquidFood f1 = new LiquidFood();
        System.out.println("************ Liquid Food ************");
        System.out.println("- Enter Description : ");
        f1.setDescription(sc.nextLine());
        System.out.println("- Enter Calo : ");
        f1.setCalo(sc.nextDouble());
        System.out.println("- Enter Viscosity : ");
        f1.setViscosity(sc.nextDouble());
        f1.display();
        Fruit f2 = new Fruit();
        sc.nextLine();
        System.out.println("************ Fruit ************");
        System.out.println("- Enter Description : ");
        f2.setDescription(sc.nextLine());
        System.out.println("- Enter Calo : ");
        f2.setCalo(sc.nextDouble());
        sc.nextLine();
        System.out.println("- Enter Season : ");
        f2.setSeason(sc.nextLine());
        f2.display();

    }
}

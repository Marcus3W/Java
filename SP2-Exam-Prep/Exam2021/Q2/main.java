package Exam2021.Q2;

public class main {

    public static void main(String[] args) {
        StillWater sea = new StillWater("North Sea", false);


        River r1 = new River("Thames", sea);
        River r2 = new River("Lea", r1);
        System.out.println(r2);
        System.out.println(r1.hasFreshWater());
        System.out.println(sea.hasFreshWater());

    }
}

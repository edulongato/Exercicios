package fundamentos;

public class Aritimeticos {

    public static void main(String[] args) {

//        Objetivo: Representar a formula-> ((6*(3+2))^2/(3*2)-((1-5)*(2-7)/2)^2)^3/10^3


        double pt1, pt2, pt3;
        double result;

        pt1 = 6 * (3 + 2);
        pt1 = Math.pow(pt1, 2) / 6;

        pt2 = (1 - 5) * (2 - 7) / 2;
        pt2 = Math.pow(pt2, 2);

        pt3 = Math.pow(10, 3);
        result = Math.pow(pt1 - pt2, 3) / pt3;

        System.out.println("-->" + pt1);
        System.out.println("-->" + pt2);
        System.out.println("-->" + pt3);
        System.out.println("-->" + result);

    }


}

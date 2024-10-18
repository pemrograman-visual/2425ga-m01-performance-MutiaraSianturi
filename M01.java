// 12S24003 - Michael Nasution
// 12S24045 - Mutiara Sianturi
import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double valueNumb, kreditAngka, performance;
        String predikat, kredit;

        kreditAngka = 0;
        kredit = input.nextLine();
        while (!kredit.equals("---")) {
            if (kredit.equals("---")) {
                kredit = kredit;
            } else {
                kreditAngka = Integer.parseInt(kredit);
            }
            predikat = input.nextLine();
            if (predikat.equals("A")) {
                valueNumb = 4.0;
            } else {
                if (predikat.equals("AB")) {
                    valueNumb = 3.5;
                } else {
                    if (predikat.equals("B")) {
                        valueNumb = 3.0;
                    } else {
                        if (predikat.equals("BC")) {
                            valueNumb = 2.5;
                        } else {
                            if (predikat.equals("C")) {
                                valueNumb = 2.0;
                            } else {
                                if (predikat.equals("D")) {
                                    valueNumb = 1.0;
                                } else {
                                    if (predikat.equals("E")) {
                                        valueNumb = 0.0;
                                    } else {
                                        valueNumb = 0.0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            performance = kreditAngka * valueNumb;
            System.out.println(toFixed(performance,1));
            kredit = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

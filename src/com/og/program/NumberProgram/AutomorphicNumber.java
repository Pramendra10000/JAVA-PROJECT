package com.og.program.NumberProgram;



public class AutomorphicNumber {
    public boolean isAutomorphic(int num) {
        int square = num * num;
        while (num > 0) {
            if (num % 10 != square % 10)
                return false;
            num = num / 10;
            square = square / 10;
        }
        return true;
    }

    public void checkAutomorphic(int num) {
        System.out.println(isAutomorphic(num) ? "Automorphic" : "Not Automorphic");
    }
}

package com.javaguru.student_deniss_lohins.lesson_15.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class QuadraticEqilibration {

    public double[] calc(double a, double b, double c) {
        //formula of equilibraiton ax^2 + bx + c = 0
        double discriminant = getDiscriminant(a, b, c);
        double[] roots = getRoots(a, b, discriminant);
        printResult(getRoots(a, b, discriminant));
        return roots;
    }

    private double getDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    private double[] getRoots(double a, double b, double discriminant) {
        if (discriminant > 0) {
            return findRootsIfDiscrimiantnIsPositive(a, b, discriminant);
        } else if (discriminant == 0) {
            return findRootIfDiskriminantIsZero(a, b);
        } else {
            double[] root = new double[0];
            return root;
        }

    }

    private void printResult(double[] roots) {
        if (roots.length == 0) {
            System.out.println("There are no real roots");
        }
        for (int i = 0; i < roots.length; i++) {
            System.out.println("x" + (i+1) + " = " + roots[i]);
        }

    }

    private double[] findRootIfDiskriminantIsZero(double a, double b) {
        double root = -b / (2 * a);
        double[] result = {root};
        return result;
    }

    private double[] findRootsIfDiscrimiantnIsPositive(double a, double b, double discriminant) {
        double root1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double[] result = {root1, root2};
        return result;
    }

}

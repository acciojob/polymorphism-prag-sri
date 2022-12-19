package com.driver;
public class Main {
    static class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }

    public static void main(String[] args)
    {
        Product p= new Product();
        int a1= p.product(2,3);
        int b1= p.product(2,3,4);
        double c1= p.product(2.5,3.5);
    }
}
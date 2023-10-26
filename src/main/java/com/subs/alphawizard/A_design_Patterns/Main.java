package com.subs.alphawizard.A_design_Patterns;

import java.util.*;
import java.util.stream.Collectors;

class Product {
    private int productId;
    private String name;
    private double price;
    private String category;

    public Product(int productId, String name, double price, String category) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 800.0, "Electronics"));
        products.add(new Product(2, "Smartphone", 600.0, "Electronics"));
        products.add(new Product(3, "Coffee Maker", 60.0, "Kitchen"));
        products.add(new Product(4, "Headphones", 120.0, "Electronics"));
        products.add(new Product(5, "Toaster", 40.0, "Kitchen"));
        

        // 1. Your task is to filter a list of Product objects to select products with a price greater than $50, sort them by price in descending order, and then print the names of the top three most expensive products
        products.stream().filter(s->s.getPrice()>50).sorted(Comparator.comparing(Product::getPrice).reversed()).map(Product::getName).limit(3).forEach(System.out::println);
        

        //You are given an array of integers in sorted order and a target sum.
        // Write a function to find two distinct numbers in the array that add up to the target sum.
        // If such a pair does not exist, return an empty array. Assume there is exactly one solution.

            int nums[] = {2, 7, 11, 15};
            int target = 9;
        //  Output: [2, 7]*/
        int l=0, r=nums.length-1;
        while(l<r){
            //System.out.println(nums[r]+" "+nums[l]);
            if(nums[r]+nums[l]==target){
                System.out.println(nums[r]+" "+nums[l]);
                break;
            }
            else if(nums[r]+nums[l]>target)
                r--;
            else if(nums[r]+nums[l]<target)
                l++;
        }

        
    }
}

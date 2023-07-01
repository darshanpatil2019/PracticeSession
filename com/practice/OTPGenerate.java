package com.practice;

import java.util.Random;

public class OTPGenerate {
    public static void main(String[] args) {

        Random random = new Random();
        int otp = random.nextInt(9999);
        System.out.println("Your OTP is " + otp);
    }
}

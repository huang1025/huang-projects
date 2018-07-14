package com.huang.practice.java.io;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by huang_jiangling on 2018/7/14.
 */
public class _4_scanner {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (scanner.hasNext()) {
                String next = scanner.next();
                System.out.println("本次输入的内容为：" + next);
            } else {
                System.out.println("hehe");
            }
        }
    }
}





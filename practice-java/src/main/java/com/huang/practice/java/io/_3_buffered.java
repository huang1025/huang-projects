package com.huang.practice.java.io;

import java.io.*;

/**
 * Created by huang_jiangling on 2018/7/14.
 */
public class _3_buffered {
    public static void main(String[] args) throws IOException {
        File in = new File("/Users/admin/ideaProjects/huang-projects/practice-java/src/main/resources/a.txt");
        File out = new File("/Users/admin/ideaProjects/huang-projects/practice-java/src/main/resources/b.txt");

        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(in))) {
            try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(out))) {
                byte[] bytes = new byte[12];
                int readNum = -1;
                while ((readNum = inputStream.read(bytes)) != -1) {
                    outputStream.write(bytes, 0, readNum);
                }
            }
        }
    }
}

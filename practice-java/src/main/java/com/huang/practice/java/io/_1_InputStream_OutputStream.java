package com.huang.practice.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by huang_jiangling on 2018/7/14.
 */
public class _1_InputStream_OutputStream {
    public static void main(String[] args) throws IOException {
        File in = new File("/Users/admin/ideaProjects/huang-projects/practice-java/src/main/resources/a.txt");
        File out = new File("/Users/admin/ideaProjects/huang-projects/practice-java/src/main/resources/b.txt");

        try (FileInputStream fileInputStream = new FileInputStream(in)) {
            try (FileOutputStream fileOutputStream = new FileOutputStream(out, true)) {
                byte[] bytes = new byte[4];
                int readNum = -1;
                while ((readNum = fileInputStream.read(bytes)) != -1) {
                    fileOutputStream.write(bytes, 0, readNum);
                }
            }
        }
    }
}

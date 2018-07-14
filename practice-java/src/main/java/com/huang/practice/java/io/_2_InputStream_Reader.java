package com.huang.practice.java.io;

import java.io.*;

/**
 * Created by huang_jiangling on 2018/7/14.
 */
public class _2_InputStream_Reader {
    public static void main(String[] args) throws IOException {
        File in = new File("/Users/admin/ideaProjects/huang-projects/practice-java/src/main/resources/a.txt");
        File out = new File("/Users/admin/ideaProjects/huang-projects/practice-java/src/main/resources/b.txt");

        try (Reader reader = new InputStreamReader(new FileInputStream(in))) {
            try (Writer writer = new OutputStreamWriter(new FileOutputStream(out, true))) {
                char[] c = new char[4];
                int readNum = -1;
                while ((readNum = reader.read(c)) != -1) {
                    writer.write(c, 0, readNum);
                    writer.flush();
                }
            }
        }
    }
}

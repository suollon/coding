package com.suollon.coding.concurrent;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * @author hzwwl
 * @date 2019/6/19 16:04
 */
public class Piped {
    public static void main(String[] args) throws IOException {
        PipedWriter out = new PipedWriter();
        PipedReader in = new PipedReader();
        out.connect(in);
        Thread printThread = new Thread(new Print(in), "PrintThread");
        printThread.start();
        int receieve = 0;
        try {
            while ((receieve = System.in.read()) != -1) {
                out.write(receieve);
            }
        } finally {
            out.close();
        }
    }

    static class Print implements Runnable {
        private PipedReader in;
        public Print (PipedReader in) {
            this.in = in;
        }
        @Override
        public void run() {
            int receieve = 0;
            try {
                while ((receieve = in.read()) != -1) {
                    System.out.println((char) receieve);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

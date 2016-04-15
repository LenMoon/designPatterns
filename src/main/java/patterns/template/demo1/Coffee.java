package patterns.template.demo1;

import java.io.*;

/**
 * Created by liumeng on 2016/4/15.
 */
public class Coffee extends CaffeeTeaBeverage {

    void addCondiments() {
        System.out.println("Adding sugar and mikl");
    }

    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    boolean wantWithCodiments() {
        try {
            System.out.println("想要加饮料吗?");
            PipedInputStream in = new PipedInputStream();

            PipedOutputStream out=new PipedOutputStream(in);
            out.write("y\r\n".getBytes());

            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            if (br.readLine().equalsIgnoreCase("y")) {
                return true;
            } else {
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
           return super.wantWithCodiments();
        }
    }

}

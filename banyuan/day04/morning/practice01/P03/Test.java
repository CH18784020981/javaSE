package banyuan.day04.morning.practice01.P03;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("c11h");
        stu.setSex('j');
        stu.setAge(18);
        stu.setDir(".net1");

        System.out.println(stu.toString());
    }

}

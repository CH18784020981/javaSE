package banyuan.day05.practice.p01;
/*
1.interface Inter{void  show();}
class Outer{  你的代码;  }
class OuterDemo{
public static void  main(String[] args){
Outer.method().show();
}
}
 */

/**
 * @author newpc
 */
public class Outer {
    public static class method implements Inter {

        @Override
        public void show() {
            System.out.println("Hello word");
        }
    }
}




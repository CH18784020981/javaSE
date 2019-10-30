package banyuan.day05.practice.p01;

public class Outer1 {
    interface Inter {
        void show();
    }

    static class Outer {
        public static Inter method() {
            return new Inter() {
                @Override
                public void show() {
                    System.out.println("Hello World");
                }


            };
        }
    }

    static class OuterDemo {
        public static void main(String[] args) {
            Outer.method().show();
        }
    }
}



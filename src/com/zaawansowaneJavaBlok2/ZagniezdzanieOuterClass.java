package com.zaawansowaneJavaBlok2;

//ciekawe
class ZagniezdzanieOuterClass {
    int x = 10;

    class InnerClass {//jeśli zrobisz private to w poniższym użyciu wyskoczy bład
        int y = 5;
    }
}

class MyMainClassX {
    public static void main(String[] args) {
        ZagniezdzanieOuterClass myOuter = new ZagniezdzanieOuterClass();
        ZagniezdzanieOuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}


// Outputs 15 (5 + 10)

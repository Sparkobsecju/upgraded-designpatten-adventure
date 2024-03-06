package com.practice.principle.inversion.improve;

// 依賴關係傳遞的三種方式: 介面、建構子、setter

public class DependencyPass {
    public static void main(String[] args) {
        Asus asus = new Asus();
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(asus);

//        // 通過建構子進行依賴傳遞
//        OpenAndClose openAndClose = new OpenAndClose(asus);
//        openAndClose.open();

        // 通過 setter 方法進行依賴傳遞
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(asus);
        openAndClose.open();
    }
}

//// 方式1: 通過介面傳遞實現依賴
//// 開關的介面
//interface IOpenAndClose {
//    public void open(ITV tv); // 抽象方法，接收介面
//}
//
//interface ITV { // ITV 介面
//    public void play();
//}
//
//class Asus implements ITV {
//    @Override
//    public void play() {
//        System.out.println("ASUS電視，打開");
//    }
//}
//// 實作介面
//class OpenAndClose implements IOpenAndClose {
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//    }
//}

//// 方式2: 通過建構函數依賴傳遞
//interface IOpenAndClose {
//    public void open(); // 抽象方法
//}
//interface ITV { // ITV介面
//    public void play();
//}
//class Asus implements ITV {
//    @Override
//    public void play() {
//        System.out.println("ASUS電視，打開");
//    }
//}
//class OpenAndClose implements IOpenAndClose {
//    public ITV tv; // 屬性
//    public OpenAndClose(ITV tv) { // 建構子
//        this.tv = tv;
//    }
//    public void open() {
//        this.tv.play();
//    }
//}

// 方式3， 通過setter方法傳遞
interface IOpenAndClose {
    public void open(); // 抽象方法
    public void setTv(ITV tv);
}
interface ITV { // ITV 介面
    public void play();
}
class Asus implements ITV {
    @Override
    public void play() {
        System.out.println("ASUS電視，打開");
    }
}

class OpenAndClose implements IOpenAndClose {
    private ITV tv;

    public void setTv(ITV tv) {
        this.tv = tv;
    }
    public void open() {
        this.tv.play();
    }
}















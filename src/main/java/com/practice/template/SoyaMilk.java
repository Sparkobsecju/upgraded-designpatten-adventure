package com.practice.template;

// 抽象類，表示豆漿
public abstract class SoyaMilk {

    // 樣板方法，make，樣板方法可以做成 final，不讓子類別去 Override
    final void make() {

        select();
        addCondiments();
        soak();
        beat();
    }

    // 選材料
    void select() {
        System.out.println("第一步：選擇好的新鮮黃豆 ");
    }


    // 添加不同的配料，抽象方法，子類別具體實作
    abstract void addCondiments();

    // 浸泡
    void soak() {
        System.out.println("第三步：黃豆和配料開始浸泡，需要3小時 ");
    }

    void beat() {
        System.out.println("第四步：黃豆和配料放到豆漿機去打碎");
    }

}

/**
 * template 樣板方法
 * template() {
 *     operation2()
 *     operation3()
 *     operation4()
 * }
 *
 * operation2,3,4 可以是抽象方法，也可以是實作方法
 * 如果是抽象的方法，就放到子類別去實作即可
 *
 * 1. AbstractClass 抽象類別，類別中實作了樣板方法，定義了算法的骨架，具體子類別要去實作 其他的抽象方法2, 3, 4
 * 2. ConcreteClass 實作抽象方法operation2, 3, 4，以完成算法中特定子類別的步驟
 */
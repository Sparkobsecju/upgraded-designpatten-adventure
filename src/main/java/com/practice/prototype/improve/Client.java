package com.practice.prototype.improve;

public class Client {

    public static void main(String[] args) {
        System.out.println("原型模式完成物件的創建");
        Sheep sheep = new Sheep("tom", 1, "白色");

        sheep.friend = new Sheep("jack", 2, "黑色");

        Sheep sheep2 = (Sheep) sheep.clone(); // 複製
        Sheep sheep3 = (Sheep) sheep.clone(); // 複製
        Sheep sheep4 = (Sheep) sheep.clone(); // 複製
        Sheep sheep5 = (Sheep) sheep.clone(); // 複製

        System.out.println( "sheep : sheep2 => " + (sheep == sheep2));

        System.out.println("sheep2 = " + sheep2 + "sheep2.friend=" + sheep2.friend.hashCode());
        System.out.println("sheep3 = " + sheep3 + "sheep3.friend=" + sheep3.friend.hashCode());
        System.out.println("sheep4 = " + sheep4 + "sheep4.friend=" + sheep4.friend.hashCode());
        System.out.println("sheep5 = " + sheep5 + "sheep5.friend=" + sheep5.friend.hashCode());
    }
}

package com.practice.memento.game;

public class Client {
    public static void main(String[] args) {
        // 創建遊戲角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("和 Boss 大戰前的狀態");
        gameRole.display();

        // 把當前狀態保存到 Caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("和 Boss 大戰~~~~~");
        gameRole.setDef(30);
        gameRole.setVit(30);

        gameRole.display();

        System.out.println("大戰後，使用備忘錄物件恢復到大戰前");
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        System.out.println("恢復後的狀態");
        gameRole.display();
    }
}

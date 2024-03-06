package com.practice.proxy.staticproxy;

// 代理物件，靜態代理
public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao target; // 目標物件，通過介面來聚合

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("開始代理 完成某些操作......"); // 方法A...

        target.teach();

        System.out.println("提交......"); // 方法B...
    }
}

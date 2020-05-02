package org.hyc;

/**
 * @author hyc
 * Singleton4 枚举方式
 * 优点：天然线程安全，可防止反射生成实例
 */
public enum Singleton4 {

    /**
     * 单例实例
     */
    INSTANCE;

    public void init() {
        System.out.println("init...");
    }

    public static void main(String[] args) {
        Singleton4.INSTANCE.init();
    }
}

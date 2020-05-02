package org.hyc;

/**
 * @author Lenovo
 * Singleton2 懒汉式 双重加索检查
 * 优点：在获取实例的方法中，进行实例的初始化，线程安全，保证只有唯一实例
 * 缺点：实例非空判断，耗费资源
 */
public class Singleton2 {

    /**
     * instance
     * 必须加volatile关键字修饰，保证初始化完全
     */
    private volatile static Singleton2 instance = null;

    private Singleton2() {}

    public static Singleton2 getInstance() {
        if(instance == null) {
            synchronized (Singleton2.class) {
                if(instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}

package org.hyc;

/**
 * @author Lenovo
 * Singleton1 饿汉式
 * 优点：线程安全，获取实例速度快
 * 缺点：类加载即初始化实例，内存浪费
 */
public class Singleton1 {

    /**
     * instance
     * 声明静态私有类变量，且立即实例化，保证实例化一次
     */
    private static Singleton1 instance = new Singleton1();

    /**
     * Singleton1
     * 私有构造方法，防止外部实例化（注意：通过反射是可以实例化）
     */
    private Singleton1(){}

    /**
     * 提供public的getInstance方法供外部获取单例实例
     * @return instance
     */
    public static Singleton1 getInstance(){
        return instance;
    }
}

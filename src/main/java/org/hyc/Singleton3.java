package org.hyc;

/**
 * @author Lenovo
 * Singleton3 内部类
 * 优点：既避免了同步带来的性能损耗，又能够延迟加载
 */
public class Singleton3 {

    /**
     * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     * 没有绑定关系，而且只有被调用到才会装载，从而实现了延迟加载
     */
    private static class SingletonHolder{

        /**
         * 静态初始化，由JVM来保证线程安全
         */
        private static final Singleton3 instance = new Singleton3();
    }
    private Singleton3(){}

    public static Singleton3 getInstance() {
        return SingletonHolder.instance;
    }
}

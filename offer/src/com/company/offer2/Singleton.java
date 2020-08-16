package com.company.offer2;


/**
 * 单例模式
 * 1、懒汉模式
 */
//public class Singleton {
//    private static Singleton instance;
//
//    private Singleton() {
//    }
//
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}


/**
 * 2、饿汉模式
 */
//public class Singleton {
//    private static Singleton instance = new Singleton();
//
//    private Singleton() {
//    }
//
//    public static Singleton getInstance() {
//        return instance;
//    }
//}


/**
 * 3、静态内部类
 */
//public class Singleton {
//    private static class SingletonHolder {
//        private static final Singleton instance = new Singleton();
//    }
//
//    private Singleton() {
//    }
//
//    public static final Singleton getInstance() {
//        return SingletonHolder.instance;
//    }
//}

/**
 * 4、双重校验锁
 */
public class Singleton {
    private static volatile Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
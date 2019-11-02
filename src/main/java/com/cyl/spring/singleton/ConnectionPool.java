package com.cyl.spring.singleton;

/**
 * @author : Liu
 * @Date : 2019/11/2 下午 08:26
 * @Description :
 */

public class ConnectionPool {
    //1.構造方法私有化
    private ConnectionPool(){}

    //2.聲明一個靜態變量
    //懶漢模式 線程安全問題
//    private static ConnectionPool pool;
    //惡漢式
    private static ConnectionPool pool = new ConnectionPool();
    //3.提供一個靜態方法,返回該實例對象
    public synchronized static ConnectionPool getInstance(){
        if (pool == null){
            pool = new ConnectionPool();
        }
        return pool;
    }

}

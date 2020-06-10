package com.example.demoshardingsphere.infrastructure.dao.idgen;

public class IdGen {
    private static Object obj = new Object();
    private static int  id = 0;
    public static int getId(){
        int ret;
        synchronized (obj){
            id++;
            ret = id;
        }
        return ret;
    }
}

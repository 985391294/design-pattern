package com.tqz.pattern.adapter.poweradapter;

/**
 * @Author: tian
 * @Date: 2020/4/23 0:16
 * @Desc: 
 */
public class PowerAdapterTest {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outoupDC5V();
    }
}

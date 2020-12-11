package com.joinly.pattern.cglibproxy;

/**
 * @author joinly
 * @company: goodinvest
 * @date 2020-12-09 11:51
 * @desc: TODO
 */
public class Test {

    public static void main(String[] args) {
        //返回的是代理对象(实际是目标对象的子类)
        //Zhaosan zhaosan = (Zhaosan)new CglibMeiPao().getInstance(Zhaosan.class);
        //zhaosan.findGirlfriend();


        //没有实现类，直接代理接口
        Zhaosan2 zhaosan2 = (Zhaosan2)new CglibMeiPao2().getInstance(Zhaosan2.class);
        zhaosan2.findGirlfriend();
    }
}

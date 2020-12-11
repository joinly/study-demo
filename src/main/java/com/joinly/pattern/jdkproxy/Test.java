package com.joinly.pattern.jdkproxy;

/**
 * @author joinly
 * @company: goodinvest
 * @date 2020-12-09 15:06
 * @desc: TODO
 */
public class Test {
    public static void main(String[] args) {
        //有实现类的
        //JdkMeiPao jdkMeiPao = new JdkMeiPao();
        //IPerson person = jdkMeiPao.getInstance(new Zhaoliu());
        //person.findGirlfriend();

        //没有实现类，直接代理接口
        JdkMeiPao2 jdkMeiPao2 = new JdkMeiPao2();
        IPerson person2 = jdkMeiPao2.getInstance(IPerson.class);
        person2.test(23);
    }
}

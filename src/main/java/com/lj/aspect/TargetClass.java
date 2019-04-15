package com.lj.aspect;


import org.springframework.stereotype.Component;

/**

 * 被代理对象

 */

@Component("targetClass")
public class TargetClass {

    /**

     * 拼接两个字符串

     */

    public String joint(String str1, String str2) {

        return str1 + "+" + str2;

    }

}

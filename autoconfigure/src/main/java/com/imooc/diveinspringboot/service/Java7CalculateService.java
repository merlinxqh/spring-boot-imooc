package com.imooc.diveinspringboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @ClassName Java7CalculateService
 * @Description Java7 实现 累加 求和
 * @Author xuqianghui
 * @Date 2019/3/18 22:24
 * @Version 1.0
 */
@Service
@Profile("Java7")
public class Java7CalculateService implements CalculateService{

    @Override
    public Integer sum(Integer... values) {
        System.out.println("java 7 for 循环实现...");
        int sum = 0;
        for(Integer i:values){
            sum += i;
        }
        return sum;
    }
}

package com.imooc.diveinspringboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * @ClassName Java7CalculateService
 * @Description Java7 实现 累加 求和
 * @Author xuqianghui
 * @Date 2019/3/18 22:24
 * @Version 1.0
 */
@Service
@Profile("Java8")
public class Java8CalculateService implements CalculateService{

    @Override
    public Integer sum(Integer... values) {
        System.out.println("java 8 lambda 循环实现...");
        return Stream.of(values).reduce(0, Integer::sum);
    }
}

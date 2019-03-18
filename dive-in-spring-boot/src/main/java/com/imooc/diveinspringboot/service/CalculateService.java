package com.imooc.diveinspringboot.service;

/**
 * @ClassName CalculateService
 * @Description 计算服务
 * @Author xuqianghui
 * @Date 2019/3/18 22:23
 * @Version 1.0
 */
public interface CalculateService {

    /**
     * 计算求和
     * @param values
     * @return
     */
    Integer sum(Integer... values);
}

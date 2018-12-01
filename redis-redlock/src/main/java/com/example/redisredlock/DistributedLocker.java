package com.example.redisredlock;

/**
 * @author WangKun
 * @create 2018-11-29 下午 5:19
 * @desc 获取锁管理类
 **/
public interface DistributedLocker {
    /**
     * 获取锁
     *
     * @param resourceName 锁的名称
     * @param worker       获取锁后的处理类
     * @param <T>
     * @return 处理完具体的业务逻辑要返回的数据
     * @throws Exception
     */
    <T> T lock(String resourceName, AquiredLockWorker<T> worker) throws Exception;

    <T> T lock(String resourceName, AquiredLockWorker<T> worker, int lockTime) throws  Exception;

}

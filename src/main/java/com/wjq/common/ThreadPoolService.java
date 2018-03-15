package com.wjq.common;

import org.springframework.stereotype.Service;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@Service("threadPoolService")
public class ThreadPoolService {

    private final static int    processorsNum = Runtime.getRuntime().availableProcessors() + 1;

    // 构造线程池，异步处理
    ThreadPoolExecutor          threadPool    = new ThreadPoolExecutor(processorsNum, processorsNum, 300,
                                                                       TimeUnit.SECONDS,
                                                                       new LinkedBlockingQueue<Runnable>(300),
                                                                       new ThreadPoolExecutor.CallerRunsPolicy());

    
    private AtomicBoolean      isShutdown    = new AtomicBoolean(false);
    /**
     * 调用线程池执行任务
     * 
     * @param command
     */
    public void execute(Runnable command) {
        if (!isShutdown.get()) {
            threadPool.execute(command);
        }
    }
    
    public void shutdownThreadPool() {
        if (isShutdown.compareAndSet(false, true)) {
            threadPool.shutdown();
        }
    }

}

package com.retloh.ftpserver;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.stereotype.Component;

@Component
public class ThreadPool {
	private ExecutorService executorService = Executors.newFixedThreadPool(2);
	
	public ExecutorService getExecutor(){
		return executorService;
	}

}

package org.application.core.springbatch;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class MyJobListener implements JobExecutionListener {
    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("Job starterd");
        JobExecutionListener.super.beforeJob(jobExecution);
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("Job completed" + jobExecution.getStatus().toString());
        JobExecutionListener.super.afterJob(jobExecution);
    }
}

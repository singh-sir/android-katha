package com.myworkmanager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class MyWorker(appContext: Context, workerParams: WorkerParameters) :
    Worker(appContext, workerParams) {
    /**
     * it will be called after the specified delay
     */
    override fun doWork(): Result {
        Log.i("MyWorker", "doWork")

        //you can notify back to user
        WorkHandler.onDoWork()

        //or if you need to do some background task e.g., upload or download
        //then pass the reference of the required resources in MyWorker()
        doFurtherTask()

        return Result.success()
    }

    /**
     * or if you need to do some background task e.g., upload or download
     * then pass the reference of the required resources in MyWorker()
     */
    private fun doFurtherTask() {
        Log.i("MyWorker", "doFurtherTask")
        // do your background work here if required
    }
}
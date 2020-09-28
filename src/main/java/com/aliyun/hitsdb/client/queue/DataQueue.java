package com.aliyun.hitsdb.client.queue;

import com.aliyun.hitsdb.client.value.request.MultiFieldPoint;
import com.aliyun.hitsdb.client.value.request.Point;

public interface DataQueue {
    void send(Point point);

    Point receive() throws InterruptedException;

    Point receive(int timeout) throws InterruptedException;


    void sendMultiFieldPoint(MultiFieldPoint point);

    MultiFieldPoint receiveMultiFieldPoint() throws InterruptedException;

    MultiFieldPoint receiveMultiFieldPoint(int timeout) throws InterruptedException;

    void forbiddenSend();

    void waitEmpty();

    boolean isEmpty();

    Point[] getPoints();

    MultiFieldPoint[] getMultiFieldPoints();

    /**
     * pause for a while to block all the put request
     */
    void pause();

    /**
     * unpause for recovery
     */
    void unpause();
}

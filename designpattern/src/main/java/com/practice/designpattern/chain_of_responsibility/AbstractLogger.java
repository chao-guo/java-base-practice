package com.practice.designpattern.chain_of_responsibility;

/**
 * @author chao.guo
 * @Description TODO
 * @create 2020/07/17 16:49:00
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage
                    (level, message);
        }
    }

    abstract protected void write(String message);
}

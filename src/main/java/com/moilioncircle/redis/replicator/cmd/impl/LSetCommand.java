package com.moilioncircle.redis.replicator.cmd.impl;

import com.moilioncircle.redis.replicator.cmd.Command;

/**
 * Created by leon on 2/2/17.
 */
public class LSetCommand implements Command {
    private String key;
    private long index;
    private String value;

    public LSetCommand() {
    }

    public LSetCommand(String key, long index, String value) {
        this.key = key;
        this.index = index;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public long getIndex() {
        return index;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "LSetCommand{" +
                "key='" + key + '\'' +
                ", index=" + index +
                ", value='" + value + '\'' +
                '}';
    }
}

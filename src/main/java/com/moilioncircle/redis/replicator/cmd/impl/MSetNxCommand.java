package com.moilioncircle.redis.replicator.cmd.impl;

import com.moilioncircle.redis.replicator.cmd.Command;

import java.util.Map;

/**
 * Created by leon on 2/2/17.
 */
public class MSetNxCommand implements Command {
    private Map<String, String> kv;

    public MSetNxCommand() {
    }

    public MSetNxCommand(Map<String, String> kv) {
        this.kv = kv;
    }

    public Map<String, String> getKv() {
        return kv;
    }

    public void setKv(Map<String, String> kv) {
        this.kv = kv;
    }

    @Override
    public String toString() {
        return "MSetNxCommand{" +
                "kv=" + kv +
                '}';
    }
}

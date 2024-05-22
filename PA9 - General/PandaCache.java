/*
 * Name: Roham Mehrabi
 * PID: A17025640
 */

import java.util.*;

import org.w3c.dom.Node;

/**
 * TODO
 *
 * @author TODO
 * @since TODO
 */

public class PandaCache {

    private final int capacity;
    private final Map<Integer, Integer> cache;

    public PandaCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > PandaCache.this.capacity;
            }
        };
    }

    public int get(int pandaID) {
        return cache.getOrDefault(pandaID, -1);
    }

    public void set(int pandaID, int zoneNumber) {
        cache.put(pandaID, zoneNumber);
    }

}
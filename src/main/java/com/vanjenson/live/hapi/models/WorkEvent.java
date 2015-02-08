package com.vanjenson.live.hapi.models;

import javax.persistence.*;

/**
 * Created by vj on 2/8/15.
 */

public class WorkEvent {
    @Id
    @Column(name = "event_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long eventId;
    private String event;
    private String time;
    
    // Default constructor
    protected WorkEvent() {
    }

    // Getters
    public long getEventId() {
        return eventId;
    }

    public String getEvent() {
        return event;
    }

    public String getTime() {
        return time;
    }

    // Setters - don't want to allow changes to the eventId or time
    public void setEvent(String event) {
        this.event = event;
    }
}


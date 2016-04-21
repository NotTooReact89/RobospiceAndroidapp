package com.putti.robospiceandroidapp;

import com.google.api.client.util.Key;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 * Created by sharandhanala on 20/04/16.
 */
public class Events {
    @Key
    private ArrayList<Event> Events;

    /**
     * No args constructor for use in serialization
     */
    public Events() {
    }

    public List<Event> getChildren() {
        return this.Events;
    }

    @Override
    public String toString() {
        return "Events [modhash=" + Events + "]";
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Events).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Events) == false) {
            return false;
        }
        Events rhs = ((Events) other);
        return new EqualsBuilder().append(Events, rhs.Events).isEquals();
    }
}


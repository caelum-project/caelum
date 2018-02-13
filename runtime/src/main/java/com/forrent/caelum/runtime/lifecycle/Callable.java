package com.forrent.caelum.runtime.lifecycle;

import com.forrent.caelum.runtime.EventContext;

public interface Callable extends EventListener {

    /**
     * Passes the event to the listener.
     *
     * @param eventContext
     * @return
     * @throws Exception
     */
    Object onCall(EventContext eventContext) throws Exception;
}

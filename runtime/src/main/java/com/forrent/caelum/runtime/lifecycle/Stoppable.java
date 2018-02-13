package com.forrent.caelum.runtime.lifecycle;

import com.forrent.caelum.runtime.CaelumException;

public interface Stoppable {

    void stop() throws CaelumException;
}

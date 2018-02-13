package com.forrent.caelum.runtime.lifecycle;

import com.forrent.caelum.runtime.CaelumException;

public interface Startable {

    void start() throws CaelumException;
}

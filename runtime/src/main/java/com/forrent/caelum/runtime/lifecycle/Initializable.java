package com.forrent.caelum.runtime.lifecycle;

public interface Initializable {

    String PHASE_NAME = "initialize";

    /**
     * Method used to perform any initialization work. If a fatal error occurs during
     * initialization an <code>{@link InitializationException}</code> should be thrown,
     * causing the Caelum instance to shutdown. If the error is recoverable, say by
     * retrying to connect, a <code>{@link RecoverableException}</code> should be thrown.
     *
     * There is no guarantee that by throwing a Recoverable exception that the Caelum
     * instance will not shutdown.
     *
     * @throws InitializationException if a fatral error occurs causing the instance to shutdown
     * @throws RecoverableException if an error occurs that can be recovered from
     */
    void initialize() throws InitializationException;
}

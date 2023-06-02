/*
 * Copyright (c) 2022. PortSwigger Ltd. All rights reserved.
 *
 * This code may be used to extend the functionality of Burp Suite Community Edition
 * and Burp Suite Professional, provided that this usage does not violate the
 * license terms for those products.
 */

package burp.api.montoya.websocket;

import burp.api.montoya.core.Registration;

/**
 * This interface is used to access WebSocket related functionality of Burp.
 */
public interface WebSockets
{
    /**
     * This method is used to register a handler which will be invoked whenever a WebSocket is created by any Burp tool.
     *
     * @param handler An object created by the extension that implements {@link WebSocketCreationHandler} interface.
     * @return The {@link Registration} for the handler.
     */
    Registration registerWebSocketCreationHandler(WebSocketCreationHandler handler);
}

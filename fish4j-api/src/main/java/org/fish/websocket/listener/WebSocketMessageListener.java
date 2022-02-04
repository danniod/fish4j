package org.fish.websocket.listener;

import okhttp3.WebSocket;

public interface WebSocketMessageListener {

    void onMessage(WebSocket webSocket, String text);

}

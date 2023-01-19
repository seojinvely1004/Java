package websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
public class ChatWebSocketConfig implements WebSocketConfigurer{
//ws요청시 ChatWebSocketHandler 매핑
	private final WebSocketHandler handler;

public ChatWebSocketConfig(WebSocketHandler handler) {//generate constructors fields,,,
	super();
	this.handler = handler;
}

@Override
public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {//override implements....
	registry.addHandler(handler, "/ws").setAllowedOrigins("*");
	
}
	
}

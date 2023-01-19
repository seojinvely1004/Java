package websocket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatController {
	@RequestMapping("/chat")
	public String chat(String id) {
		return "websocket/websocket";//websocket폴더websocket.jsp

	}
}

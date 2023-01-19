package websocket;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
@Component //스프링에서만들어진 모든 객체는 dao성격 repository,service면service,애매하다싶으면 component붙여준다.
public class ChatWebSocketHandler implements WebSocketHandler{
	public static List<WebSocketSession> list = new ArrayList();
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		// 클라이언트 요청시 즉각 호출
		list.add(session);		
	}

	@Override
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
		// 클라이언트로부터 수신시 즉각 호출 (대화 주고받는 곳)
		//session => 웹소켓 클라이언트객체 1개
		//message => 웹소켓 클라이언트가 보낸 문자열 데이터,메시지 - nickname:message
		String msg = (String)message.getPayload();
		for(WebSocketSession s : list) {//list에있는 session다 받도록 반복문
			WebSocketMessage<String> sendmsg = new TextMessage(msg);
			s.sendMessage(sendmsg);//s에게 데이터보내는 메서드 sendMessage() > WebSocketMessage타입으로
		}
		
	}

	@Override
	public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
		//
		
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
		// 클라이언트 연결 해제시 호출됨
		list.remove(session);//인덱스를줘도되고 session줘도됨
	}

	@Override
	public boolean supportsPartialMessages() {
		return false;
	}

}

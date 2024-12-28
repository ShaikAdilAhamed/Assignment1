package in.advjava;

import org.springframework.stereotype.Component;

@Component
public class Sony implements Speaker{

	@Override
	public void playMusic() {
	System.out.println("sony speaker ");
		
	}

}

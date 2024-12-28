package in.advjava;

import org.springframework.stereotype.Component;

@Component

public class Boat implements Speaker{

	@Override
	public void playMusic() {
		System.out.println("Boat Speaker");
		
		
	}

}

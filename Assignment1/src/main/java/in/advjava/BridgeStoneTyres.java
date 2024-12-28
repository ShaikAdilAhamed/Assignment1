package in.advjava;

import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyre{

	@Override
	public void move() {
		System.out.println("move method :: BridgeStoneTyres");
		
	}

	@Override
	public void stop() {
		System.out.println("stop method :: BridgeStoneTyres");
		
	}

}

package in.advjava;

import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyre{

	@Override
	public void move() {
		System.out.println("move method :: MichelinTyres");
		
	}

	@Override
	public void stop() {
		System.out.println("stop method :: MichelinTyres");
		
	}

}

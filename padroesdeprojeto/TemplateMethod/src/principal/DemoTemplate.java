package principal;

import template.Mp3Player;
import template.Player;
import template.WmvPlayer;

public class DemoTemplate {

	public static void main(String[] args) {
		
		Player tocador = new Mp3Player();
		tocador.executar();
		
		System.out.println();
		
		tocador = new WmvPlayer();
		tocador.executar();
		
		
	}

}

package principal;

import adapter.AudioPlayer;

public class DemoAdapter {

	public static void main(String[] args) {
		 AudioPlayer tocador = new AudioPlayer();

	      tocador.tocar("cd", "CD de rock");
	      tocador.tocar("vinil", "VINIL de metal");
	      
	}

}

package principal;

import proxy.AudioIF;
import proxy.ProxyAudio;

public class ProxyDemo {
	
	public static void main(String[] args){
		AudioIF meuAudio = new ProxyAudio("meuArquivo.mp3");
		
		meuAudio.play();
		System.out.println();
		
		
		meuAudio.play();
		System.out.println();
		
		
		
	}

}

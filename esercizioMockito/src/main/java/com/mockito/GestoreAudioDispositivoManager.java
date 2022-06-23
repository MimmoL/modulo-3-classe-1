package com.mockito;

public class GestoreAudioDispositivoManager {

	private int volume = 50;
	private boolean silenzioso;
	
	
	public int getVolume() {
		return volume;
	}
	

	public void setVolume(int volume) {
		this.volume = volume;
	}
	

	public boolean isSilenzioso() {
		return silenzioso;
	}

	public void setSilenzioso(boolean silenzioso) {
		this.silenzioso = silenzioso;
	}

	public void setMaxVolume() {
		this.volume = 100;
	}
	
}

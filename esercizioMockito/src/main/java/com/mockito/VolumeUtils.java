package com.mockito;

public class VolumeUtils {

private GestoreAudioDispositivoManager audioManager;
	
	
	public VolumeUtils(GestoreAudioDispositivoManager manager) {
        this.audioManager = manager;
    }
	
	public void setVolume (GestoreAudioDispositivoManager manager) {
		boolean silenzioso = manager.isSilenzioso();
		
		if (!silenzioso) {
			manager.setMaxVolume();
		}else {
			manager.setVolume(10);
		}
	}
}

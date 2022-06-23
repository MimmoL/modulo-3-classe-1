package com.mockito.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.mockito.Database;
import com.mockito.GestoreAudioDispositivoManager;

class VolumeUtilsTest {
	
	@Mock
    GestoreAudioDispositivoManager manager;

	
	@Test
	public boolean getModeTest() {
		
		
		//ritorna modalita' normale
		when(manager.isSilenzioso()).thenReturn(false);
		boolean silenzioso = manager.isSilenzioso();
		
		when(manager.getVolume()).thenReturn(100);
		
		manager.setVolume(100);
		
		verify(manager, atLeastOnce()).setVolume(100);
		
		return silenzioso;
		
	}
	

}

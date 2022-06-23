package com.mockito.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mockito.Contatore;
import com.mockito.ContatoreService;

//@ExtendWith(MockitoExtension.class)
class ContatoreTest {
	
	private ContatoreService service;
	
//	@Mock
//	Contatore contatoreMock;

//	@Test
//	void testMultiplyBy() {
//		
//		
//		Contatore contatoreMock = mock(Contatore.class);
//		when(contatoreMock.getX()).thenReturn(3);
//		
//		int risultato = contatoreMock.multiplyBy();
//		
//		
//		assertEquals(15, risultato);
//		
//	}

	@Test
	  void multiplySuccessful() {
	    
	    Contatore counter = mock(Contatore.class);
	    when(counter.getX()).thenReturn(10);
	    
	    service = new ContatoreService(counter);
	    
	    assertEquals(30, service.multiplyBy(3));
	  }
	
}

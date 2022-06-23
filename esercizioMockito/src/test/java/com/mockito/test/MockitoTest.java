package com.mockito.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.mockito.Database;
import com.mockito.Service;

public class MockitoTest {

//	@Mock
//	private Database database;
	
	public static final int TEST_NUMBER = 4;
	
	@Test
	public void shouldReturnGivenValue() {
		Database database = mock(Database.class);
		when(database.getUniqueId()).thenReturn(TEST_NUMBER);
		
	}
	
	
	
	//Metodi Carmine
	@Test
	void isAvailableDatabase() {

		Database db = mock(Database.class);
		when(db.isAvailable()).thenReturn(true);

		Service service = new Service(db);

		assertTrue(service.query("test"));
		verify(db, times(1)).isAvailable();
	}

	@Test
	void notAvailableDatabase() {

		Database db = mock(Database.class);
		when(db.isAvailable()).thenReturn(false);

		Service service = new Service(db);

		assertFalse(service.query("test"));
		verify(db, times(1)).isAvailable();
	}

	@Test
	void getUniqueIdTest() {

		Database db = new Database();

		Service service = new Service(db);

		assertTrue(service.toString().equals("Using database with id: 42"));
	}

	@Test
	void wrongDatabase() {

		Database db = mock(Database.class);
		when(db.getUniqueId()).thenReturn(54);

		Service service = new Service(db);

		assertFalse(service.toString().equals("Using database with id: 42"));
	}
}

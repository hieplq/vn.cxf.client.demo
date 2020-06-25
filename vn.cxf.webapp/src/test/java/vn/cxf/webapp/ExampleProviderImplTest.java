package vn.cxf.webapp;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import vn.cxf.webapp.ExampleProviderImpl;

public class ExampleProviderImplTest {
	@Test
	public void simple() {
		ExampleProviderImpl impl = new ExampleProviderImpl();
		assertNotNull(impl);
	}

}

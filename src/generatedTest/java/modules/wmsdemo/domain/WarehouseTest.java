package modules.wmsdemo.domain;

import org.skyve.util.DataBuilder;
import org.skyve.util.test.SkyveFixture.FixtureType;
import util.AbstractDomainTest;

/**
 * Generated - local changes will be overwritten.
 * Extend {@link AbstractDomainTest} to create your own tests for this document.
 */
public class WarehouseTest extends AbstractDomainTest<Warehouse> {

	@Override
	protected Warehouse getBean() throws Exception {
		return new DataBuilder()
			.fixture(FixtureType.crud)
			.build(Warehouse.MODULE_NAME, Warehouse.DOCUMENT_NAME);
	}
}
package modules.wmsdemo.domain;

import org.skyve.util.DataBuilder;
import org.skyve.util.test.SkyveFixture.FixtureType;
import util.AbstractDomainTest;

/**
 * Generated - local changes will be overwritten.
 * Extend {@link AbstractDomainTest} to create your own tests for this document.
 */
public class ZoneTest extends AbstractDomainTest<Zone> {

	@Override
	protected Zone getBean() throws Exception {
		return new DataBuilder()
			.fixture(FixtureType.crud)
			.build(Zone.MODULE_NAME, Zone.DOCUMENT_NAME);
	}
}
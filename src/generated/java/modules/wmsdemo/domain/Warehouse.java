package modules.wmsdemo.domain;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlType;
import org.skyve.CORE;
import org.skyve.domain.messages.DomainException;
import org.skyve.impl.domain.AbstractPersistentBean;

/**
 * Warehouse
 * 
 * @stereotype "persistent"
 */
@XmlType
@XmlRootElement
@Generated(value = "org.skyve.impl.generate.OverridableDomainGenerator")
public class Warehouse extends AbstractPersistentBean {
	/**
	 * For Serialization
	 * @hidden
	 */
	private static final long serialVersionUID = 1L;

	/** @hidden */
	public static final String MODULE_NAME = "wmsdemo";

	/** @hidden */
	public static final String DOCUMENT_NAME = "Warehouse";

	/** @hidden */
	public static final String namePropertyName = "name";

	/** @hidden */
	public static final String codePropertyName = "code";

	/** @hidden */
	public static final String sortPropertyName = "sort";

	/**
	 * Name
	 **/
	private String name;

	/**
	 * Code
	 **/
	private String code;

	/**
	 * Sort
	 **/
	private Integer sort;

	@Override
	@XmlTransient
	public String getBizModule() {
		return Warehouse.MODULE_NAME;
	}

	@Override
	@XmlTransient
	public String getBizDocument() {
		return Warehouse.DOCUMENT_NAME;
	}

	public static Warehouse newInstance() {
		try {
			return CORE.getUser().getCustomer().getModule(MODULE_NAME).getDocument(CORE.getUser().getCustomer(), DOCUMENT_NAME).newInstance(CORE.getUser());
		}
		catch (RuntimeException e) {
			throw e;
		}
		catch (Exception e) {
			throw new DomainException(e);
		}
	}

	@Override
	@XmlTransient
	public String getBizKey() {
		try {
			return org.skyve.util.Binder.formatMessage("Warehouse - {name}", this);
		}
		catch (@SuppressWarnings("unused") Exception e) {
			return "Unknown";
		}
	}

	@Override
	public boolean equals(Object o) {
		return ((o instanceof Warehouse) && 
					this.getBizId().equals(((Warehouse) o).getBizId()));
	}

	/**
	 * {@link #name} accessor.
	 * @return	The value.
	 **/
	public String getName() {
		return name;
	}

	/**
	 * {@link #name} mutator.
	 * @param name	The new value.
	 **/
	@XmlElement
	public void setName(String name) {
		preset(namePropertyName, name);
		this.name = name;
	}

	/**
	 * {@link #code} accessor.
	 * @return	The value.
	 **/
	public String getCode() {
		return code;
	}

	/**
	 * {@link #code} mutator.
	 * @param code	The new value.
	 **/
	@XmlElement
	public void setCode(String code) {
		preset(codePropertyName, code);
		this.code = code;
	}

	/**
	 * {@link #sort} accessor.
	 * @return	The value.
	 **/
	public Integer getSort() {
		return sort;
	}

	/**
	 * {@link #sort} mutator.
	 * @param sort	The new value.
	 **/
	@XmlElement
	public void setSort(Integer sort) {
		preset(sortPropertyName, sort);
		this.sort = sort;
	}
}

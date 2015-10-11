package fr.keyconsulting.formation.model;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

public class DateTimeXmlAdapter extends XmlAdapter<String, DateTime> {
	@Override
	public DateTime unmarshal(String v) throws Exception {
		return ISODateTimeFormat.dateTime().parseDateTime(v);
	}

	@Override
	public String marshal(DateTime v) throws Exception {
		return ISODateTimeFormat.dateTime().print(v);
	}
}
package org.xson.deserializer;

import org.xson.ReaderModel;
import org.xson.XsonReader;

public class TimestampDeserializer implements XsonReader {
	@Override
	public Object read(ReaderModel model) {
		model.incrementIndex(1);
		java.sql.Timestamp returnValue = new java.sql.Timestamp(model.getLong());
		model.appendObject(returnValue);
		return returnValue;
	}
}
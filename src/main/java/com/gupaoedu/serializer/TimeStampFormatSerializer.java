package com.gupaoedu.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Establish on 2015/5/11.
 */
public class TimeStampFormatSerializer extends JsonSerializer<Date> {

    /**
     * 按照yyyy-MM-dd HH:mm:ss的格式序列号日期
     * @param date
     * @param jsonGenerator
     * @param serializerProvider
     * @throws IOException
     */
    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
    }

}
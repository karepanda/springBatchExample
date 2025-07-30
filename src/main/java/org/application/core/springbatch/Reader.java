package org.application.core.springbatch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class Reader implements ItemReader<String> {

    private String[] courses = {"Java Web Services","End to end Project","Angular"};
    private int count;

    @Override
    public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        if (count < courses.length) {
            return courses[count++];
        }else{
            count = 0; // Reset count for next read cycle
        }
        return "";
    }
}

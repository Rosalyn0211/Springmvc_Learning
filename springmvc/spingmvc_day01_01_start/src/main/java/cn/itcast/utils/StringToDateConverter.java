package cn.itcast.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Create By 96251 on 2020/4/4.
 */
public class StringToDateConverter implements Converter<String, Date>{

    @Override
    public Date convert(String s) {
        if(s==null){
            throw  new RuntimeException("请您传入数据");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        //把字符串转换成日期
        try {
            return df.parse(s);
        } catch (Exception e) {
            throw new RuntimeException("类型转换出错");
        }
    }
}

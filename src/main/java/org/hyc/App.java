package org.hyc;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello design patterns world!
 *
 * @author hyc
 */
public class App 
{
    public static void main( String[] args )
    {
        // 注意：如果字符串都是空格的话，
        String str1 = "       ";
        System.out.println(StringUtils.join("str1=\"   \" StringUtils.isEmpty:", StringUtils.isEmpty(str1)));
        System.out.println(StringUtils.join("str1=\"   \" StringUtils.isBlank:", StringUtils.isBlank(str1)));
        // 注意：如果字符串是空串的话，
        String str2 = "";
        System.out.println(StringUtils.join("str2=\"\" StringUtils.isEmpty:", StringUtils.isEmpty(str2)));
        System.out.println(StringUtils.join("str2=\"\" StringUtils.isBlank:", StringUtils.isBlank(str2)));

        // 注意：如果字符串是null的话，
        String str3 = null;
        System.out.println(StringUtils.join("str3=null StringUtils.isEmpty:", StringUtils.isEmpty(str3)));
        System.out.println(StringUtils.join("str3=null StringUtils.isBlank:", StringUtils.isBlank(str3)));

        System.out.println( "----------------------------------" );

        if(StringUtils.isNotBlank(str1)) {
            System.out.println(StringUtils.join("str1 有可打印字符"));
        }
        else {
            System.out.println(StringUtils.join("str1 没有可打印字符"));
        }

        if(StringUtils.isNotBlank(str2)) {
            System.out.println(StringUtils.join("str2 有可打印字符"));
        }
        else {
            System.out.println(StringUtils.join("str2 没有可打印字符"));
        }

        if(StringUtils.isNotBlank(str3)) {
            System.out.println(StringUtils.join("str3 有可打印字符"));
        }
        else {
            System.out.println(StringUtils.join("str3 没有可打印字符"));
        }

        System.out.println( "----------------------------------" );

        // 字符串固定长度 8位，若不足，往左补 0
        String str4 = "3010X";
        System.out.printf("000%s", str4);
        System.out.println();
        System.out.println(String.format("000%s", str4));
        System.out.println(StringUtils.leftPad(str4, 8, "0"));

        System.out.println( "----------------------------------" );

        System.out.println(StringUtils.replace("aba", "a", "z"));
        System.out.println(StringUtils.replaceOnce("aba", "a", "z"));

        System.out.println( "----------------------------------" );

        System.out.println(StringUtils.join("abc", "def"));

        System.out.println( "----------------------------------" );

        String[] strArray = StringUtils.splitByCharacterTypeCamelCase("getSomethingByID");
        for (String s : strArray) {
            System.out.println(s);
        }

        System.out.println( "Hello World!" );
    }
}

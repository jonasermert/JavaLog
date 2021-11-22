package com.jonasermert;

import java.util.List;

class CsvWriter {

    public static final String END_LINE = "\n";

    public static String getString(List<String> strings) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < strings.size(); i++) {
            sb.append("\"");
            sb.append(strings.get(i));
            sb.append("\"");

            if(i < strings.size() - 1) sb.append(",");
        }

        return sb.toString();
    }

    public static String getStringAsLine(List<String> strings) {
        return getString(strings) + END_LINE;
    }

}
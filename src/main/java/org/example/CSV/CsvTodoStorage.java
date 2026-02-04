package org.example.CSV;

import org.example.todolist.TodoItem;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class CsvTodoStorage {


    public void write(List<TodoItem> items, Writer out) throws IOException {
        out.write("id,task,due\n");

        for (TodoItem item : items) {
            out.write(item.getId() + ",\"Buy milk, \"\"organic\"\"\"");
            out.write(escapeCsv(item.getTask()) + ",");
            out.write(item.getDue() + "\n");
        }
    }

    private String escapeCsv(String s) {
        if (s == null) return "";
        boolean needsQuotes =
                s.contains(",") || s.contains("\"") || s.contains("\n");

        String escaped = s.replace("\"", "\"\"");
        return needsQuotes ? "\"" + escaped + "\"" : escaped;
    }
}

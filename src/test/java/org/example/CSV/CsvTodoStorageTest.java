package org.example.CSV;

import org.example.CSV.CsvTodoStorage;
import org.example.todolist.TodoItem;
import org.junit.jupiter.api.Test;

import java.io.StringWriter;
import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class CsvTodoStorageTest {

    @Test
    void savesTodosAsCsvWithIdTaskAndDue() throws Exception {
        List<TodoItem> items = List.of(
                new TodoItem(1, "Buy milk", LocalDate.of(2026, 1, 20)),
                new TodoItem(2, "Bread", LocalDate.of(2026, 1, 21))
        );

        CsvTodoStorage storage = new CsvTodoStorage();
        StringWriter out = new StringWriter();

        storage.write(items, out);

        assertThat(out.toString()).isEqualTo(
                "id,task,due\n" +
                        "1,Buy milk,2026-01-20\n" +
                        "2,Bread,2026-01-21\n"
        );
    }
    @Test
    void savesTaskWithCommaAndQuotesUsingCsvEscaping() throws Exception {
        List<TodoItem> items = List.of(
                new TodoItem(1, "Buy milk, \"organic\"", LocalDate.of(2026, 1, 20))
        );

        CsvTodoStorage storage = new CsvTodoStorage();
        StringWriter out = new StringWriter();

        storage.write(items, out);

        assertThat(out.toString()).isEqualTo(
                "id,task,due\n" +
                        "1,\"Buy milk, \"\"organic\"\"\",2026-01-20\n"
        );
    }
}

import org.example.todolist.TodoItem;

import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

import static java.nio.file.Files.write;

public void saveToFile(List<TodoItem> items, Path path) throws Exception {
    try (BufferedWriter writer =
                 Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
        write(items, writer);
    }
}

private void write(List<TodoItem> items, BufferedWriter writer) {
}

void main() {

}

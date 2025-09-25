package dev.jigish.todo.api;
import dev.jigish.todo.model.Task;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final Map<Long, Task> store = new LinkedHashMap<>();
    private final AtomicLong seq = new AtomicLong(1);

    @GetMapping public Collection<Task> all(){ return store.values(); }

    @PostMapping public Task create(@RequestBody Task in){
        long id = seq.getAndIncrement();
        Task t = new Task(id, in.getTitle());
        store.put(id, t);
        return t;
    }

    @PutMapping("/{id}") public Task update(@PathVariable long id, @RequestBody Task in){
        Task t = store.get(id);
        if (t==null) throw new RuntimeException("Not found");
        if (in.getTitle()!=null) t.setTitle(in.getTitle());
        t.setDone(in.isDone());
        return t;
    }

    @DeleteMapping("/{id}") public void delete(@PathVariable long id){ store.remove(id); }
}

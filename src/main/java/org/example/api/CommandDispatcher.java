package org.example.api;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class CommandDispatcher {
    private final Map<String, CommandHandler> handlers = new HashMap<>();
    private final Map<String, Function<String[], String>> queries = new HashMap<>();

    public interface CommandHandler {
        void handle(String[] args);
    }

    public void registerCommand(String name, CommandHandler handler) {
        handlers.put(name, handler);
    }

    public void registerQuery(String name, Function<String[], String> query) {
        queries.put(name, query);
    }

    public void dispatch(String commandName, String[] args) {
        CommandHandler handler = handlers.get(commandName);
        if (handler != null) {
            handler.handle(args);
        } else {
            System.out.println("Unknown command: " + commandName);
        }
    }

    public String query(String queryName, String[] args) {
        Function<String[], String> query = queries.get(queryName);
        if (query != null) {
            return query.apply(args);
        } else {
            return "Unknown query: " + queryName;
        }
    }
}
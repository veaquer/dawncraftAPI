package org.example.api;

import java.util.HashMap;
import java.util.Map;

public class CommandDispatcher {
    private final Map<String, CommandHandler> handlers = new HashMap<>();

    public interface CommandHandler {
        void handle(String[] args);
    }

    public void registerCommand(String name, CommandHandler handler) {
        handlers.put(name, handler);
    }

    public void dispatch(String commandName, String[] args) {
        CommandHandler handler = handlers.get(commandName);
        if (handler != null) {
            handler.handle(args);
        } else {
            System.out.println("Unknown command: " + commandName);
        }
    }
}
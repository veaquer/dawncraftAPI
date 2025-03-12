package com.github.veaquer.api;

import org.lwjgl.glfw.GLFW;

public enum MouseState {
    DISABLED(GLFW.GLFW_CURSOR_DISABLED),
    ENABLED(GLFW.GLFW_CURSOR_NORMAL);

    private final int mouseState;

    MouseState(int mouseState) {
        this.mouseState = mouseState;
    }

    public int getMouseState() {
        return mouseState;
    }

    public static MouseState fromString(String name) {
        try {
            return MouseState.valueOf(name.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}

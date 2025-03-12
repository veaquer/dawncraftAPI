package com.github.veaquer.api;

import org.lwjgl.glfw.GLFW;

public enum MouseState {
    DISABLED(GLFW.GLFW_CURSOR_DISABLED),
    ENABLED(GLFW.GLFW_CURSOR_NORMAL);

    private final int glfwKey;

    MouseState(int glfwKey) {
        this.glfwKey = glfwKey;
    }

    public int getGlfwKey() {
        return glfwKey;
    }

    public static GlfwKey fromString(String name) {
        try {
            return GlfwKey.valueOf(name.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}

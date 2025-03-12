package com.github.veaquer.api;

import lombok.Getter;
import org.lwjgl.glfw.GLFW;

public enum GlfwKey {
    A(GLFW.GLFW_KEY_A),
    B(GLFW.GLFW_KEY_B),
    C(GLFW.GLFW_KEY_C),
    D(GLFW.GLFW_KEY_D),
    E(GLFW.GLFW_KEY_E),
    F(GLFW.GLFW_KEY_F),
    G(GLFW.GLFW_KEY_G),
    H(GLFW.GLFW_KEY_H),
    I(GLFW.GLFW_KEY_I),
    J(GLFW.GLFW_KEY_J),
    K(GLFW.GLFW_KEY_K),
    L(GLFW.GLFW_KEY_L),
    M(GLFW.GLFW_KEY_M),
    N(GLFW.GLFW_KEY_N),
    O(GLFW.GLFW_KEY_O),
    P(GLFW.GLFW_KEY_P),
    Q(GLFW.GLFW_KEY_Q),
    R(GLFW.GLFW_KEY_R),
    S(GLFW.GLFW_KEY_S),
    T(GLFW.GLFW_KEY_T),
    U(GLFW.GLFW_KEY_U),
    V(GLFW.GLFW_KEY_V),
    W(GLFW.GLFW_KEY_W),
    X(GLFW.GLFW_KEY_X),
    Y(GLFW.GLFW_KEY_Y),
    Z(GLFW.GLFW_KEY_Z),
    SPACE(GLFW.GLFW_KEY_SPACE),
    ESCAPE(GLFW.GLFW_KEY_ESCAPE),
    ENTER(GLFW.GLFW_KEY_ENTER),
    SHIFT(GLFW.GLFW_KEY_LEFT_SHIFT),
    CTRL(GLFW.GLFW_KEY_LEFT_CONTROL),
    ALT(GLFW.GLFW_KEY_LEFT_ALT),
    PRESS(GLFW.GLFW_PRESS),
    RELEASE(GLFW.GLFW_RELEASE);

    private final int glfwKey;

    GlfwKey(int glfwKey) {
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
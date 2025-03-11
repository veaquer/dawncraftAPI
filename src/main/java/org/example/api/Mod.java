package org.example.api;

public interface Mod {
    void onInit(CommandDispatcher dispatcher);
    void onUpdate(Float delta);
    void onRender();
}

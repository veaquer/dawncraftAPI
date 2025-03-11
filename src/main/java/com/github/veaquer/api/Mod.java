package com.github.veaquer.api;

public interface Mod {
    void onInit(CommandDispatcher dispatcher);
    void onUpdate(Float delta);
    void onRender();
}

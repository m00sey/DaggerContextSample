// Code generated by dagger-compiler.  Do not edit.
package com.example.daggersampleapp;


import dagger.internal.ModuleAdapter;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class DSAModule$$ModuleAdapter extends ModuleAdapter<DSAModule> {
  private static final String[] INJECTS = { "members/com.example.daggersampleapp.MainActivity", };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { };

  public DSAModule$$ModuleAdapter() {
    super(INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, true /*complete*/, false /*library*/);
  }

  @Override
  protected DSAModule newModule() {
    return new com.example.daggersampleapp.DSAModule();
  }
}

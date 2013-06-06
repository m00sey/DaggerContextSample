// Code generated by dagger-compiler.  Do not edit.
package com.example.daggersampleapp;


import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binder<ArmService>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 * 
 * Owning the dependency links between {@code ArmService} and its
 * dependencies.
 * 
 * Being a {@code Provider<ArmService>} and handling creation and
 * preparation of object instances.
 * 
 * Being a {@code MembersInjector<ArmService>} and handling injection
 * of annotated fields.
 */
public final class ArmService$$InjectAdapter extends Binding<ArmService>
    implements Provider<ArmService>, MembersInjector<ArmService> {
  private Binding<android.content.Context> context;

  public ArmService$$InjectAdapter() {
    super("com.example.daggersampleapp.ArmService", "members/com.example.daggersampleapp.ArmService", IS_SINGLETON, ArmService.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    context = (Binding<android.content.Context>) linker.requestBinding("@com.example.daggersampleapp.ForApplication()/android.content.Context", ArmService.class);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(context);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<ArmService>}.
   */
  @Override
  public ArmService get() {
    ArmService result = new ArmService();
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<ArmService>}.
   */
  @Override
  public void injectMembers(ArmService object) {
    object.context = context.get();
  }
}
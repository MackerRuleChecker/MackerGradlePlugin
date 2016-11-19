package site.macker;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class MackerGradlePlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getExtensions().create("mackerSettings", MackerGradlePluginExtension.class);
        project.getTasks().create("macker", MackerGradleTask.class);
    }
}

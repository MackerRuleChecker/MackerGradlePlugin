package site.macker;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class MackerGradleTask extends DefaultTask {
    @TaskAction
    public void printInfo() {
        MackerGradlePluginExtension extension = getProject().getExtensions().findByType(MackerGradlePluginExtension.class);
        if (extension == null) {
            extension = new MackerGradlePluginExtension();
        }
        String info = extension.getInfo();
        System.out.println(info);
    }
}

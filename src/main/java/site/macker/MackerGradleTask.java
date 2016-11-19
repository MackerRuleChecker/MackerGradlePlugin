package site.macker;

import java.io.File;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.file.FileCollection;


public class MackerGradleTask extends DefaultTask {
    String info = "MackerGradleTask info";

    @TaskAction
    public void printInfo() {
        MackerGradlePluginExtension extension = getProject().getExtensions().findByType(MackerGradlePluginExtension.class);
        if (extension == null) {
            extension = new MackerGradlePluginExtension();
        }
        String info = extension.getInfo();
        boolean ignoreFailures = extension.getIgnoreFailures();
        //File configFile = extension.getConfigFile();
        //FileCollection sourceFiles = extension.getSourceFiles();
        System.out.println("info:"+info);
        System.out.println("ignoreFailures:"+ignoreFailures);
    }
}

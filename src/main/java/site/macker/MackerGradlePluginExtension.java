package site.macker;

public class MackerGradlePluginExtension {
    private String info = "MackerGradlePlugin - http://www.macker.site/";
    private boolean ignoreFailures = false;
    //private FileCollection sourceFiles;
    //private File configFile;

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public boolean getIgnoreFailures() {
        return this.ignoreFailures;
    }

    public void setIgnoreFailures(boolean ignoreFailures) {
        this.ignoreFailures = ignoreFailures;
    }

    /*
    public FileCollection getSourceFiles() {
        return this.sourceFiles;
    }

    public void setSourceFiles(FileCollection sourceFiles) {
        this.sourceFiles = sourceFiles;
    }

    public File getConfigFile() {
        return this.configFile;
    }

    public void setConfigFile(File configFile) {
        this.configFile = configFile;
    }*/
}

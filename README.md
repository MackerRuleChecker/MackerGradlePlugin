# MackerGradlePlugin
[Macker](https://github.com/MackerRuleChecker/Macker) as a Gradle-Plugin.

Macker helps enforce architectural rules (layering, tiering, modularity, etc) in your Java code. It applies pattern-based access rules from XML rules files to your compiled classes.

## Getting Started

1. Checkout this repository
```
git clone git@github.com:MackerRuleChecker/MackerGradlePlugin.git
```

2. Change into the repository
```
cd MackerGradlePlugin
```

3. Initialize git submodules
```
git submodule init
git submodule update
```


## Usage in your Gradle-based Java-Project

1. Set the repository in your build.gradle
```
reopsitory {
        mavenCentral()
}
```

2. Apply the plugin
```
apply: 'macker-rule-checker'
```

3. Configure the plugin
```gradle
macker{
        property=value
}
```

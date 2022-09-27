package com.head.first;

import com.head.first.file_system.File;
import com.head.first.file_system.Folder;

public class App {
    
    public static void main(String[] args) {
        var root = new Folder("root");
        var dev = new Folder("dev");
        var java = new Folder("java");
        var dotnet = new Folder("dotnet");
        root.add(dev);
        root.add(java);
        root.add(dotnet);
        var dockerCompose = new File("docker-compose", "yaml");
        dev.add(dockerCompose);
        dotnet.add(new File("Program", "cs"));
        java.add(new File("Main", "java"));
        var database = new Folder("database");
        java.add(database);
        database.add(new File("HibernateConfig", "java"));
        database.add(new File("Persistence", "xml"));
        var iterator = root.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}

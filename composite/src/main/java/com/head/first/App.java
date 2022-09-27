package com.head.first;

import com.head.first.yaml.YamlSection;
import com.head.first.yaml.YamlSectionItem;

public class App {
    
    public static void main(String[] args) {
        var yaml = new YamlSection("", null, "");
        yaml.addComponent(new YamlSectionItem(null, "apiVersion", "apps/v1", ""));
        yaml.addComponent(new YamlSectionItem(null, "kind", "Deployment", ""));
        var metadata1 = new YamlSection("metadata", null, "");
        metadata1.addComponent(new YamlSectionItem(metadata1, "name", "pod-composite", ""));
        yaml.addComponent(metadata1);
        var spec = new YamlSection("spec", null, "");
        spec.addComponent(new YamlSectionItem(spec, "replicas", "3", ""));
        var selector = new YamlSection("selector", spec, "");
        spec.addComponent(selector);
        var matchLabels = new YamlSection("matchLabels", selector, "");
        selector.addComponent(matchLabels);
        matchLabels.addComponent(new YamlSectionItem(matchLabels, "app", "composite", ""));
        yaml.addComponent(spec);
        var template = new YamlSection("template", spec, "");
        spec.addComponent(template);
        var metadata2 = new YamlSection("metadata", template, "");
        template.addComponent(metadata2);
        var labels = new YamlSection("labels", metadata2, "");
        metadata2.addComponent(labels);
        labels.addComponent(new YamlSectionItem(labels, "app", "composite", ""));
        var spec2 = new YamlSection("spec", template, "");
        template.addComponent(spec2);
        var containers = new YamlSection("containers", spec2, "");
        spec2.addComponent(containers);
        containers.addComponent(new YamlSectionItem(containers, "name", "composite-container", "- "));
        containers.addComponent(new YamlSectionItem(containers, "image", "registry-container:5000/composite:v0.1", ""));
        containers.addComponent(new YamlSectionItem(containers, "imagePullPolicy", "Always", ""));
        var resources = new YamlSection("resources", containers, "");
        containers.addComponent(resources);
        var limits = new YamlSection("limits", resources, "");
        resources.addComponent(limits);
        limits.addComponent(new YamlSectionItem(limits, "memory", "128Mi", ""));
        limits.addComponent(new YamlSectionItem(limits, "cpu", "250m", ""));
        var ports = new YamlSection("ports", containers, "");
        containers.addComponent(ports);
        ports.addComponent(new YamlSectionItem(ports, "containerPort", "80", "- "));
        var envFrom = new YamlSection("envFrom", containers, "");
        containers.addComponent(envFrom);
        var configMapRef = new YamlSection("configMapRef", envFrom, "- ");
        envFrom.addComponent(configMapRef);
        configMapRef.addComponent(new YamlSectionItem(configMapRef, "name", "cfmap-composite", ""));
        System.out.println(yaml.print(" "));
    }
}

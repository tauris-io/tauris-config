package io.tauris.config.parser;

import io.tauris.config.TPlugin;
import io.tauris.config.TPluginFactory;
import io.tauris.config.TPluginGroup;
import io.tauris.config.TConfigException;
import io.tauris.config.TPluginResolver;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zhanglei
 */
public class PluginGroup {
    private final String       typeName;
    private final List<Plugin> plugins;

    private Assignments assignments;

    public PluginGroup(String typeName, List<Plugin> plugins, Assignments assignments) {
        this.typeName = typeName;
        this.plugins = plugins;
        this.assignments = assignments;
    }

    public String typeName() {
        return typeName;
    }

    public TPluginGroup build(Class<? extends TPluginGroup> groupClass) {
        TPluginFactory factory = TPluginResolver.resolver().resolvePluginFactory(typeName);
        Helper.m.text(typeName).expand("{").next();
        List<TPlugin> plugins = this.plugins.stream().map(plugin -> plugin.build(factory)).collect(Collectors.toList());
        try {
            TPluginGroup g = groupClass.getConstructor(List.class).newInstance(plugins);
            this.assignments.assignTo(g);
            String pid = PluginId.generateId(typeName + "_group");
            if (g.id() == null) {
                g.setId(pid);
                Helper.m.collapse("} //id: " + pid).next();
            } else {
                Helper.m.collapse("}").next();
            }
            return g;
        } catch (TConfigException e) {
            throw e;
        } catch (Exception e){
            throw new IllegalArgumentException("invalid group class '" + groupClass.getName() + "', cause by " + e.getMessage());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PluginGroup aClass = (PluginGroup) o;

        if (typeName != null ? !typeName.equals(aClass.typeName) : aClass.typeName != null) return false;
        return plugins != null ? plugins.equals(aClass.plugins) : aClass.plugins == null;
    }

    @Override
    public int hashCode() {
        int result = typeName != null ? typeName.hashCode() : 0;
        result = 31 * result + (plugins != null ? plugins.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\t\ttype='" + typeName + '\'' + "\n" +
                "\t\tplugins=" + plugins + "\n" +
                '}';
    }
}

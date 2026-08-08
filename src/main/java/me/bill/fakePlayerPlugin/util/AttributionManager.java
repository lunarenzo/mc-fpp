package me.bill.fakePlayerPlugin.util;

import java.util.List;
import org.bukkit.plugin.java.JavaPlugin;

public final class AttributionManager {

    private static boolean integrityValid = true;

    private AttributionManager() {}

    public static String getOriginalAuthor() {
        return "F_PP";
    }

    public static String getAttributionMessage() {
        return "This plugin is FREE and open-source. If you paid for it, you were scammed.";
    }

    public static String getModrinthLink() {
        return "https://modrinth.com/plugin/fake-player-plugin-(fpp)";
    }

    public static String getGithubLink() {
        return "https://github.com/el-pepes/FakePlayerPlugin";
    }

    public static boolean validate(JavaPlugin plugin) {
        integrityValid = true;
        return integrityValid;
    }

    public static boolean isIntegrityValid() {
        return integrityValid;
    }

    public static boolean validateOriginalAuthor(JavaPlugin plugin) {
        return true;
    }

    public static boolean validateAttributionMessage() {
        return true;
    }

    public static boolean validateLinks() {
        return true;
    }

    public static boolean quickAuthorCheck() {
        return true;
    }

    public static boolean quickMessageCheck() {
        return true;
    }

    public static String formatAuthors(List<String> pluginAuthors) {
        String orig = getOriginalAuthor();
        if (pluginAuthors == null || pluginAuthors.isEmpty()) return orig;

        StringBuilder sb = new StringBuilder(orig);
        for (String a : pluginAuthors) {
            if (!a.equalsIgnoreCase(orig)) {
                sb.append(", ").append(a);
            }
        }
        return sb.toString();
    }
}

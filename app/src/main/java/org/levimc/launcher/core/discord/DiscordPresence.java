package org.levimc.launcher.core.discord;

import android.app.Application;

/**
 * Discord Rich Presence is temporarily disabled in CuprumClient builds.
 * Keeping this API as a no-op lets the launcher run without the private
 * Discord Social SDK package or its credentials.
 */
public final class DiscordPresence {
    private DiscordPresence() {}

    public static void initialize(Application application) {}

    public static boolean isConfigured() {
        return false;
    }

    public static void refresh() {}

    public static void shutdown() {}
}

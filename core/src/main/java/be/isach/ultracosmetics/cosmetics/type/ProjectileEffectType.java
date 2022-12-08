package be.isach.ultracosmetics.cosmetics.type;

import be.isach.ultracosmetics.cosmetics.Category;
import be.isach.ultracosmetics.cosmetics.projectileeffects.ProjectileEffect;
import be.isach.ultracosmetics.cosmetics.projectileeffects.ProjectileEffectBasicTrail;
import be.isach.ultracosmetics.cosmetics.projectileeffects.ProjectileEffectChristmas;
import be.isach.ultracosmetics.cosmetics.projectileeffects.ProjectileEffectHelix;
import be.isach.ultracosmetics.cosmetics.projectileeffects.ProjectileEffectNote;
import be.isach.ultracosmetics.cosmetics.projectileeffects.ProjectileEffectRainbow;
import be.isach.ultracosmetics.util.Particles;

import com.cryptomorin.xseries.XMaterial;

public class ProjectileEffectType extends CosmeticParticleType<ProjectileEffect> {

    public ProjectileEffectType(String configName, int repeatDelay, Particles effect, XMaterial material, Class<? extends ProjectileEffect> clazz, boolean supportsParticleMultiplier) {
        this(configName, repeatDelay, effect, material, clazz);
    }

    public ProjectileEffectType(String configName, int repeatDelay, Particles effect, XMaterial material, Class<? extends ProjectileEffect> clazz) {
        super(Category.PROJECTILE_EFFECTS, configName, repeatDelay, effect, material, clazz, false);
    }

    public static void register() {
        // Rainbow Trail
        new ProjectileEffectType("Rainbow", 1, Particles.REDSTONE, XMaterial.LIME_WOOL, ProjectileEffectRainbow.class);

        // Christmas Trail
        new ProjectileEffectType("Christmas", 1, Particles.REDSTONE, XMaterial.SNOW_BLOCK, ProjectileEffectChristmas.class);

        // Helix Trails
        new ProjectileEffectType("RedstoneHelix", 1, Particles.REDSTONE, XMaterial.REDSTONE_BLOCK, ProjectileEffectHelix.class);
        new ProjectileEffectType("FlameHelix", 1, Particles.FLAME, XMaterial.FIRE_CHARGE, ProjectileEffectHelix.class);
        new ProjectileEffectType("CursedHelix", 1, Particles.SPELL_WITCH, XMaterial.PURPLE_WOOL, ProjectileEffectHelix.class);

        // Basic Trails
        new ProjectileEffectType("Spark", 1, Particles.FIREWORKS_SPARK, XMaterial.FIREWORK_ROCKET, ProjectileEffectBasicTrail.class);
        new ProjectileEffectType("Redstone", 1, Particles.REDSTONE, XMaterial.REDSTONE, ProjectileEffectBasicTrail.class);
        new ProjectileEffectType("Flame", 1, Particles.FLAME, XMaterial.TORCH, ProjectileEffectBasicTrail.class);
        new ProjectileEffectType("Water", 1, Particles.WATER_SPLASH, XMaterial.WATER_BUCKET, ProjectileEffectBasicTrail.class);
        new ProjectileEffectType("Witch", 1, Particles.SPELL_WITCH, XMaterial.BREWING_STAND, ProjectileEffectBasicTrail.class);
        new ProjectileEffectType("Emerald", 1, Particles.VILLAGER_HAPPY, XMaterial.EMERALD, ProjectileEffectBasicTrail.class);
        new ProjectileEffectType("Note", 2, Particles.NOTE, XMaterial.NOTE_BLOCK, ProjectileEffectNote.class);
        new ProjectileEffectType("Love", 2, Particles.HEART, XMaterial.PINK_WOOL, ProjectileEffectBasicTrail.class);
        new ProjectileEffectType("Lava", 1, Particles.LAVA, XMaterial.LAVA_BUCKET, ProjectileEffectBasicTrail.class);
        new ProjectileEffectType("Snow", 1, Particles.SNOWBALL, XMaterial.SNOWBALL, ProjectileEffectBasicTrail.class);
        new ProjectileEffectType("Slime", 1, Particles.SLIME, XMaterial.SLIME_BALL, ProjectileEffectBasicTrail.class);
        new ProjectileEffectType("Crit", 1, Particles.CRIT, XMaterial.IRON_SWORD, ProjectileEffectBasicTrail.class);
        new ProjectileEffectType("MagicCrit", 1, Particles.CRIT_MAGIC, XMaterial.DIAMOND_SWORD, ProjectileEffectBasicTrail.class);
        new ProjectileEffectType("Explosion", 5, Particles.EXPLOSION_HUGE, XMaterial.TNT, ProjectileEffectBasicTrail.class);
        new ProjectileEffectType("Cloud", 1, Particles.CLOUD, XMaterial.WHITE_WOOL, ProjectileEffectBasicTrail.class);
        new ProjectileEffectType("Smoke", 1, Particles.SMOKE_NORMAL, XMaterial.GRAY_WOOL, ProjectileEffectBasicTrail.class);
        new ProjectileEffectType("Portal", 1, Particles.PORTAL, XMaterial.OBSIDIAN, ProjectileEffectBasicTrail.class);
    }
}

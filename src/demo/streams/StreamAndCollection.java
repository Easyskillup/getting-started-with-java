package demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAndCollection {
    static List<String> getNames() {
        return Arrays.asList(
                // Gaming & Competitive
                "PixelPhantom", "NoScopeNinja", "ClutchKing", "FragStorm", "ReloadRanger", "GameOverlord", "VictoryFrenzy", "EpicEliminator", "StealthVortex", "ShadowStriker", "TurboTakedown", "LagHunter", "AimAssassin", "HitboxHero", "QuestCrusher", "BossBattler", "CritCraze", "RespawnReaper", "LootLegend", "GameGladiator",
                // Tech & Coding
                "CodeCrafter", "BinaryBard", "DebugDruid", "SyntaxSlayer", "ByteMage", "StackOverflown", "DevDomino", "ConsoleKnight", "HackHive", "AlgoPirate", "GitGuardian", "CompileLord", "JavaJuggernaut", "PythonPunk", "CloudNinja", "RAMRaider", "CodeRocket", "APIVortex", "ScriptSmith", "KernelKraken",
                // Futuristic & Sci-Fi
                "NeonNova", "CyberDrift", "GalaxyPulse", "SynthSpecter", "QuantumBlade", "AstroRift", "DataEcho", "HyperLancer", "Starcode", "IonWarp", "ExoCipher", "VortexWarden", "PlasmaKnight", "PixelNebula", "MechaMancer", "CircuitGhost", "RetroBot", "StellarSpectra", "GlitchOrbit", "NexusUnit",
                // Edgy & Cool
                "BlazeStorm", "IceVenom", "DarkPulse", "VenomShock", "InfernoCore", "VoidWalker", "BloodByte", "RebelPhase", "CrypticSoul", "FrostBurn", "RazorFang", "PulseWraith", "PhantomVibe", "GrimFlux", "ArcBlade", "ToxicNova", "MidnightEcho", "DeathCode", "BlackJester", "StaticChaos",
                // Creative & Chill
                "ChillPixel", "SketchSprint", "LoFiCoder", "StreamMuse", "DreamForge", "ZenFrame", "CozyCircuit", "MagicCanvas", "MellowHack", "NovaNotes", "ArtLoop", "VibeCaster", "SmoothBit", "ChillCoder", "MuseRunner", "EchoVerse", "Moonbyte", "ChillNova", "DreamScripter", "BeatBuffer",
                // Nature-Inspired
                "OakByte", "RiverFlow", "StormWhisper", "FrostFang", "WildWisp", "EmberLeaf", "ShadowSprout", "SkyBreeze", "MysticPine", "LunarBlossom", "ThunderTide", "CloudWhale", "Firefern", "StormEcho", "QuartzFox", "GlacierWing", "DuskRaven", "SunBloom", "ForestHack", "DriftLeaf",
                // Java-specific
                "JavaWhiz", "JavaBytes", "JustInJava", "StreamOfJava", "JavaNexus", "CodeInJava", "JavaUnleashed", "JavaInfinite", "JavaCrafter", "HelloJava", "JavaDecoded", "JavaEdge", "PureJava", "TheJavaZone", "JavaLoopLive", "JavaSage", "CoffeeWithJava", "JavaTinker", "JavaWhirl", "TheJavaGuy", "JavaFuel", "DeepJava");
    }

    public static void main(String[] args) {
        List<String> names = getNames();

//      Filter all names containing Java and return it as a list
        List<String> filteredNames = names.stream().filter(name -> name.toLowerCase()
                .contains("java")).sorted().collect(Collectors.toList());
        //.toList();

//        Filter all names containing Java
//        names.stream().filter(name -> name.toLowerCase()
//                .contains("java")).sorted().forEach(name -> System.out.println(name));

//        Sort and print
//        names.stream().sorted().limit(20).forEach(name -> System.out.println(name));

//        printing all elements
//        names.stream().forEach(name -> System.out.print(name + " "));

    }

}

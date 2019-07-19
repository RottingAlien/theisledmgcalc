package rottingalien.theisle.dmgcalc;

public class Carnotaurus {

    private static String name = "Carnotaurus";

    private static DinoStats freshJuvi = new DinoStats(
            "Fresh Juvi",
            30,
            10,
            50,
            100,
            150,
            120,
            50,
            15
    );

    public static String getName() {
        return name;
    }

    public static DinoStats getFreshJuvi() {
        return freshJuvi;
    }
}
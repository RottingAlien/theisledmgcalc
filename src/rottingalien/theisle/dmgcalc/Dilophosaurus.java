package rottingalien.theisle.dmgcalc;

public class Dilophosaurus {

    private static String name = "Dilophosaurus";

    public static DinoStats freshJuvi = new DinoStats(
            "Fresh Juvi",
            50,
            25,
            80,
            100,
            150,
            250,
            27,
            20
    );

    public static String getName() {
        return name;
    }

    public static DinoStats getFreshJuvi() {
        return freshJuvi;
    }
}

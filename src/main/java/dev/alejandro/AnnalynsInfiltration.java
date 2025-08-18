package dev.alejandro;

public class AnnalynsInfiltration {

    // Se puede atacar rápido solo si el archer está dormido
    public static boolean canFastAttack(boolean knightIsAwake) {
        // Nota: en tu plantilla se pasa knightIsAwake, pero según la historia rápida, el ataque depende de la guardia/archer.
        return !knightIsAwake; 
    }

    // Se puede espiar si algún personaje está despierto
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    // Se puede señalizar al prisionero si él está despierto y el archer dormido
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake && !archerIsAwake;
    }

    // Se puede liberar al prisionero si el archer está dormido y además tenemos al perro o el prisionero está despierto
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake,
            boolean petDogIsPresent) {
        return !archerIsAwake && (petDogIsPresent || !knightIsAwake && prisonerIsAwake);
    }
}
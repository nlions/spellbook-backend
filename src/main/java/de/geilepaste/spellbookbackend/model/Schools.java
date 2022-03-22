package de.geilepaste.spellbookbackend.model;

/**
 * Enum to hold all available spell schools
 */
public enum Schools {

    ABJURATION,
    CONJURATION,
    DIVINATION,
    ENCHANTMENT,
    EVOCATION,
    ILLUSION,
    NECROMANCY,
    TRANSMUTATION;

    public String getSchoolName() {
        return this.name().toLowerCase();
    }
}

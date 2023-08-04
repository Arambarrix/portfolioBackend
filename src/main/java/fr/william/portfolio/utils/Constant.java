package fr.william.portfolio.utils;

import java.util.Objects;

public final class Constant {
    public static <T> T changeValueWeak(T ancien, T nouveau) {
        return nouveau != null ? nouveau : ancien;
    }

    /**
     * Cette méthode permet de changer une valeur de manière forte.
     * Si la nouvelle valeur est nulle, la méthode conserve la valeur actuelle (ancienne).
     * Si la nouvelle valeur est identique à l'ancienne, la méthode lance une exception avec le message approprié.
     * Sinon, la nouvelle valeur est renvoyée.
     *
     * @param ancien La valeur actuelle.
     * @param nouveau La nouvelle valeur.
     * @return La valeur modifiée (nouveau ou ancien).
     * @throws RuntimeException Si la nouvelle valeur est identique à l'ancienne.
     */
    public static <T> T changeValueStrong(T ancien, T nouveau) {
        return nouveau != null ? Objects.equals(nouveau, ancien) ? throwException("Il ne doit pas y avoir de similarité") : nouveau : ancien;
    }

    private static <T> T throwException(String message) {
        throw new RuntimeException(message);
    }
}

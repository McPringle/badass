/*
 *  Created by Jarek Ratajski
 */
package pl.setblack.badass;

import java.util.concurrent.Callable;

/**
 * Politician job is to not always present things as they really are.
 *
 * @author jarekratajski
 */
public class Politician {

    /**
     * If exception happens during callable automatically wrap it in
     * RuntimeException.
     *
     */
    public static <R> R beatAroundTheBush(Callable<R> callable) {
        try {
            return callable.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * If exception happens during callable automatically wrap it in
     * RuntimeException.
     *
     * If exception does not return value it may be needed to Cast it to
     * Valueless. Othrwise compiler may have problem determining return type.
     */
    public static void beatAroundTheBush(Valueless callable) {
        try {
            callable.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

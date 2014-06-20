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
}

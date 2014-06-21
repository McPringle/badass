/*
 *  Created by Jarek Ratajski
 */
package pl.setblack.badass;

/**
 * Interface simillar to callable but without return type.
 *
 * Needed only to satisfy compiler sometimes.
 *
 * @author jarekratajski
 */
public interface Valueless {

    public void call() throws Exception;
}

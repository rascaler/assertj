package io.github.rascaler.assertj.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionUtils {
    /**
     * Null-safe check if the specified collection is empty.
     * <p>
     * Null returns true.
     * </p>
     *
     * @param coll  the collection to check, may be null
     * @return true if empty or null
     * @since 3.2
     */
    public static boolean isEmpty(final Collection<?> coll) {
        return coll == null || coll.isEmpty();
    }

    /**
     * Null-safe check if the specified collection is not empty.
     * <p>
     * Null returns false.
     * </p>
     *
     * @param coll  the collection to check, may be null
     * @return true if non-null and non-empty
     * @since 3.2
     */
    public static boolean isNotEmpty(final Collection<?> coll) {
        return !isEmpty(coll);
    }

    /**
     * Returns <code>true</code> iff all elements of {@code coll2} are also contained
     * in {@code coll1}. The cardinality of values in {@code coll2} is not taken into account,
     * which is the same behavior as {@link Collection#containsAll(Collection)}.
     * <p>
     * In other words, this method returns <code>true</code> iff the
     * {@link #intersection} of <i>coll1</i> and <i>coll2</i> has the same cardinality as
     * the set of unique values from {@code coll2}. In case {@code coll2} is empty, {@code true}
     * will be returned.
     * </p>
     * <p>
     * This method is intended as a replacement for {@link Collection#containsAll(Collection)}
     * with a guaranteed runtime complexity of {@code O(n + m)}. Depending on the type of
     * {@link Collection} provided, this method will be much faster than calling
     * {@link Collection#containsAll(Collection)} instead, though this will come at the
     * cost of an additional space complexity O(n).
     * </p>
     *
     * @param coll1  the first collection, must not be null
     * @param coll2  the second collection, must not be null
     * @return <code>true</code> iff the intersection of the collections has the same cardinality
     *   as the set of unique elements from the second collection
     * @since 4.0
     */
    public static boolean containsAll(final Collection<?> coll1, final Collection<?> coll2) {
        if (coll2.isEmpty()) {
            return true;
        }
        final Iterator<?> it = coll1.iterator();
        final Set<Object> elementsAlreadySeen = new HashSet<>();
        for (final Object nextElement : coll2) {
            if (elementsAlreadySeen.contains(nextElement)) {
                continue;
            }

            boolean foundCurrentElement = false;
            while (it.hasNext()) {
                final Object p = it.next();
                elementsAlreadySeen.add(p);
                if (nextElement == null ? p == null : nextElement.equals(p)) {
                    foundCurrentElement = true;
                    break;
                }
            }

            if (!foundCurrentElement) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns <code>true</code> iff at least one element is in both collections.
     * <p>
     * In other words, this method returns <code>true</code> iff the
     * {@link #intersection} of <i>coll1</i> and <i>coll2</i> is not empty.
     * </p>
     *
     * @param <T> the type of object to lookup in <code>coll1</code>.
     * @param coll1  the first collection, must not be null
     * @param coll2  the second collection, must not be null
     * @return <code>true</code> iff the intersection of the collections is non-empty
     * @since 4.2
     * @see #intersection
     */
    public static <T> boolean containsAny(final Collection<?> coll1, @SuppressWarnings("unchecked") final T... coll2) {
        if (coll1.size() < coll2.length) {
            for (final Object aColl1 : coll1) {
                if (ArrayUtils.contains(coll2, aColl1)) {
                    return true;
                }
            }
        } else {
            for (final Object aColl2 : coll2) {
                if (coll1.contains(aColl2)) {
                    return true;
                }
            }
        }
        return false;
    }
}

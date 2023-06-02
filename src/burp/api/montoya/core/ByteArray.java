package burp.api.montoya.core;


import static burp.api.montoya.internal.ObjectFactoryLocator.FACTORY;

/**
 * This interface provides access to various methods for querying and manipulating byte arrays.
 */
public interface ByteArray extends Iterable<Byte>
{
    /**
     * Create a new {@code ByteArray}
     *
     * @return New empty {@code ByteArray}.
     */
    static ByteArray byteArray() {
        return FACTORY.byteArray();
    }

    /**
     * Create a new {@code ByteArray} that wraps the provided byte array
     *
     * @param bytes Byte array to wrap.
     * @return New {@code ByteArray} wrapping the provided byte array.
     */
    static ByteArray byteArray(byte[] bytes)
    {
        return FACTORY.byteArray(bytes);
    }

    /**
     * Create a new {@code ByteArray} from the provided UTF-8 encoded text.
     *
     * @param text UTF-8 encoded text.
     * @return New {@code ByteArray} holding a copy of the text as UTF-8 encoded bytes.
     */
    static ByteArray byteArray(String text)
    {
        return FACTORY.byteArray(text);
    }

    /**
     * This method returns a byte stored at the provided index.
     *
     * @param index Index of the byte to be retrieved.
     * @return The byte at the index.
     */
    byte getByte(int index);

    /**
     * This method sets the byte at the provided index to the provided byte.
     *
     * @param index Index of the byte to be set.
     * @param b The byte to be set.
     */
    void setByte(int index, byte b);

    /**
     * This method returns all bytes.
     *
     * @return All bytes.
     */
    byte[] getBytes();

    /**
     * This method returns all bytes between the start index (inclusive) and the end index (exclusive).
     *
     * @param startIndexInclusive The inclusive start index of retrieved range.
     * @param endIndexExclusive The exclusive end index of retrieved range.
     * @return All bytes in the specified range.
     */
    byte[] getBytes(int startIndexInclusive, int endIndexExclusive);

    /**
     * This method returns all bytes in the specified range.
     *
     * @param range The {@link Range} of bytes to be returned.
     * @return All bytes in the specified range.
     */
    byte[] getBytes(Range range);

    /**
     * This method sets bytes starting at the specified index to the provided bytes.
     *
     * @param index The index of the first byte to set.
     * @param bytes The bytes to be set.
     */
    void setBytes(int index, byte[] bytes);

    /**
     * This method sets bytes starting at the specified index to the provided bytes.
     *
     * @param index The index of the first byte to set.
     * @param byteArray The {@code ByteArray} object holding the provided bytes.
     */
    void setBytes(int index, ByteArray byteArray);

    /**
     * This method appends the provided byte.
     *
     * @param b The byte to be appended.
     */
    void append(byte b);

    /**
     * This method appends the provided bytes.
     *
     * @param bytes The bytes to append.
     */
    void append(byte[] bytes);

    /**
     * This method appends the provided text as UTF-8 encoded bytes.
     *
     * @param text The UTF-8 encoded string to append.
     */
    void append(String text);

    /**
     * This method appends the provided bytes.
     *
     * @param byteArray The bytes to append.
     */
    void append(ByteArray byteArray);

    /**
     * This method returns the number of bytes stored in the {@code ByteArray}.
     *
     * @return Length of the {@code ByteArray}.
     */
    int length();

    /**
     * Create a deep copy of the {@code ByteArray}
     *
     * @return New {@code ByteArray} with a deep copy of the wrapped bytes.
     */
    ByteArray copy();

    /**
     * This method searches the data in the ByteArray for the first occurrence of a specified term.
     * It works on byte-based data in a way that is similar to the way the native Java method {@link String#indexOf(String)} works on String-based data.
     *
     * @param searchTerm The value to be searched for.
     * @return The offset of the first occurrence of the pattern within the specified bounds, or -1 if no match is found.
     */
    default int indexOf(byte[] searchTerm)
    {
        return indexOf(searchTerm, true, 0, length());
    }

    /**
     * This method searches the data in the ByteArray for the first occurrence of a specified term.
     * It works on byte-based data in a way that is similar to the way the native Java method {@link String#indexOf(String)} works on String-based data.
     *
     * @param searchTerm The value to be searched for.
     * @return The offset of the first occurrence of the pattern within the specified bounds, or -1 if no match is found.
     */
    default int indexOf(String searchTerm)
    {
        return indexOf(searchTerm, true, 0, length());
    }

    /**
     * This method searches the data in the ByteArray for the first occurrence of a specified term.
     * It works on byte-based data in a way that is similar to the way the native Java method {@link String#indexOf(String)} works on String-based data.
     *
     * @param searchTerm    The value to be searched for.
     * @param caseSensitive Flags whether the search is case-sensitive.
     * @return The offset of the first occurrence of the pattern within the specified bounds, or -1 if no match is found.
     */
    default int indexOf(byte[] searchTerm, boolean caseSensitive)
    {
        return indexOf(searchTerm, caseSensitive, 0, length());
    }

    /**
     * This method searches the data in the ByteArray for the first occurrence of a specified term.
     * It works on byte-based data in a way that is similar to the way the native Java method {@link String#indexOf(String)} works on String-based data.
     *
     * @param searchTerm    The value to be searched for.
     * @param caseSensitive Flags whether the search is case-sensitive.
     * @return The offset of the first occurrence of the pattern within the specified bounds, or -1 if no match is found.
     */
    default int indexOf(String searchTerm, boolean caseSensitive)
    {
        return indexOf(searchTerm, caseSensitive, 0, length());
    }

    /**
     * This method searches the data in the ByteArray for the first occurrence of a specified term.
     * It works on byte-based data in a way that is similar to the way the native Java method {@link String#indexOf(String)} works on String-based data.
     *
     * @param searchTerm    The value to be searched for.
     * @param caseSensitive Flags whether the search is case-sensitive.
     * @param startIndexInclusive The inclusive start index for the search.
     * @param endIndexExclusive The exclusive end index for the search.
     * @return The offset of the first occurrence of the pattern within the specified bounds, or -1 if no match is found.
     */
    int indexOf(byte[] searchTerm, boolean caseSensitive, int startIndexInclusive, int endIndexExclusive);

    /**
     * This method searches the data in the ByteArray for the first occurrence of a specified term.
     * It works on byte-based data in a way that is similar to the way the native Java method {@link String#indexOf(String)} works on String-based data.
     *
     * @param searchTerm    The value to be searched for.
     * @param caseSensitive Flags whether the search is case-sensitive.
     * @param startIndexInclusive The inclusive start index for the search.
     * @param endIndexExclusive The exclusive end index for the search.
     * @return The offset of the first occurrence of the pattern within the specified bounds, or -1 if no match is found.
     */
    int indexOf(String searchTerm, boolean caseSensitive, int startIndexInclusive, int endIndexExclusive);

    /**
     * This method searches the data in the ByteArray and counts all matches for a specified term.
     *
     * @param searchTerm The value to be searched for.
     * @return The count of all matches of the pattern
     */
    default int countMatches(byte[] searchTerm)
    {
        return countMatches(searchTerm, true, 0, length());
    }

    /**
     * This method searches the data in the ByteArray and counts all matches for a specified term.
     *
     * @param searchTerm The value to be searched for.
     * @return The count of all matches of the pattern
     */
    default int countMatches(String searchTerm)
    {
        return countMatches(searchTerm, true, 0, length());
    }

    /**
     * This method searches the data in the ByteArray and counts all matches for a specified term.
     *
     * @param searchTerm    The value to be searched for.
     * @param caseSensitive Flags whether the search is case-sensitive.
     * @return The count of all matches of the pattern
     */
    default int countMatches(byte[] searchTerm, boolean caseSensitive)
    {
        return countMatches(searchTerm, caseSensitive, 0, length());
    }

    /**
     * This method searches the data in the ByteArray and counts all matches for a specified term.
     *
     * @param searchTerm    The value to be searched for.
     * @param caseSensitive Flags whether the search is case-sensitive.
     * @return The count of all matches of the pattern
     */
    default int countMatches(String searchTerm, boolean caseSensitive)
    {
        return countMatches(searchTerm, caseSensitive, 0, length());
    }

    /**
     * This method searches the data in the ByteArray and counts all matches for a specified term.
     *
     * @param searchTerm    The value to be searched for.
     * @param caseSensitive Flags whether the search is case-sensitive.
     * @param startIndexInclusive The inclusive start index for the search.
     * @param endIndexExclusive The exclusive end index for the search.
     * @return The count of all matches of the pattern within the specified bounds
     */
    int countMatches(byte[] searchTerm, boolean caseSensitive, int startIndexInclusive, int endIndexExclusive);

    /**
     * This method searches the data in the ByteArray and counts all matches for a specified term.
     *
     * @param searchTerm    The value to be searched for.
     * @param caseSensitive Flags whether the search is case-sensitive.
     * @param startIndexInclusive The inclusive start index for the search.
     * @param endIndexExclusive The exclusive end index for the search.
     * @return The count of all matches of the pattern within the specified bounds
     */
    int countMatches(String searchTerm, boolean caseSensitive, int startIndexInclusive, int endIndexExclusive);

    /**
     * This method can be used to convert the bytes of the ByteArray into UTF-8 encoded String form.
     *
     * @return The converted data in UTF-8 encoding.
     */
    @Override
    String toString();
}


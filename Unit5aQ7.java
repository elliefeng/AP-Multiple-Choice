public class Unit5aQ7
{
    public boolean substringFound(String phrase, String key, int index)
    {
        String part = phrase.substring(index, index + key.length());
        return part.equals(key);
}
}
//index must be greater than or equal to zero because a String has indexes that are greater than or equal to 0
//index + key.length must be smaller than phrase.length otherwise the substring key wouldn't fit in the string

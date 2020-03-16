package com.sixt.platform.interview;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AnagramTest {
    private Anagram anagram = new Anagram();

    @Test(expected = NullPointerException.class)
    public void testStringIsNull() {
        anagram.isAnagram("1", null);
    }

    @Test
    public void testNotEqualLength() {
        assertThat(anagram.isAnagram("1", "")).isFalse();
    }

    @Test
    public void testMoreTimes() {
        assertThat(anagram.isAnagram("123", "122")).isFalse();
    }

    @Test
    public void testNotPresentChar() {
        assertThat(anagram.isAnagram("123", "124")).isFalse();
    }

    @Test
    public void testSuccessCharactersAppearsOnce() {
        assertThat(anagram.isAnagram("12345", "54213")).isTrue();
    }

    @Test
    public void testSuccessExample() {
        assertThat(anagram.isAnagram("nagaram", "anagram")).isTrue();
    }
}

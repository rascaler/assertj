package io.github.rascaler.assertj.core.base;


import io.github.rascaler.assertj.util.CharUtils;

public class CharacterAssert extends AbstractCharacterAssert<CharacterAssert> {

    public CharacterAssert(Character b) {
        super(b, CharacterAssert.class);
    }

    public CharacterAssert isLowerCase() {
        if (this.passed) {
            return myself;
        }
        this.passed = this.actual >= 'a' && this.actual <= 'z';
        return myself;
    }

    public CharacterAssert isUpperCase() {
        if (this.passed) {
            return myself;
        }
        this.passed = this.actual >= 'A' && this.actual <= 'Z';
        return myself;
    }

    public CharacterAssert isAscii() {
        if (this.passed) {
            return myself;
        }
        this.passed = CharUtils.isAscii(this.actual);
        return myself;
    }
}

package com.orange.meeting.dao.data;

public enum SexType {

    MALE(1),
    FEMALE(2);

    private final int value;

    SexType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static SexType findByValue(int value) {
        for (SexType sexType : SexType.values()) {
            if (sexType.value == value) {
                return sexType;
            }
        }
        throw new IllegalArgumentException("Unknown SexType for " + value);
    }
}

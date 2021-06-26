package com.orange.meeting.dao.data;

public enum RoleType {

    TEACHER(1),
    STUDENT(2);

    private final int value;

    RoleType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static RoleType findByValue(int value) {
        for (RoleType roleType : RoleType.values()) {
            if (roleType.value == value) {
                return roleType;
            }
        }
        throw new IllegalArgumentException("Unknown RoleType for " + value);
    }
}

package io.xlate.edi.stream;

import io.xlate.edi.stream.EDIStreamConstants.Events;

public enum EDIStreamValidationError {
    NONE(-1, -1),

    UNRECOGNIZED_SEGMENT_ID(Events.SEGMENT_ERROR, 100),
    UNEXPECTED_SEGMENT(Events.SEGMENT_ERROR, 101),
    MANDATORY_SEGMENT_MISSING(Events.SEGMENT_ERROR, 102),
    LOOP_OCCURS_OVER_MAXIMUM_TIMES(Events.SEGMENT_ERROR, 103),
    SEGMENT_EXCEEDS_MAXIMUM_USE(Events.SEGMENT_ERROR, 104),
    SEGMENT_NOT_IN_DEFINED_TRANSACTION_SET(Events.SEGMENT_ERROR, 105),
    SEGMENT_NOT_IN_PROPER_SEQUENCE(Events.SEGMENT_ERROR, 106),
    SEGMENT_HAS_DATA_ELEMENT_ERRORS(Events.SEGMENT_ERROR, 107),

    REQUIRED_DATA_ELEMENT_MISSING(Events.ELEMENT_OCCURRENCE_ERROR, 150),
    CONDITIONAL_REQUIRED_DATA_ELEMENT_MISSING(Events.ELEMENT_OCCURRENCE_ERROR, 151),
    TOO_MANY_DATA_ELEMENTS(Events.ELEMENT_OCCURRENCE_ERROR, 152),
    EXCLUSION_CONDITION_VIOLATED(Events.ELEMENT_OCCURRENCE_ERROR, 153),
    TOO_MANY_REPETITIONS(Events.ELEMENT_OCCURRENCE_ERROR, 154),
    TOO_MANY_COMPONENTS(Events.ELEMENT_OCCURRENCE_ERROR, 155),

    DATA_ELEMENT_TOO_SHORT(Events.ELEMENT_DATA_ERROR, 180),
    DATA_ELEMENT_TOO_LONG(Events.ELEMENT_DATA_ERROR, 181),
    INVALID_CHARACTER_DATA(Events.ELEMENT_DATA_ERROR, 182),
    INVALID_CODE_VALUE(Events.ELEMENT_DATA_ERROR, 183),
    INVALID_DATE(Events.ELEMENT_DATA_ERROR, 184),
    INVALID_TIME(Events.ELEMENT_DATA_ERROR, 185);

    private int category;
    private int code;

    private EDIStreamValidationError(int category, int code) {
        this.category = category;
        this.code = code;
    }

    public int getCategory() {
        return category;
    }

    public int getCode() {
        return code;
    }
}
